package sn.pad.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PadMsHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadMsHelloworldApplication.class, args);
	}

}
