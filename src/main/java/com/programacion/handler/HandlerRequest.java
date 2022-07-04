package com.programacion.handler;

import spark.Request;
import spark.Response;

public interface HandlerRequest {
  Object handleSumar (Request request, Response response) throws Exception;
}
