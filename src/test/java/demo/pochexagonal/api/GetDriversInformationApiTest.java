package demo.pochexagonal.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest
public class GetDriversInformationApiTest {

    @Autowired
    private WebTestClient client;

    @Test
    void get() {
        String symbol = "ayaya";

        client.get().uri("/drivers-informarion/" + symbol)
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                // assert
                .expectStatus().isOk();
    }
}
