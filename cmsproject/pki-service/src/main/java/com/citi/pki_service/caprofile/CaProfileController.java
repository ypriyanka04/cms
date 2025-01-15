package com.citi.pki_service.caprofile;

import com.citi.cms_lib.controller.CmsBaseController;
import com.citi.cms_lib.service.CmsBaseService;
import com.citi.cms_model.entity.CaProfile;
import com.citi.pki_service.model.CaProfileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/caprofile")
public class CaProfileController extends CmsBaseController<CaProfile,Integer,CaProfileModel>{

    @Autowired
    public CaProfileController(CmsBaseService<CaProfile, Integer> cmsBaseService) {
        super(cmsBaseService);
    }

}
