package com.spring.proj1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.proj1.model.employeemodel;
import com.spring.proj1.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class employeecontroller {

    @Autowired
    private EmployeeService es;
    
    @GetMapping("/employees")
	public List<employeemodel> getEmployees() {
		return es.getEmployee();
		}
        @GetMapping("/employees/{id}")
        public employeemodel getEmployee(@PathVariable Long id) {
            return es.getsingleemployee(id);
        }
        
        @PostMapping("/employees")
        public employeemodel saveEmployee(@Valid @RequestBody employeemodel employee) {
            return es.saveemployee(employee);
        }

        @DeleteMapping("/employees")
        public void deleteEmployee(@RequestParam Long id) {
            es.deleteemployee(id);
        }
        @PutMapping("/employees/{id}")
        public employeemodel updateemployee(@PathVariable Long id,@Valid @RequestBody employeemodel employee) {
            employee.setId(id);
            return es.updateemployee(employee);
        }

}