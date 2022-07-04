package com.programacion.servicios;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class OperacionesImpl implements Operaciones {
   // @Inject
   // private ServicioLog logger;

    @Override
    public int sumar (int x, int y){
        return  x+y;
    }
/*
    @PostConstruct
    void init(){
        logger.log("*************OperacionesImpl::init");

    }

    @PreDestroy
    void destroy(){
        logger.log("*************OperacionesImpl::destroy");

    }
*/

}
