
package com.mycompany.apiproxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam; 
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

//http://localhost:49000/api/weather/Dublin

@Path("/weather") 
public class ApiProxyWeather {
  
static String key = "c1713db65b9da368ebd8f4f798da51c0";

@GET
@Path("/{param}")
public Response getWeather(@PathParam("param") String city) { 

Client client = ClientBuilder.newClient();

String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + key;

Response response = client.target(url).request().get();

return response;

}

}
