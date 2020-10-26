package com.joel.crud.service;

import com.joel.crud.model.School;
import com.joel.crud.model.SchoolCreateDTO;
import com.joel.crud.model.SchoolResultDTO;
import com.joel.crud.model.SchoolToSchoolResultsDTO;
import com.joel.crud.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolServiceImpl implements SchoolService{

    private final SchoolRepository schoolRepository;
    private final SchoolToSchoolResultsDTO toSchoolResultsDTO;

    SchoolServiceImpl(SchoolRepository schoolRepository, SchoolToSchoolResultsDTO toSchoolResultsDTO){
        this.schoolRepository = schoolRepository;
        this.toSchoolResultsDTO = toSchoolResultsDTO;
    }

//    @Override
//    public School findById(Long Id) {
//        schoolRepository.findById(Id);
//    }

//    @Override
//    public SignInResult findByCentreNumber(String centreNumber) {
//
//    }

    @Override
    public void save(SchoolCreateDTO schoolCreateDTO) {
        final School school = new School();
        school.setCentreName(schoolCreateDTO.getCentreName());
        school.setCentreNumber(schoolCreateDTO.getCentreNumber());
        school.setEmail(schoolCreateDTO.getEmail());
        school.setPassword(schoolCreateDTO.getPassword());
        school.setProvince(schoolCreateDTO.getProvince());
        school.setType(schoolCreateDTO.getType());
        schoolRepository.save(school);
    }

    @Override
    public SchoolResultDTO update(SchoolCreateDTO schoolCreateDTO){
        final School school = getOne(schoolCreateDTO.getId());
        school.setCentreName(schoolCreateDTO.getCentreName());
        school.setCentreNumber(schoolCreateDTO.getCentreNumber());
        school.setEmail(schoolCreateDTO.getEmail());
        school.setPassword(schoolCreateDTO.getPassword());
        school.setProvince(schoolCreateDTO.getProvince());
        school.setType(schoolCreateDTO.getType());
        return toSchoolResultsDTO.convert(schoolRepository.save(school));
    }

    @Override
    public SchoolResultDTO findById(Long id) {
        return toSchoolResultsDTO.convert(schoolRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product not found")));
    }

    @Override
    public List<SchoolResultDTO> findAll() {
        return schoolRepository.findAll()
                .stream()
                .map(toSchoolResultsDTO::convert)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteSchoolById(Long Id){
            schoolRepository.deleteById(Id);
    }

    @Override
    public School getOne(Long id) {
        return schoolRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product not found"));
    }

    ;




}
