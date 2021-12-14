package springboot_t7.mission_invisible.model;

import org.springframework.beans.factory.annotation.Autowired;

import springboot_t7.mission_invisible.model.UserMapper;

/**
 * Game
 */
public class Game {
    private static int turn=1;

    @Autowired
    UserMapper userMapper;

    public void hide(String userName,int imgNum){
        int id = userMapper.selectByUserName(userName);
        
    }

    
}