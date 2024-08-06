package com.codingshuttle.prakash.week1Intro.introductionToSprintBoot.controllers;

import com.codingshuttle.prakash.week1Intro.introductionToSprintBoot.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @GetMapping(path = "/getSecretMessage")
    public String getMySuperSecretMessage(){
        return "Secret Message: Jay";
    }

    @GetMapping(path = "/employees/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){

        return new EmployeeDTO(employeeId, "Jay", "jay@gmail.com", 27, LocalDate.of(2024, 3,23 ),true);
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(200L);
        return inputEmployee;
    }

    @PutMapping
    public String updateEmployeeById(){
        return "HEllo from PUT";
    }

}
