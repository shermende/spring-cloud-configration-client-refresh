package dev.shermende;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@RequiredArgsConstructor
@SpringBootApplication
public class ClientApplication implements CommandLineRunner {

    private final RefreshEndpoint refreshEndpoint;

    @Override
    public void run(String... args) {
        refreshEndpoint.refresh();
    }

    public static void main(String... args) {
        SpringApplication.run(ClientApplication.class);
    }

}
