package com.vastag.resourceserver.api.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/v1/resources", produces = MediaType.APPLICATION_JSON_VALUE)
public class ResourceServerController {

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(new ArrayList<String>());
    }
}
