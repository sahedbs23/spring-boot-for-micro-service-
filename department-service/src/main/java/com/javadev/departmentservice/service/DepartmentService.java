package com.javadev.departmentservice.service;

import com.javadev.departmentservice.entity.Department;
import com.javadev.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DepartmentService {
    private DepartmentRepository repository;

    @Autowired
    public void DepartmentRepository(DepartmentRepository departmentRepository){
        repository = departmentRepository;
    }

    public Department createDepartment(DepartmentDto dto){
        repository.save(dto);
    }
}
