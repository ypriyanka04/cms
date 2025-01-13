package com.citi.credentials.person;

import com.citi.cms_lib.repository.CmsBaseRepository;
import com.citi.cms_model.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CmsBaseRepository<Person, Integer>{
}
