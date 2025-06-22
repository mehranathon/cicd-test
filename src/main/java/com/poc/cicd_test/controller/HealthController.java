package com.poc.cicd_test.controller;

import java.time.Instant;
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
    String healthResponse = String.format("healthy at: %s", Instant.now().toString());
    log.info(healthResponse);
    return ResponseEntity.ok(healthResponse);
  }
}
