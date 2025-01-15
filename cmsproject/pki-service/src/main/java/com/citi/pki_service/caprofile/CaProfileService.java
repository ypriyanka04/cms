package com.citi.pki_service.caprofile;

import com.citi.cms_lib.repository.CmsBaseRepository;
import com.citi.cms_lib.service.CmsBaseService;
import com.citi.cms_model.entity.CaProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service("caProfileService")
@Primary
public class CaProfileService extends CmsBaseService<CaProfile, Integer> {

    @Autowired
    public CaProfileService(CmsBaseRepository<CaProfile, Integer> cmsBaseRepository) {
        super(cmsBaseRepository, new org.modelmapper.ModelMapper()); // Inject ModelMapper here if needed
    }

    public String getServiceMessage() {
        return "Hello from PKI Service!";
    }
}
