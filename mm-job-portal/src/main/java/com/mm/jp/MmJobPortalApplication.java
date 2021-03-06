package com.mm.jp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MmJobPortalApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MmJobPortalApplication.class);

	public static void main(String[] args) {
		LOGGER.info("MmJobPortalApplication starting");
		SpringApplication.run(MmJobPortalApplication.class, args);
	}

}
