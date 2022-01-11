package springboot_t7.mission_invisible.model;

import org.springframework.stereotype.Component;

@Component
public class Result {
    int turn;
    int user1, user2, user3;
    
    public int getTurn() {
        return turn;
    }
    public void setTurn(int turn) {
        this.turn = turn;
    }
    public int getUser1() {
        return user1;
    }
    public void setUser1(int user1) {
        this.user1 = user1;
    }
    public int getUser2() {
        return user2;
    }
    public void setUser2(int user2) {
        this.user2 = user2;
    }
    public int getUser3() {
        return user3;
    }
    public void setUser3(int user3) {
        this.user3 = user3;
    }

    
}