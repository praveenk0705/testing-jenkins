package io.egen.api;

import io.egen.api.config.SwaggerConfig;
import io.egen.api.config.WebConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({WebConfig.class, SwaggerConfig.class})
@Slf4j

public class Application {

    public static void main(String[] args) {
//		 System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,
//		 "prod");
        SpringApplication.run(Application.class, args);
    }
}