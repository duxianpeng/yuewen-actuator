package com.yuewen.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * Created by peng on 2017/5/21.
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class ActuatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}
}
