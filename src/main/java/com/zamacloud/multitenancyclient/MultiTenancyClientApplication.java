package com.zamacloud.multitenancyclient;

import com.zamacloud.commons.multitenancy.configuration.EnableMultiTenancySupport;
import com.zamacloud.commons.usercontext.EnableUserContextAwareness;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableUserContextAwareness
@EnableMultiTenancySupport
public class MultiTenancyClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiTenancyClientApplication.class, args);
	}

}
