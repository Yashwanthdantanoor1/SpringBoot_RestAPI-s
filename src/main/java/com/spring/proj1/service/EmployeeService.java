package com.spring.proj1.service;

import java.util.List;

import com.spring.proj1.model.employeemodel;

public interface EmployeeService {
    List<employeemodel> getEmployee();

    employeemodel saveemployee(employeemodel employee);

    employeemodel getsingleemployee(Long id);

    void deleteemployee(Long id);

    employeemodel updateemployee(employeemodel employee);

}
