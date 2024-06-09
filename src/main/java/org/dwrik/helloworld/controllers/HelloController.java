package org.dwrik.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


  @GetMapping("/")
  String home() {
    return "<center style=\"font-family:monospace\"><br><h1>This is the home page 🏠</h1><h3>Try the /hello endpoint</h3></center>";
  }

  @GetMapping("/hello")
  String hello() {
    return "<center style=\"font-family:monospace\"><br><h1>Hello there 👀</h1></center>";
  }
}
