package com.zlt.onlineStudy.po;

public class User {
    private Integer id;

    private String account;

    private String password;

    private String nikename;

    private String sex;

    private String user_signature;

    private String turename;

    private String email;

    private String phone;

    private String avatar;

    private Integer state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename == null ? null : nikename.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getUserSignature() {
        return user_signature;
    }

    public void setUserSignature(String userSignature) {
        this.user_signature = userSignature == null ? null : userSignature.trim();
    }

    public String getTurename() {
        return turename;
    }

    public void setTurename(String turename) {
        this.turename = turename == null ? null : turename.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}