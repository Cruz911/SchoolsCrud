package com.joel.crud.model;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SchoolToSchoolResultsDTO implements Converter<School, SchoolResultDTO> {

    @Override
    public SchoolResultDTO convert(School school) {
        SchoolResultDTO resultDTO = new SchoolResultDTO();
        resultDTO.setCentreName(school.getCentreName());
        resultDTO.setCentreNumber(school.getCentreNumber());
        resultDTO.setEmail(school.getEmail());
        resultDTO.setPassword(school.getPassword());
        resultDTO.setProvince(school.getProvince());
        resultDTO.setType(school.getType());
        return resultDTO;
    }
}
