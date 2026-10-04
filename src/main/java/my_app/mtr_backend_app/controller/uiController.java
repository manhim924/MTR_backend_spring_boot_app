//my_app.mtr_backend_app.controller.uiController.java
package my_app.mtr_backend_app.controller;

import my_app.mtr_backend_app.config.uiPropertiesConfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class uiController{

  private final uiPropertiesConfig uiPropertiesConfig;

  public uiController(uiPropertiesConfig uiPropertiesConfig){
    this.uiPropertiesConfig = uiPropertiesConfig;
  }

  @GetMapping("/ui")
  public String ui(Model model){
    model.addAttribute("Line" , uiPropertiesConfig.getMtr_line());
    return "ui";
  }

  @PostMapping("/ui_test")
  @ResponseBody
  public String ui_test(@RequestParam("selectedCode") String selected_code){
    return "Test Triggered successfully for code: " + selected_code;
  }

}