package com.mm.jp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.mm.jp.util.JobPortalPropsUtil;

@SpringBootApplication
public class MmJobPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmJobPortalApplication.class, args);
	}

}
