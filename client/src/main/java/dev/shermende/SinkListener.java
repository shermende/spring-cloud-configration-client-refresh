package dev.shermende;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class SinkListener {

    private final RefreshEndpoint refreshEndpoint;

    @StreamListener(Sink.INPUT)
    public void input(Message<?> message) {
        log.debug("[CONFIG] [REFRESH] [{}]", message.getPayload());
        refreshEndpoint.refresh();
    }

}
