package com.joel.crud.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity(name="School")
@Table(name = "School")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "province", nullable = false)
    private String province;

    @Column(name = "centre_number", nullable = false)
    private String centreNumber;

    @Column(name = "centre_name", nullable = false)
    private String centreName;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "centre_password", nullable = false)
    private String password;

    @Column(name = "centre_email", nullable = false)
    private String email;
}
