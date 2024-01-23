package com.example.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}


//	@Override
//	public void report(FailureAnalysis failureAnalysis) {
//		Logger logger;
//		if (logger.isDebugEnabled()) {
//			logger.debug("Application failed to start due to an exception",
//					failureAnalysis.getCause());
//		}
//		if (logger.isErrorEnabled()) {
//			logger.error(buildMessage(failureAnalysis));
//		}
//	}
}
