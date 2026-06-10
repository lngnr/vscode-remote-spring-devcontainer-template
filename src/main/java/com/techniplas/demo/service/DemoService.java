package com.techniplas.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techniplas.demo.data.Demo;
import com.techniplas.demo.data.DemoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final DemoRepository repository;

    @Transactional
    public Demo createDemo(final String hello) {
        final Demo demo = new Demo();
        demo.setId(UUID.randomUUID());
        demo.setHello(hello);
        return repository.save(demo);
    }

    @Transactional
    public List<Demo> getAll() {
        return repository.findAll();
    }

}
