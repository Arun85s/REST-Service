package com.test.restservice;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.restservice.RestService;
import com.test.restservice.EmployeeDao;

public class RestServiceImpl implements RestService 
{
	@Autowired
	private EmployeeDao employeeDao; 

	@Override
	public Response getEmployeeDetail(String employeeId) 
	{
		if(employeeId == null)
		{
			return Response.status(Response.Status.BAD_REQUEST).build();
		}		
		return Response.ok(employeeDao.getEmployeeDetails(employeeId)).build();
	}
}
