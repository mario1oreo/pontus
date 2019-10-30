package com.mario1oreo.projects.business.pontus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PontusApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8081);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PontusApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PontusApplication.class, args);
    }

}
