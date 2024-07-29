package com.codingshuttle.prakash.week1Intro.introductionToSprintBoot.controllers;

import com.codingshuttle.prakash.week1Intro.introductionToSprintBoot.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path="/parent")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//
//        return "secret message: iuytreg7r6g";
//    }

    @GetMapping(path = "/employees/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){

        return new EmployeeDTO(employeeId, "Jay", "jay@gmail.com", 27, LocalDate.of(2024, 3,23 ),true);
    }

    @GetMapping(path = "/employees")
    public String getEmployees(@RequestParam(required = false) Integer age,
                                    @RequestParam(required = false) String sortBy){

        return "Hey there!!"+age+" "+sortBy;
    }
}
