package com.example.demo.endpoint.rest.controller.health;

import com.example.demo.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class PingControllerTest extends FacadeIT {
    @Autowired private PingController pingController;

    @Test
    void ping() {
        assertEquals("pong", pingController.ping());
    }
}