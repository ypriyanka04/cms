package com.citi.pki_service.config;

import com.citi.cms_lib.repository.CmsBaseRepository;
import com.citi.cms_model.entity.CaProfile;
import com.citi.pki_service.caprofile.CaProfileRepository;
import com.citi.pki_service.caprofile.CaProfileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig{

    @Bean
    public CaProfileService caProfileService(CmsBaseRepository<CaProfile, Integer> cmsBaseRepository) {
        return (CaProfileService) new CaProfileService(cmsBaseRepository);
    }
}
