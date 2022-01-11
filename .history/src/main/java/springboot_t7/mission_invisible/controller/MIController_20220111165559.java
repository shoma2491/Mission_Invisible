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
import springboot_t7.mission_invisible.model.Game;
import springboot_t7.mission_invisible.model.Result;
import springboot_t7.mission_invisible.model.ResultMapper;

@Controller
public class MIController {

    @Autowired
    private Room room;

    @Autowired
    private Game game;

    @Autowired
    private ResultMapper resultMapper;

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

    @GetMapping("/nextTurn")
    public String nextTurn(Principal prin) {
      String loginUser = prin.getName();
      this.room.deleteWait(loginUser);
      this.game.addOneTurn();
      return "game.html";
    }

    @GetMapping("/log")
    public String Log() {
      return "log.html";
    }

    @GetMapping("/userTurnResult")
    public String userTurnResult(ModelMap model,Principal prin) {
      //model.addAttribute("oniimagenum", this.game.turnResult());
        model.addAttribute("checkFind",this.game.userTurnResult(prin.getName()));
        model.addAttribute("turn",this.game.getTurn());
      return "turnResult.html";
    }

    @GetMapping("/oniTurnResult")
    public String oniTurnResult(ModelMap model) {
      model.addAttribute("findCount",this.game.oniTurnResult());
      model.addAttribute("turn",this.game.getTurn());
      return "turnResult.html";
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

    @GetMapping("/remove")
    public String remove(ModelMap model,Principal prin) {
      String loginUser = prin.getName();
      this.room.deleteWait(loginUser);
      model.addAttribute("userRoleLength",this.room.getWaitersLength());
      return "wait.html";
    }

    /** 
     * @param imgNum   
     * @param model
     * @param prin
     * @return   
     */
    @GetMapping("/selectImgNum/{imgNum}")
    public String selectImgNum(@PathVariable Integer imgNum,ModelMap model,Principal prin) {
      String loginUser = prin.getName();
      this.room.addWaiters(loginUser);
      this.game.hide(loginUser, imgNum.intValue());
      model.addAttribute("userRoleLength", this.room.getWaitersLength());
      return "wait.html";
    }

    @GetMapping("/finish")
    public String finish(Principal prin){
      ArrayList<Result> result = resultMapper.selectAll();
      String loginUser = prin.getName();
      this.room.deleteWait(loginUser);
      return "finish.html";
    }

}
