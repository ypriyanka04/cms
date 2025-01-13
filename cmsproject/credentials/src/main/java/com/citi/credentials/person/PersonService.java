package com.citi.credentials.person;

import com.citi.cms_lib.repository.CmsBaseRepository;
import com.citi.cms_lib.service.CmsBaseService;
import com.citi.cms_model.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("caProfileService")
@Primary
public class PersonService extends CmsBaseService<Person, Integer>{

    @Autowired
    public PersonService(CmsBaseRepository<Person, Integer> cmsBaseRepository){
        super(cmsBaseRepository, new org.modelmapper.ModelMapper());
    }

}
