package com.citi.credentials.config;

import com.citi.cms_lib.repository.CmsBaseRepository;
import com.citi.cms_model.entity.Person;
import com.citi.credentials.person.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig{

    @Bean
    public PersonService personService(CmsBaseRepository<Person, Integer> cmsBaseRepository) {
        return (PersonService) new PersonService(cmsBaseRepository);
    }
}
