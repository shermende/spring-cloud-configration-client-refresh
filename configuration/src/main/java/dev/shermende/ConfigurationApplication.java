package dev.shermende;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@EnableConfigServer
@SpringBootApplication
@EnableBinding(Source.class)
public class ConfigurationApplication {

    public static void main(String... args) {
        SpringApplication.run(ConfigurationApplication.class);
    }

}
