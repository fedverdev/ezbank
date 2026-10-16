package com.github.fedverdev.ezbank.behavior;

import com.github.fedverdev.ezbank.utils.BaseTestClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountCreationHappyPathTest extends BaseTestClass {

    @LocalServerPort
    private int port;

    @Test
    void createsAccountAndReturnsItsIdInAccountsList() {
        Long accountId = given()
                .port(port)
                .when()
                .post("/api/v1/account/create")
                .then()
                .statusCode(201)
                .extract()
                .as(Long.class);

        List<Long> accountIds = given()
                .port(port)
                .when()
                .get("/accounts")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getList("accountIds", Long.class);

        assertTrue(accountIds.contains(accountId), "Created account ID should be listed");
    }
}
