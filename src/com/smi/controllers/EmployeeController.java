package com.smi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smi.beans.Employee;
import com.smi.service.EmployeeService;

@Controller

public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;
	
	@RequestMapping("/")
	
	public String newEmployee(Model model) {
		
		Employee emp1= new Employee();
		model.addAttribute("employee",emp1);
		return "newemployee";
	}
	@RequestMapping("/save_employee")
	
	public ModelAndView saveEmployee(@ModelAttribute("employee") Employee em) {
		
	
		String viewname="result";
		String message="";
		
		int count= employeeservice.saveEmployeeRecord(em.geteid(),em.getname(),em.getdept(), em.getdesig());
		if(count==1) {
			message="record saved succesfully";
					
		}
		else {
			message="Not able to save";
			
		}
		ModelAndView mav=new ModelAndView("result","msg",message);
		return mav;
		
	}
	
}
