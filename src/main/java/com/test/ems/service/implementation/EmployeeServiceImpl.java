package com.test.ems.service.implementation;


import com.test.ems.dto.EmployeeDto;
import com.test.ems.entity.Employee;
import com.test.ems.mappers.EmployeeMapper;
import com.test.ems.repository.EmployeeRepository;
import com.test.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}