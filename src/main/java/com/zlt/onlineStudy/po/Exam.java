package com.zlt.onlineStudy.po;

import java.util.Date;

public class Exam {
    private Integer id;

    private String courseName;

    private Integer courseId;

    private Date examTime;

    private String examDru;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    public String getExamDru() {
        return examDru;
    }

    public void setExamDru(String examDru) {
        this.examDru = examDru == null ? null : examDru.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}