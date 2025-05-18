package com.EMT.EMS.service.impl;

import com.EMT.EMS.dto.EmployeeDto;
import com.EMT.EMS.entity.Employee;
import com.EMT.EMS.exception.ResourceNotFoundException;
import com.EMT.EMS.mapper.EmployeeMapper;
import com.EMT.EMS.repository.EmployeeRepository;
import com.EMT.EMS.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service    //this tell to create spring bean to below class
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
    Employee employee = employeeRepository.findById(employeeId)
            .orElseThrow(()->
                    new ResourceNotFoundException("Employee does not exist with the given id :"+ employeeId));


        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
