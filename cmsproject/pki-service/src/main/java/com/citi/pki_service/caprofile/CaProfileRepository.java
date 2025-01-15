package com.citi.pki_service.caprofile;

import com.citi.cms_lib.repository.CmsBaseRepository;
import com.citi.cms_model.entity.CaProfile;
import org.springframework.stereotype.Repository;

@Repository
public interface CaProfileRepository extends CmsBaseRepository<CaProfile, Integer>{
}
