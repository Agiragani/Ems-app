package com.EMT.EMS.controller;

import com.EMT.EMS.dto.EmployeeDto;
import com.EMT.EMS.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    //build add employee rest api
@PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
    EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
    return  new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
}


// build get employee rest api with id

@GetMapping ("{id}")
    public ResponseEntity<EmployeeDto> getEmployeebyId(@PathVariable("id") Long employeeId){
    EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
    return  ResponseEntity.ok(employeeDto);
    }

}
