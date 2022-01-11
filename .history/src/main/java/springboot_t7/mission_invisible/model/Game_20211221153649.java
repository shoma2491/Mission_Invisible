package springboot_t7.mission_invisible.model;

import org.springframework.beans.factory.annotation.Autowired;

import springboot_t7.mission_invisible.model.User;
import springboot_t7.mission_invisible.model.Match;
import springboot_t7.mission_invisible.model.UserMapper;
import springboot_t7.mission_invisible.model.MatchMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;

/**
 * Game
 */
@Component
public class Game {
    private static int turn=1;
    private static int hideFlag=0;

    @Autowired
    UserMapper userMapper;
    
    @Autowired
    MatchMapper matchMapper;

    public Game(){}
    
    @Transactional
    public void hide(String userName,int imgNum){
        int id = userMapper.selectByUserName(userName);
        if(hideFlag == 0){matchMapper.insertMatch(id, turn, imgNum);}
        hideFlag++;
    }

    public void resetHideFlag(){
        this.hideFlag = 0;
    }


    @Transactional    
    public int roleId(String userName){        
        int roleid = userMapper.selectRoleIdByUserName(userName);        
        return roleid;    
    }
    
}