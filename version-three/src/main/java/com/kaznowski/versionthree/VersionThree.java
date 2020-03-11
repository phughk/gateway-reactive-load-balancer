package com.kaznowski.versionthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class VersionThree {
  public static void main(String[] args) {
    SpringApplication.run(VersionThree.class, args);
  }

  @RequestMapping("version")
  String user() {
    return "Version 3";
  }
}
