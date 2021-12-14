package springboot_t7.mission_invisible.model;

/**
 * User
 */
public class User {
    
    int userId;
    String userName;
    int roleId;

    public User(){}

    public User(int userId1,String userName1,int roleId1){
        this.userId=userId1;
        this.userName=userName1;
        this.roleId=roleId1;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getRoleId() {
        return roleId;
    }
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}