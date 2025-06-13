package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

@QuarkusTest
class ApiResourceTest {

    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/api/hello")
          .then()
             .statusCode(200)
             .body("message", is("Hello World"))
             .body("status", is("success"));
    }

    @Test
    void testSomaEndpoint() {
        given()
          .when().get("/api/soma")
          .then()
             .statusCode(200)
             .body("numero1", notNullValue())
             .body("numero2", notNullValue())
             .body("soma", notNullValue())
             .body("operacao", notNullValue());
    }
}

