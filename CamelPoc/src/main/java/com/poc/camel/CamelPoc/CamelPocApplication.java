package com.poc.camel.CamelPoc;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelPocApplication {

	public static void main(String[] args) throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:input/").to("file:output/");
			}
		});

		camelContext.start();
		Thread.sleep(10000);
		camelContext.stop();
	}

}
