package com.kaznowski.versiontwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class VersionTwo {
  public static void main(String[] args) {
    SpringApplication.run(VersionTwo.class, args);
  }

  @RequestMapping("version")
  String user() {
    return "Version 2";
  }
}
