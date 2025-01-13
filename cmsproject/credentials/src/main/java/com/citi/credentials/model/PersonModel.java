package com.citi.credentials.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Data Transfer Object for Person entity.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonModel {
    private Integer personId;
    private String uuid;
    private String username;
    private String password;
    private String cellPhone;
    private LocalDate dateOfBirth;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String homePhone;
    private String emailId;
    private String alternateEmailId;
    private String ssn;
    private String emergencyContactName;
    private String emergencyContactRelationship;
    private String emergencyContactEmail;
    private String emergencyContactPhone;
    private String communicationPreference;
    private String ethnicity;
    private String maritalStatus;
    private String cityOfBirth;
    private String countryOfBirth;
    private String countryOfCitizenship;
    private String countryOfEnrollment;
    private String jurisdiction;
    private int credentialProfileId;
    private String status;
}