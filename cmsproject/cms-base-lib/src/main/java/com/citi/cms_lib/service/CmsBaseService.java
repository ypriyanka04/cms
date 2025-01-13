package com.citi.cms_lib.service;

import com.citi.cms_lib.repository.CmsBaseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CmsBaseService<T, Id extends Serializable> {

    private final CmsBaseRepository<T, Id> cmsBaseRepository;
    private final ModelMapper modelMapper;

    public CmsBaseService(CmsBaseRepository<T, Id> cmsBaseRepository, ModelMapper modelMapper) {
        this.cmsBaseRepository = cmsBaseRepository;
        this.modelMapper = modelMapper;
    }

    // Save or Update an entity
    public T save(T entity) {
        return cmsBaseRepository.save(entity);
    }

    // Find an entity by its ID
    public Optional<T> findById(Id id) {
        return cmsBaseRepository.findById(id);
    }

    // Find all entities
    public List<T> findAll() {
        return cmsBaseRepository.findAll();
    }

    // Delete an entity by its ID
    public void deleteById(Id id) {
        cmsBaseRepository.deleteById(id);
    }

    // Find all entities with pagination
    public Page<T> findAll(Pageable pageable) {
        return cmsBaseRepository.findAll(pageable);
    }

    // Convert an entity to a DTO
    public <D> D convertToDto(T entity, Class<D> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }

    // Convert a list of entities to a list of DTOs
    public <D> List<D> convertToDtoList(List<T> entities, Class<D> dtoClass) {
        return entities.stream()
                .map(entity -> modelMapper.map(entity, dtoClass))
                .collect(Collectors.toList());
    }

    // Convert a DTO to an entity
    public <D> T convertToEntity(D dto, Class<T> entityClass) {
        return modelMapper.map(dto, entityClass);
    }

    // Find all entities with pagination and convert to DTOs
    public <D> Page<D> findAll(Pageable pageable, Class<D> dtoClass) {
        return cmsBaseRepository.findAll(pageable)
                .map(entity -> modelMapper.map(entity, dtoClass));
    }
}