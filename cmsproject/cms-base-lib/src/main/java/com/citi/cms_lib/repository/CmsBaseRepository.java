package com.citi.cms_lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CmsBaseRepository<T,Id extends Serializable> extends JpaRepository<T, Id>{
    default String getMessage() {
        return "Hello from CMS Library Repository!";
    }
}
