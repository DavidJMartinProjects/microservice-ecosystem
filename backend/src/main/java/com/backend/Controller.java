package com.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class Controller {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getGreeting() {
        log.info("GET request to /.");
        return "success: backend-service is online.";
    }

}
