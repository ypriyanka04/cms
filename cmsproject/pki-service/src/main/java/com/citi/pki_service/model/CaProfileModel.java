package com.citi.pki_service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CaProfileModel - DTO class for CAProfile entity.
 */

@Getter
@Setter
@NoArgsConstructor
public class CaProfileModel{
    @Setter
    private int caProfileId;
    private String name;
    private String description;
    private String caType;
    private String url;
    private String authType;
    private String userId;
    private String password;
    private int authCertificate;
    private int clientAuthKey;
    private String status;
    private String customField1;
    private String customField2;
    private String customField3;
    private String customField4;
    private String customField5;
    private byte[] customBinaryField1;
    private byte[] customBinaryField2;
    private byte[] customBinaryField3;
    private byte[] customBinaryField4;
    private byte[] customBinaryField5;

}
