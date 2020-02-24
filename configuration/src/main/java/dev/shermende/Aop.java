package dev.shermende;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class Aop {

    private final Source source;

    @After("execution(* org.springframework.cloud.endpoint.RefreshEndpoint.refresh())")
    public void intercept() {
        log.debug("[CONFIG] [REFRESH]");
        source.output().send(MessageBuilder.withPayload(true).build());
    }

}
