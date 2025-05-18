package com.EMT.EMS.service;

import com.EMT.EMS.dto.EmployeeDto;
import com.EMT.EMS.entity.Employee;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long  employeeId);
}
