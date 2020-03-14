package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationServer7002 {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaApplicationServer7002.class, args);
	}

}
