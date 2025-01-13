package com.citi.cms_lib.controller;

import com.citi.cms_lib.service.CmsBaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


@RestController
public abstract class CmsBaseController<T, Id extends Serializable, D> {

    private final CmsBaseService<T, Id> cmsBaseService;

    protected CmsBaseController(CmsBaseService<T, Id> cmsBaseService) {
        this.cmsBaseService = cmsBaseService;
    }

    // Create or Update an entity
    @PostMapping
    public ResponseEntity<D> createOrUpdateEntity(@RequestBody D dto, Class<T> entityClass, Class<D> dtoClass) {
        T entity = cmsBaseService.convertToEntity(dto, entityClass);
        T savedEntity = cmsBaseService.save(entity);
        D savedDto = cmsBaseService.convertToDto(savedEntity, dtoClass);
        return new ResponseEntity<>(savedDto, HttpStatus.CREATED);
    }

    // Get an entity by its ID
    @GetMapping("/{id}")
    public ResponseEntity<D> getEntityById(@PathVariable Id id, Class<D> dtoClass) {
        Optional<T> entity = cmsBaseService.findById(id);
        if (entity.isPresent()) {
            D dto = cmsBaseService.convertToDto(entity.get(), dtoClass);
            return new ResponseEntity<>(dto, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Get all entities
    @GetMapping
    public ResponseEntity<List<D>> getAllEntities(Class<D> dtoClass) {
        List<T> entities = cmsBaseService.findAll();
        List<D> dtos = cmsBaseService.convertToDtoList(entities, dtoClass);
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    // Delete an entity by its ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable Id id) {
        Optional<T> entity = cmsBaseService.findById(id);
        if (entity.isPresent()) {
            cmsBaseService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Get all entities with pagination
    @GetMapping("/paged")
    public ResponseEntity<Page<D>> getAllEntitiesPaged(Pageable pageable, Class<D> dtoClass) {
        Page<D> page = cmsBaseService.findAll(pageable, dtoClass);
        return ResponseEntity.ok(page);
    }
}