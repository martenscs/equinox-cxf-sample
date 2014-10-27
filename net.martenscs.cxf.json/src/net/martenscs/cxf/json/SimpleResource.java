package net.martenscs.cxf.json;

import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/number")
public interface SimpleResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	TestBean createSimpleBean();

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	TestBean roundTrip(TestBean s);

}