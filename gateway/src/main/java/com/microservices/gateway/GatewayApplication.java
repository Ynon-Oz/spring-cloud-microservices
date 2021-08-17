package com.microservices.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
		System.out.println("\n" +
				"  _______      ___   .___________. _______ ____    __    ____  ___   ____    ____     __       _______.   .______       __    __  .__   __. .__   __.  __  .__   __.   _______ \n" +
				" /  _____|    /   \\  |           ||   ____|\\   \\  /  \\  /   / /   \\  \\   \\  /   /    |  |     /       |   |   _  \\     |  |  |  | |  \\ |  | |  \\ |  | |  | |  \\ |  |  /  _____|\n" +
				"|  |  __     /  ^  \\ `---|  |----`|  |__    \\   \\/    \\/   / /  ^  \\  \\   \\/   /     |  |    |   (----`   |  |_)  |    |  |  |  | |   \\|  | |   \\|  | |  | |   \\|  | |  |  __  \n" +
				"|  | |_ |   /  /_\\  \\    |  |     |   __|    \\            / /  /_\\  \\  \\_    _/      |  |     \\   \\       |      /     |  |  |  | |  . `  | |  . `  | |  | |  . `  | |  | |_ | \n" +
				"|  |__| |  /  _____  \\   |  |     |  |____    \\    /\\    / /  _____  \\   |  |        |  | .----)   |      |  |\\  \\----.|  `--'  | |  |\\   | |  |\\   | |  | |  |\\   | |  |__| | \n" +
				" \\______| /__/     \\__\\  |__|     |_______|    \\__/  \\__/ /__/     \\__\\  |__|        |__| |_______/       | _| `._____| \\______/  |__| \\__| |__| \\__| |__| |__| \\__|  \\______|");
	}

}
