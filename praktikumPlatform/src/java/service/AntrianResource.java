/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.AntrianHelper;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Antrian;

/**
 * REST Web Service
 *
 * @author clara
 */
@Path("antrian")
public class AntrianResource {

   @Context
    private UriInfo context;

    /**
     * Creates a new instance of AntrianResource
     */
    public AntrianResource() {
    }

    /**
     * Retrieves representation of an instance of services.AntrianResource
     *
     * @return an instance of java.lang.String
     */
    @GET
   @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        AntrianHelper k = new AntrianHelper();
        Gson g = new Gson();
                return Response.status(Response.Status.OK)
       .entity(g.toJson(k.getAllAntrian()))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "20")
                .header("Access-Preflight-Maxage", "20")
                .build();
    }

    /**
     * PUT method for updating or creating an instance of AntrianResource
     *
     * @param content representation for the resource
     */
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void putJson(String content) {
//    }
    @POST
    @Path("addAntrian")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNewPasien(String data) {
        Gson gson = new Gson();
        Antrian antrian = gson.fromJson(data, Antrian.class);
        AntrianHelper helper = new AntrianHelper();
        helper.addNewAntrian(
                antrian.getTanggal(),
                antrian.getNoRm(),
                antrian.getNama(),
                antrian.getAlamat(),
                antrian.getNamaKlinik()
        );
        return Response
                .status(200)
                .entity(antrian)
                .build();
}
}