package springboot_t7.mission_invisible.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MIController {

    @GetMapping("/game")
  public String game() {
    return "game.html";
  }

  @GetMapping("/log")
  public String log() {
    return "log.html";
  }

  @GetMapping("/entry")
  public String entry() {
    return "entry.html";
  }
}