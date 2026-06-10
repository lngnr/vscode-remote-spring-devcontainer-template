package com.techniplas.demo.data;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, UUID> {

}
