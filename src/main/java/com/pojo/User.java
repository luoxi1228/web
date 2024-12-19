package com.pojo;

public class User {

    private Integer id;
    private String username;
    private String password;
    private char online;
    private String dateTime;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String date) {
        this.dateTime = date;
    }

    public User(Integer id, String username, String password, char online, String dateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.online = online;
        this.dateTime = dateTime;
    }

    public User() {

    }

    public char getOnline() {
        return online;
    }

    public void setOnline(char online) {
        this.online = online;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", online='" + online +'\''+
                ", dateTime='" + dateTime +
                "'}";
    }

}
