package com.kaznowski.versionone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class VersionOne {
  public static void main(String[] args) {
    SpringApplication.run(VersionOne.class, args);
  }

  @RequestMapping("version")
  String user() {
    return "Version 1";
  }
}
