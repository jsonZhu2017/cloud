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
public class EurekaApplicationClient8001 {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaApplicationClient8001.class, args);
	}

}
