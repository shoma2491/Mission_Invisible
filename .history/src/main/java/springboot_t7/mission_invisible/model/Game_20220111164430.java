package springboot_t7.mission_invisible.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import springboot_t7.mission_invisible.model.User;
import springboot_t7.mission_invisible.model.Match;
import springboot_t7.mission_invisible.model.UserMapper;
import springboot_t7.mission_invisible.model.MatchMapper;
import springboot_t7.mission_invisible.model.Result;
import springboot_t7.mission_invisible.model.ResultMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;

/**
 * Game
 */
@Component
public class Game {
    private int turn=1;
    private int nextTurnFlag=0;
    static int userNum=2; //ユーザの人数

    @Autowired
    UserMapper userMapper;

    @Autowired
    MatchMapper matchMapper;

    @Autowired
    ResultMapper resultMapper;

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

    public void addOneTurn(){
        if (nextTurnFlag==0) {
            turn++;
        }
        nextTurnFlag++;
        
        if (nextTurnFlag==userNum) {
            nextTurnFlag=0;
        }
    }

    @Transactional
    public boolean userTurnResult(String userName){
        int oniid = userMapper.selectUserIdByRoleId(2);
        int oniimgnum = matchMapper.selectImgNumByIdAndTurn(oniid, turn);
        ArrayList<Integer> findUserIds = matchMapper.selectUserIdNotOniId(turn, oniimgnum, oniid);
        int userId = userMapper.selectByUserName(userName);
        for (Integer findUserId : findUserIds) {
            if(findUserId.intValue() == userId){
                if(userId == 1){
                    this
                }
                return true;
            }
        }
        return false;
    }
    
    @Transactional
    public int oniTurnResult(){
        int oniid = userMapper.selectUserIdByRoleId(2);
        int oniimgnum = matchMapper.selectImgNumByIdAndTurn(oniid, turn);
        int findCount = matchMapper.countUserIdNotOniId(turn, oniimgnum, oniid);
        return findCount;
    }

    public int getTurn(){
        return this.turn;
    }
}
