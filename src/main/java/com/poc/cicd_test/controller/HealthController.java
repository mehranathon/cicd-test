package com.poc.cicd_test.controller;

import java.time.Instant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("health")
public class HealthController {
  @GetMapping("/{source}")
  public ResponseEntity health(@PathVariable String source) {
    String healthResponse = String.format("source check: %s; healthy at: %s",source, Instant.now().toString());
    log.info(healthResponse);
    return ResponseEntity.ok(healthResponse);
  }
}
