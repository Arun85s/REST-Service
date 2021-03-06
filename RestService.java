package com.test.restservice;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * 
 * This is interface for the employee services
 *
 */
@Path("/")
@WebService(name="employeeService", targetNamespace="http://localhost:8080/cxf-rest/example")
public interface RestService 
{
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("/getemployeedetail")
	public Response getEmployeeDetail(@QueryParam("employeeId") String employeeId);
	
	@GET
	@Produces({MediaType.TEXT_HTML,MediaType.APPLICATION_JSON})
	@Path("/getfragment")
	public Response getFragment(@QueryParam("type") String type);
	
}
