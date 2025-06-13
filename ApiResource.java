package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@Path("/api")
public class ApiResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World");
        response.put("status", "success");
        return response;
    }

    @GET
    @Path("/soma")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> calcularSoma() {
        Random random = new Random();
        int numero1 = random.nextInt(100) + 1; // números de 1 a 100
        int numero2 = random.nextInt(100) + 1; // números de 1 a 100
        int soma = numero1 + numero2;
        
        Map<String, Object> response = new HashMap<>();
        response.put("numero1", numero1);
        response.put("numero2", numero2);
        response.put("soma", soma);
        response.put("operacao", numero1 + " + " + numero2 + " = " + soma);
        
        return response;
    }
}

