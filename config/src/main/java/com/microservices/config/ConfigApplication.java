package com.microservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
		System.out.println("  ______   ______   .__   __.  _______  __    _______         _______. _______ .______     ____    ____  _______ .______          __       _______.\n" +
				" /      | /  __  \\  |  \\ |  | |   ____||  |  /  _____|       /       ||   ____||   _  \\    \\   \\  /   / |   ____||   _  \\        |  |     /       |\n" +
				"|  ,----'|  |  |  | |   \\|  | |  |__   |  | |  |  __        |   (----`|  |__   |  |_)  |    \\   \\/   /  |  |__   |  |_)  |       |  |    |   (----`\n" +
				"|  |     |  |  |  | |  . `  | |   __|  |  | |  | |_ |        \\   \\    |   __|  |      /      \\      /   |   __|  |      /        |  |     \\   \\    \n" +
				"|  `----.|  `--'  | |  |\\   | |  |     |  | |  |__| |    .----)   |   |  |____ |  |\\  \\----.  \\    /    |  |____ |  |\\  \\----.   |  | .----)   |   \n" +
				" \\______| \\______/  |__| \\__| |__|     |__|  \\______|    |_______/    |_______|| _| `._____|   \\__/     |_______|| _| `._____|   |__| |_______/    \n" +
				"                                                                                                                                                   \n" +
				".______       __    __  .__   __. .__   __.  __  .__   __.   _______ \n" +
				"|   _  \\     |  |  |  | |  \\ |  | |  \\ |  | |  | |  \\ |  |  /  _____|\n" +
				"|  |_)  |    |  |  |  | |   \\|  | |   \\|  | |  | |   \\|  | |  |  __  \n" +
				"|      /     |  |  |  | |  . `  | |  . `  | |  | |  . `  | |  | |_ | \n" +
				"|  |\\  \\----.|  `--'  | |  |\\   | |  |\\   | |  | |  |\\   | |  |__| | \n" +
				"| _| `._____| \\______/  |__| \\__| |__| \\__| |__| |__| \\__|  \\______|"
		);
	}
}
