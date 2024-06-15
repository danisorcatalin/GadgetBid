package com.gadget.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Order(0)
@Profile("init")
class AppCdsApplicationListener implements ApplicationListener<ApplicationReadyEvent> {
    private final String actuatorHealthPath;
    private final ApplicationContext ctx;
    private final RestTemplate restTemplate = new RestTemplate();

    AppCdsApplicationListener(@Value("${server.port}") int serverPort,
                              @Value("${server.servlet.context-path}") String contextPath,
                              ApplicationContext ctx) {
        this.ctx = ctx;
        this.actuatorHealthPath = "http://localhost:" + serverPort + contextPath + "/actuator/health";
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        restTemplate.getForEntity(this.actuatorHealthPath, String.class);
        SpringApplication.exit(this.ctx, () -> 0);
    }
}