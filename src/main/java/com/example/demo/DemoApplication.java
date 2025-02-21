package com.example.demo;

import com.example.demo.travelApp.Registry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
@ComponentScan(basePackages = {"controller", "platform.webservice.map", "platform.webservice.controller.base", "platform.webservice.controller.extended"})
//@ComponentScan(basePackages = {"controller", "platform.webservice.map", "platform.webservice.controller.base"})

public class DemoApplication {
	public static void main(String[] args) {
		Registry.register();
		System.out.println("Running Application....");
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
	}
}
