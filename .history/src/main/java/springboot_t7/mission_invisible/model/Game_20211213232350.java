package springboot_t7.mission_invisible.model;

import org.springframework.beans.factory.annotation.Autowired;

import springboot_t7.mission_invisible.model.UserMapper;
import springboot_t7.mission_invisible.model.MatchMapper;

/**
 * Game
 */
public class Game {
    private static int turn=1;

    @Autowired
    UserMapper userMapper;

    @Autowired
    MatchMapper matchMapper;
    

    public void hide(String userName,int imgNum){
        int id = userMapper.selectByUserName(userName);
        matchMapper.insertMatch(id, turn, imgNum);
    }

    
}