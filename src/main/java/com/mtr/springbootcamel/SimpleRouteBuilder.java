package com.mtr.springbootcamel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		from("file:/Users/muthahar/Desktop/spring/data/input?noop=true").to("file:/Users/muthahar/Desktop/spring/data/output");
		
	}
	
	
	

}
