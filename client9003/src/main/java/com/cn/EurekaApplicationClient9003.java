package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaApplicationClient9003 {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaApplicationClient9003.class, args);
	}

}
