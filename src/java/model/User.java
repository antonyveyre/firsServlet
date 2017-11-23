/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import org.json.simple.JSONObject;

/**
 *
 * @author user
 */
public class User {
  String username;
  String userpassword;
  String login;

  public User() {
  }

  public User(String username, String userpassword, String login) {
    this.username = username;
    this.userpassword = userpassword;
    this.login = login;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUserpassword() {
    return userpassword;
  }

  public void setUserpassword(String userpassword) {
    this.userpassword = userpassword;
  }
  
  

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }
  
  public boolean authorisedUser(String otherName, String otherPass){
    return this.username.equals(otherName)&&this.userpassword.equals(otherPass);
  }
  public JSONObject toJsonObject(){
  
  JSONObject jobj = new JSONObject();
    jobj.put("username",this.username);
    jobj.put("userpassword",this.userpassword);
    jobj.put("login",this.login);
    
    return jobj;
  }
  
  
  
  
  
}
