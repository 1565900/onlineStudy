package com.zlt.onlineStudy.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
public class Comment {
    private Integer id;

    private String content;

    private Integer userId;

    private Integer courseId;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createtime;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", courseId=" + courseId +
                ", createtime=" + createtime +
                ", state=" + state +
                '}';
    }
}