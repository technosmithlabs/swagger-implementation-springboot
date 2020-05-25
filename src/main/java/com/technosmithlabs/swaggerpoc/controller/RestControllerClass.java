package com.technosmithlabs.swaggerpoc.controller;

import com.technosmithlabs.swaggerpoc.model.PersonRequest;
import com.technosmithlabs.swaggerpoc.model.PersonResponse;
import com.technosmithlabs.swaggerpoc.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is the controller for Restful Service.
 * It will act as the entry point for the web service, from where
 * the service will get triggered.
 */
@RestController
@RequestMapping(value = "/v1/")
public class RestControllerClass {

    @Autowired
    private RestService service;

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok().body("Hello World");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/class")
    public ResponseEntity<PersonResponse> getPersonClass(PersonRequest personRequest) {
        final PersonResponse personResponse = service.getPersonClass(personRequest);
        return ResponseEntity.ok().body(personResponse);
    }
}
