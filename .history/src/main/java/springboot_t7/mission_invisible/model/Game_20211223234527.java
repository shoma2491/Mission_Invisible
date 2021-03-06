package springboot_t7.mission_invisible.model;

import java.util.ArrayList;

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
    private int turn=1;

    @Autowired
    UserMapper userMapper;
    
    @Autowired
    MatchMapper matchMapper;

    public Game(){}
    
    @Transactional
    public void hide(String userName,int imgNum){
        int id = userMapper.selectByUserName(userName);
        if(matchMapper.countByIdAndTurn(id, this.turn) == 0){matchMapper.insertMatch(id, turn, imgNum);}
    }

    @Transactional    
    public int roleId(String userName){        
        int roleid = userMapper.selectRoleIdByUserName(userName);        
        return roleid;    
    }

    @Transactional
    public ArrayList<Integer> userTurnResult(){
        int oniid = userMapper.selectUserIdByRoleId(2);
        int oniimgnum = matchMapper.selectImgNumByIdAndTurn(oniid, turn);

        return oniimgnum;
    }

    @Transactional
    public int oniTurnResult(){
        int oniid = userMapper.selectUserIdByRoleId(2);
        int oniimgnum = matchMapper.selectImgNumByIdAndTurn(oniid, turn);
        int findCount = matchMapper.countUserIdNotOniId(turn, oniimgnum, oniid);
        return findCount;
    }
    
}