package com.xjh.student.domain;

public class User {
    private String username;
    private String password;
    private String phone;
    private String personID;

    public User() {
    }

    public User(String username, String password, String phone, String personID) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.personID = personID;
    }


    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return personID
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * 设置
     * @param personID
     */
    public void setPersonID(String personID) {
        this.personID = personID;
    }



}
