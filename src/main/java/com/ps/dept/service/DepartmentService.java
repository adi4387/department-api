package com.ps.dept.service;

import com.ps.dept.dto.Department;
import com.ps.dept.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("departmentService")
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

    public List<Department> getDepartments() {
    	List<Department> departments = new ArrayList<>();
        departmentRepository.findAll().forEach(departments::add);
        return departments;
    }

    public Department getDepartments(Integer id) {
        return departmentRepository.findOne(id);
    }

	public Department addDepartments(Department department) {
		return departmentRepository.save(department);
	}

	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}
}
