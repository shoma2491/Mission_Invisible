package springboot_t7.mission_invisible.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springboot_t7.mission_invisible.model.Room;

@Controller
public class MIController {

    @Autowired
    private Room room;

    /**
   *
   * @param model Thymeleafにわたすデータを保持するオブジェクト
   * @param prin  ログインユーザ情報が保持されるオブジェクト
   * @return
   */

    @GetMapping("/game")
    public String Game() {
      return "game.html";
    }

    @GetMapping("/log")
    public String Log() {
      return "log.html";
    }

    @GetMapping("/wait")
    public String Wait() {
      return "wait.html";
    }

    @GetMapping("/entry")
    public String Entry(Principal prin, ModelMap model) {
      String loginUser = prin.getName();
      this.room.addUser(loginUser);
      int usersLength = this.room.getUserslength();
      model.addAttribute("room", this.room);
      model.addAttribute("usersLength", usersLength);
      return "entry.html";
    }

    /** 
     * @param imgNum   
     * @param model   
     * @return   
     */

    @GetMapping("/hide/{imgNum}")
    public String hide(@PathVariable String imgNum,ModelMap model) {
      return "wait.html";
    }
}
