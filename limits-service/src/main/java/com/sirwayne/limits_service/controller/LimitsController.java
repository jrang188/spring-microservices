package com.sirwayne.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirwayne.limits_service.bean.Limits;
import com.sirwayne.limits_service.configuration.Configuration;

@RestController
public class LimitsController {

  @Autowired
  private Configuration configuration;

  @GetMapping("/limits")
  public Limits retrieveLimits() {
    // return new Limits(1000, 1);
    return new Limits(configuration.getMinimum(), configuration.getMaximum());
  };
}
