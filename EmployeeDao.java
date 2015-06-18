package com.test.restservice;

import com.test.restservice.Employee;

public class EmployeeDao 
{
	
	public Employee getEmployeeDetails(String employeeId)
	{
		Employee emp = new Employee();
		emp.setDateOfJoining("01-02-2001");
		emp.setDepartment("IT");
		emp.setEmail("test@test.com");
		emp.setEmployeeId("123");
		emp.setFirstName("John");
		emp.setLastName("Taylor");
		return emp;
	}
	
	public String getFragment(String type)
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("<input type=").append("password\"");
		buffer.append("size=\"20\"").append("value=\"\"");
		buffer.append("/>");
		return buffer.toString();
	}

}
