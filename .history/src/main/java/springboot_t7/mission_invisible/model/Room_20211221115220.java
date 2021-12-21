package springboot_t7.mission_invisible.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Room {
  ArrayList<String> users = new ArrayList<>();
  ArrayList<String> waiters = new ArrayList<>();
  
  
  int roomNo = 1;

  public void addUser(String name) {
    // 同名のユーザが居たら何もせずにreturn
    for (String s : this.users) {
      if (s.equals(name)) {
        return;
      }
    }
    // 同名のユーザが居なかった場合はusersにnameを追加する
    this.users.add(name);
  }
  
  public void addWaiters(String name) {
    // 同名のユーザが居たら何もせずにreturn
    for (String s : this.waiters) {
      if (s.equals(name)) {
        return;
      }
    }
    // 同名のユーザが居なかった場合はusersにnameを追加する
    this.waiters.add(name);
  }

  public void deleetWait(String name) {
    for (String s : this.waiters) {
      if (s.equals(name)) {
        waiters.remove(name);
        return;
      }
    }
  }
  
  
  // 以降はフィールドのgetter/setter
  // これらがないとThymeleafで値を取得できない
  public int getRoomNo() {
    return roomNo;
  }
  
  public void setRoomNo(int roomNo) {
    this.roomNo = roomNo;
  }
  
  public ArrayList<String> getUsers() {
    return users;
  }
  
  public void setUsers(ArrayList<String> users) {
    this.users = users;
  }
  
  public ArrayList<String> getWaiters() {
    return waiters;
  }

  public void setWaiters(ArrayList<String> waiters) {
    this.waiters = waiters;
  }
  public int getWaitersLength() {
    return this.waiters.size();
  }

  public int getUserslength() {
    return this.users.size();
  }
}
