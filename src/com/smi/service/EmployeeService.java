package com.smi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.smi.dao.EmployeeDAO;
@Component
public class EmployeeService {

	EmployeeDAO employeeDao;
	
	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao= employeeDao;
	}
	
	public int saveEmployeeRecord(int eid,String name,String dept,String desig) {
		
		return employeeDao.saveRecord(eid,name,dept,desig);
		
	}
	
}
