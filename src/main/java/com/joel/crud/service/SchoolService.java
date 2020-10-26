package com.joel.crud.service;


import com.joel.crud.model.School;
import com.joel.crud.model.SchoolCreateDTO;
import com.joel.crud.model.SchoolResultDTO;

import java.util.List;

public interface SchoolService{
    SchoolResultDTO update(SchoolCreateDTO schoolCreateDTO);

    SchoolResultDTO findById(Long id);

    List<SchoolResultDTO> findAll();

    void deleteSchoolById(Long Id);

    School getOne(Long id);


    void save(SchoolCreateDTO schoolCreateDTO);
}