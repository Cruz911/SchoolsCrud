package com.joel.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolResultDTO {

    private String province;
    private String centreNumber;
    private String centreName;
    private String type;
    private String password;
    private String email;
}
