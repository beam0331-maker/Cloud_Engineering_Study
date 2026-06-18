package com.exam.dto;

import java.util.List;

public class LoginDTO {
    String userid;
    String password;
    List<String> email;

    public LoginDTO() {
    }

    public LoginDTO(String userid, String password, List<String> email) {
        this.userid = userid;
        this.password = password;
        this.email = email;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", emails=" + email +
                '}';
    }
}

