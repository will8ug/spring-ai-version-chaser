package io.will.springaiversionchaser.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(PingController.class)
public class PingControllerTest {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testPing() {
        webTestClient.get()
                .uri("/ping")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .isEqualTo("pong");
    }
}
