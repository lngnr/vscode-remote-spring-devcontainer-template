package com.techniplas.demo.boundary;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techniplas.demo.data.Demo;
import com.techniplas.demo.service.DemoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService service;

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void postMethodName(@RequestParam("hello") final String hello) {
        service.createDemo(hello);
    }

    @GetMapping("/hello")
    @ResponseStatus(code = HttpStatus.OK)
    public CollectionModel<Demo> getMethodName() {
        return CollectionModel.of(service.getAll());
    }

}
