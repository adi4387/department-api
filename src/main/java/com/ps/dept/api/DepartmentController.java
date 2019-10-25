package com.ps.dept.api;

import java.util.List;

import com.ps.dept.util.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.dept.dto.Department;
import com.ps.dept.service.DepartmentService;

@RestController
@RequestMapping("department-api")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@Autowired
	GlobalProperties globalProperties;

	@GetMapping("/email-id")
	public String getEmailId() {
		return globalProperties.email;
	}

	@GetMapping("/")
	public List<Department> getDepartments() {
		return departmentService.getDepartments();
	}

	@GetMapping("/{id}")
	public Department getDepartments(@PathVariable Integer id) {
		return departmentService.getDepartments(id);
	}

	@PostMapping("/")
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartments(department);
	}

	@PutMapping("/")
	public Department getDepartments(@RequestBody Department department) {
		return departmentService.updateDepartment(department);
	}
}
