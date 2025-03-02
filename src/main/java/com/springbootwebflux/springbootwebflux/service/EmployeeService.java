package com.springbootwebflux.springbootwebflux.service;

import com.springbootwebflux.springbootwebflux.dto.EmployeeDto;
import com.springbootwebflux.springbootwebflux.entirty.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    public Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto);

    public Flux<EmployeeDto> getAllEmployy();

    public Mono<Employee> getEmployeeById(String Id);

    public Mono<EmployeeDto> updateEmployee(String id, EmployeeDto employeeDto);

    public Mono<Void> deleteEmployeeById(String id);
}
