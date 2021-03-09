package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

  private final GreetingService service;
  public GreetingController(GreetingService service){
    this.service = service;
  }
  @GetMapping("/greeting")
  public @ResponseBody String greet(){
    return service.greet();
  }
}
