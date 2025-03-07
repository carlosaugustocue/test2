package com.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("hola")  // Ruta base -> http://localhost:8080/api/hola
public class HolaResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String saludar() {
        return "¡Hola, mundo esto es una prueba!";
    }

    @GET
    @Path("sumar")
    @Produces(MediaType.TEXT_PLAIN)
    public String sumar(@QueryParam("a") int a, @QueryParam("b") int b) {
        int resultado = a + b;
        return "La suma de " + a + " y " + b + " es: " + resultado;
    }
}
