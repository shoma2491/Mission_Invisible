package springboot_t7.mission_invisible.model;

public class Match {
    int userid;
    int turn;
    int imgNum;

    public Match() {
        
    }

    public Match(int userid1,int turn1,int imgNum1){
        this.userid=userid1;
        this.turn=turn1;
        this.imgNum=imgNum1;
    }

    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getTurn() {
        return turn;
    }
    public void setTurn(int turn) {
        this.turn = turn;
    }
    public int getImgNum() {
        return imgNum;
    }
    public void setImgNum(int imgNum) {
        this.imgNum = imgNum;
    }

    
    
}