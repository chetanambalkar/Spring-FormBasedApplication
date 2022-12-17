package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/registrationform")
	public String showRegistrationForm(Model themodel) {
		
		Employee employee=new Employee();
		
		themodel.addAttribute("employeemodel", employee);
		return "Employee-Form";
	}
	
	@RequestMapping("/processform")
		
		public String processform(@ModelAttribute("employeemodel") Employee employee) {
			return "registrartion-confirmation";
		}
	}


