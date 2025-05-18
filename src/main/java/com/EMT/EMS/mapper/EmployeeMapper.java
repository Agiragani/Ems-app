package com.EMT.EMS.mapper;

import com.EMT.EMS.dto.EmployeeDto;
import com.EMT.EMS.entity.Employee;


public class EmployeeMapper {

public static EmployeeDto mapToEmployeeDto(Employee employee){

    return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail(),
            employee.getSalary()
    );
}

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getSalary()
        );
    }

}
