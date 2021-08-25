package com.zlt.onlineStudy.po;

public class User_course {
    private Integer userId;

    private Integer courseId;

    private Integer scState;

    private Integer state;

    private Integer leaCha;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getScState() {
        return scState;
    }

    public void setScState(Integer scState) {
        this.scState = scState;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getLeaCha() {
        return leaCha;
    }

    public void setLeaCha(Integer leaCha) {
        this.leaCha = leaCha;
    }
}