package com.joel.crud.controller;


import com.joel.crud.model.SchoolCreateDTO;
import com.joel.crud.model.SchoolResultDTO;
import com.joel.crud.service.SchoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Slf4j
@RestController
@CrossOrigin("http://localhost:3000/signup")
@RequestMapping(value = "api/v1/school", produces = MediaType.APPLICATION_JSON_VALUE)
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }



    @PostMapping("save")
    public void signIn(@RequestBody SchoolCreateDTO schoolCreateDTO){
        schoolService.save(schoolCreateDTO);
    }

    @PutMapping("edit")
    public ResponseEntity<SchoolResultDTO> edit(@RequestBody SchoolCreateDTO schoolCreateDTO){
        return ResponseEntity.ok(schoolService.update(schoolCreateDTO));
    }

    @GetMapping("getAllSchools")
    public List<SchoolResultDTO> getAllSchools(){
        return schoolService.findAll();
    }

    @GetMapping("getSchoolById/{id}")
    public SchoolResultDTO getSchoolById(@RequestParam Long id){
        return schoolService.findById(id);
    }

    @DeleteMapping("delete/{Id}")
    public void deleteSchool(@PathVariable Long Id){
        schoolService.deleteSchoolById(Id);
    }

}
