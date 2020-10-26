package com.joel.crud.model;

import lombok.Data;



@Data
public class SchoolCreateDTO {
    private Long id;
    private String province;
    private String centreNumber;
    private String centreName;
    private String type;
    private String password;
    private String email;
}
