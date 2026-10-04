package my_app.mtr_backend_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/self")
public class selfController {

  public selfController(){}

  @GetMapping("/health_check")
  public String health_check(){
    return "is up";
  }

}