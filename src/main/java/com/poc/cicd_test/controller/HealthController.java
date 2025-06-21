package com.poc.cicd_test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("health")
public class HealthController {
  @GetMapping
  public ResponseEntity health() {
    log.info("health check hit");
    return ResponseEntity.ok().build();
  }
}
