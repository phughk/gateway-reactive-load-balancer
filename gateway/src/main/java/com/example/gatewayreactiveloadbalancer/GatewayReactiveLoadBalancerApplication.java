package com.example.gatewayreactiveloadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayReactiveLoadBalancerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(GatewayReactiveLoadBalancerApplication.class, args);
		EurekaDiscoveryClient discoveryClient = (EurekaDiscoveryClient) ctx.getBean("discoveryClient");

		// prints [version-one]
		System.out.println(discoveryClient.getServices());
		// prints []
		System.out.println(discoveryClient.getInstances("version-one"));
	}

}
