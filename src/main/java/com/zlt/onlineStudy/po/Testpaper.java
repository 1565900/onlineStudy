package com.zlt.onlineStudy.po;

public class Testpaper {
    private Integer id;

    private Integer courseId;

    private Integer examId;

    private Integer userId;

    private String score;

    private String appealInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getAppealInfo() {
        return appealInfo;
    }

    public void setAppealInfo(String appealInfo) {
        this.appealInfo = appealInfo == null ? null : appealInfo.trim();
    }
}