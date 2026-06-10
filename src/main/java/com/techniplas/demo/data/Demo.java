package com.techniplas.demo.data;


import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "demo")
public class Demo {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "hello")
    private String hello;
}
