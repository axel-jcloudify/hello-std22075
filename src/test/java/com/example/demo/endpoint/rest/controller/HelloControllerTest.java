package com.example.demo.endpoint.rest.controller;

import com.example.demo.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest extends FacadeIT {
    @Autowired HelloController helloController;

    @Test
    void hello() {
        assertEquals("Hello World", helloController.hello());
    }
}