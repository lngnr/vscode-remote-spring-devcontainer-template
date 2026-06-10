package com.techniplas.demo.boundary;

import org.springframework.web.bind.annotation.RestController;

import com.techniplas.demo.data.Demo;
import com.techniplas.demo.service.DemoService;

import lombok.RequiredArgsConstructor;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequiredArgsConstructor
public class DemoController {
    
    private final DemoService service;

    @PostMapping("/")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void postMethodName(@RequestParam("hello") final String hello) {
        service.createDemo(hello);
    }

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public CollectionModel<Demo> getMethodName(@RequestParam String param) {
        return CollectionModel.of(service.getAll());
    }
    
    

}
