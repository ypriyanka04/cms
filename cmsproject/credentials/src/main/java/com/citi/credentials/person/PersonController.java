package com.citi.credentials.person;

import com.citi.cms_lib.controller.CmsBaseController;
import com.citi.cms_lib.service.CmsBaseService;
import com.citi.cms_model.entity.Person;
import com.citi.credentials.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cms/person")
public class PersonController extends CmsBaseController<Person,Integer, PersonModel>{

    @Autowired
    public PersonController(CmsBaseService<Person, Integer> cmsBaseService) {
        super(cmsBaseService);
    }

}
