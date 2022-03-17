package com.smi.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	
	JdbcTemplate jdbcTemplate;
	public void  setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public int saveRecord(int eid,String name,String dept,String desig){
		
		return jdbcTemplate.update("insert into employee values(?,?,?,?)",new Object[] {eid,name,dept,desig});
	}
}
