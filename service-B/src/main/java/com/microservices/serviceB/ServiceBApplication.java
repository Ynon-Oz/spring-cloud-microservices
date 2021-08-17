package com.microservices.serviceB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBApplication.class, args);
		System.out.println("\n" +
				"     _______. _______ .______     ____    ____  _______ .______         .______       __       _______.   .______       __    __  .__   __. .__   __.  __  .__   __.   _______ \n" +
				"    /       ||   ____||   _  \\    \\   \\  /   / |   ____||   _  \\        |   _  \\     |  |     /       |   |   _  \\     |  |  |  | |  \\ |  | |  \\ |  | |  | |  \\ |  |  /  _____|\n" +
				"   |   (----`|  |__   |  |_)  |    \\   \\/   /  |  |__   |  |_)  |       |  |_)  |    |  |    |   (----`   |  |_)  |    |  |  |  | |   \\|  | |   \\|  | |  | |   \\|  | |  |  __  \n" +
				"    \\   \\    |   __|  |      /      \\      /   |   __|  |      /        |   _  <     |  |     \\   \\       |      /     |  |  |  | |  . `  | |  . `  | |  | |  . `  | |  | |_ | \n" +
				".----)   |   |  |____ |  |\\  \\----.  \\    /    |  |____ |  |\\  \\----.   |  |_)  |    |  | .----)   |      |  |\\  \\----.|  `--'  | |  |\\   | |  |\\   | |  | |  |\\   | |  |__| | \n" +
				"|_______/    |_______|| _| `._____|   \\__/     |_______|| _| `._____|   |______/     |__| |_______/       | _| `._____| \\______/  |__| \\__| |__| \\__| |__| |__| \\__|  \\______|");
	}

}
