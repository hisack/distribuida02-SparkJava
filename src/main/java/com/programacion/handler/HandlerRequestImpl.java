package com.programacion.handler;

import com.programacion.servicios.Operaciones;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import spark.Request;
import spark.Response;
@ApplicationScoped
public class HandlerRequestImpl implements HandlerRequest {
  @Inject
  Operaciones servicio;
  public Object handleSumar (Request request, Response response) throws Exception {
    String _x = request.queryParams("x");
    String _y = request.queryParams("y");
    Integer ret = servicio.sumar(Integer.valueOf(_x), Integer.valueOf(_y));
    StringBuilder sb = new StringBuilder();
    sb.append("<html>");
    sb.append("<head/>");
    sb.append("<body>");
    sb.append("<b>La suma es: </b>").append(ret);
    sb.append("<body>");
    sb.append("</html>");
    return sb.toString();
  }
}
