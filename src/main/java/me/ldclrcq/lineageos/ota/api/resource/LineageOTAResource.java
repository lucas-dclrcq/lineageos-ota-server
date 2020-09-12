package me.ldclrcq.lineageos.ota.api.resource;

import me.ldclrcq.lineageos.ota.domain.service.FileService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LineageOTAResource {

    @Inject
    FileService fileService;

    @Path("/{device}/{romType}/{incrementalVersion}")
    public Response getBuilds(
            @PathParam("device") String device,
            @PathParam("romType") String romType,
            @PathParam("incrementalVersion") String incrementalVersion) {
        return Response.serverError().entity("Not implemented").build();
    }

    @Path("/types/{device}")
    public Response getTypes(@PathParam("device") String device) {
        return Response.serverError().entity("Not implemented").build();
    }

    @Path("/changes/{device}")
    public Response getChanges(String device) {
        return Response.serverError().entity("Not implemented").build();
    }

    @Path("/devices")
    public Response getDevices() {
        return Response.serverError().entity("Not implemented").build();
    }
}
