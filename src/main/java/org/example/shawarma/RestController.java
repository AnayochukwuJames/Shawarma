package org.example.shawarma;//package com.davidson.MyFirstSpringBoot.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {


    private final RestService restService;

    public RestController(RestService service){
        this.restService = service;
    }

    @GetMapping("/name")
    public String getUsername(){
        return restService.readFromFile();
    }

    @PostMapping("/name")
    public String postUsername(@RequestBody String name){
        return restService.postToFile(name);
    }



//
//    @PostMapping("/name")
//    public void postUsername(@RequestParam String name){
//        postRequests.add(name);
//    }

//    @PostMapping("/name/{name}")
//    public void postUsername(@PathVariable String name){
//        postRequests.add(name);
//    }


}