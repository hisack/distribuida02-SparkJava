package com.programacion;

import com.programacion.handler.HandlerRequest;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

import static spark.Spark.*;

public class Principal
 {
     public static void main(String[] args) {
         SeContainer container = SeContainerInitializer
                 .newInstance()
                 .initialize();
         Instance<HandlerRequest> obj =container.select(HandlerRequest.class);
         HandlerRequest servicio = obj.get();
         port(8080);
         staticFiles.location("/public");
         get("/sumar", servicio::handleSumar);
         get("/hello", (req, res)->"Hello World");
         }
     }

