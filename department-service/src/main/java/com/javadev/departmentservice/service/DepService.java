package com.javadev.departmentservice.service;

import com.javadev.departmentservice.dto.DepartmentDto;
import com.javadev.departmentservice.entity.Department;
import com.javadev.departmentservice.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DepService {

    private DepartmentRepository repository;

    @Transactional
    public DepartmentDto saveDepartment(DepartmentDto departmentDto){
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );

        Department saveDepartment =  this.repository.save(department);

        return new DepartmentDto(
                saveDepartment.getId(),
                saveDepartment.getDepartmentName(),
                saveDepartment.getDepartmentDescription(),
                saveDepartment.getDepartmentCode()
        );
    }
}
