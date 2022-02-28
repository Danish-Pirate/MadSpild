package com.example.madspild2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MadSpildController {

  @GetMapping("/")
  public String index () {
    return "index";
  }
}
