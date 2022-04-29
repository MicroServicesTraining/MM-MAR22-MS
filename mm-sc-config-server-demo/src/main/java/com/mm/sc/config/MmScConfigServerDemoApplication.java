package com.mm.sc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MmScConfigServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmScConfigServerDemoApplication.class, args);
	}

}
