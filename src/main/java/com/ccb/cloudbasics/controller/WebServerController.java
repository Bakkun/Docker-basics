package com.ccb.cloudbasics.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class WebServerController {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("E',' MMM dd',' yyyy K:mm:ss a");
    private static final Logger LOGGER = Logger.getLogger(WebServerController.class);

    @PostMapping("/test")
    public ResponseEntity<String> index(String message) {
        String logMessage = DATE_FORMAT.format(new Date()) + " - " + message;
        LOGGER.debug(logMessage);
        return new ResponseEntity<>(logMessage, HttpStatus.OK);
    }
}

