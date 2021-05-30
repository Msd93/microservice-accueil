package sn.pad.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.pad.ms.configuration.ApplicationPropertiesConfiguration;

@RestController
//@RequestMapping("/hello-world")
public class HelloWorldController {

	@Autowired
	ApplicationPropertiesConfiguration appProperties;
	
	@Value("${mes-configs.nom}")
	private String valueFromFile;

	@GetMapping("/hello")
	public String helloWorld() {
		System.out.println("hello world");
		return "hello world " + appProperties.getNom() + "...";
	}
}
