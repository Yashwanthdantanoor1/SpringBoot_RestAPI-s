package com.spring.proj1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.proj1.model.employeemodel;


@Repository
public interface EmployeeRepository extends JpaRepository<employeemodel, Long>{
    
}
