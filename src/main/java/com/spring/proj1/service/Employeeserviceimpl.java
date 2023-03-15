package com.spring.proj1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.proj1.Repository.EmployeeRepository;
import com.spring.proj1.model.employeemodel;

@Service
public class Employeeserviceimpl implements EmployeeService 
{

    //  private static List<employeemodel> list = new ArrayList<>();
    // static{
    //     employeemodel e = new employeemodel();
    //     e.setAge(30L);
    //     e.setDepartment("CSE");
    //     e.setEmail("ydantano@asu.edu");
    //     e.setLocation("ASU");
    //     e.setName("Yashwanth");
    //     list.add(e);

    //     e = new employeemodel();
    //     e.setAge(25L);
    //     e.setDepartment("SE");
    //     e.setEmail("rbasani@asu.edu");
    //     e.setLocation("ASU");
    //     e.setName("Ramya");
    //     list.add(e);
    // }

    @Autowired
    private EmployeeRepository eRep;

    @Override
    public List<employeemodel> getEmployee(){
        return eRep.findAll();
    }

    @Override
    public employeemodel saveemployee(employeemodel employee){
        return eRep.save(employee);
    }
    @Override
    public employeemodel getsingleemployee(Long id){
        Optional<employeemodel> employee = eRep.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }
        throw new RuntimeException("Employee is not found for the id");
    }

    @Override
    public void deleteemployee(Long id){
        eRep.deleteById(id);
    }

    @Override
    public employeemodel updateemployee(employeemodel employee) {
       return eRep.save(employee);
    }

}
