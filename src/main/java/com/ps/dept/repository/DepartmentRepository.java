package com.ps.dept.repository;

import org.springframework.data.repository.CrudRepository;

import com.ps.dept.dto.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{
	
}
