package com.mohammad.RestClient;

import java.net.URI;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;




import com.sun.security.ntlm.Client;

public class ClientTest {
	public static void main(String[] args){
		 ClientConfig config = new ClientConfig();  
		    javax.ws.rs.client.Client client = ClientBuilder.newClient(config); 
		WebTarget target= client.target(getBaseURI());
		  System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class));  
		    System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class));  
		    System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class));  
		  }  
		  private static URI getBaseURI() {  
		    //here server is running on 8086 port number and project name is restfuljersey  
		    return UriBuilder.fromUri("http://localhost:8086/FirstRestfulwebservices").build();  
		  }  
	

}
