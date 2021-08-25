package com.zlt.onlineStudy.po;

public class Course_category {
    private Integer id;

    private String name;

    private Integer pid;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Course_category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", state=" + state +
                '}';
    }
}