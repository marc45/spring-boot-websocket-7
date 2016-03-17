package com.shellnperl.psc;

import com.shellnperl.psc.handler.SampleHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.PerConnectionWebSocketHandler;

@Configuration
@EnableAutoConfiguration
@EnableWebSocket
public class Application extends SpringBootServletInitializer implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(sampleHandler(), "/sample").withSockJS();
    }

    @Bean
    public WebSocketHandler sampleHandler() {
        return new PerConnectionWebSocketHandler(SampleHandler.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
