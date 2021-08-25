package com.zlt.onlineStudy.po;

public class Singlequestions {
    private Integer id;

    private Integer courseId;

    private String ansa;

    private String ansb;

    private String ansc;

    private String ansd;

    private String trueans;

    private String question;

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

    public String getAnsa() {
        return ansa;
    }

    public void setAnsa(String ansa) {
        this.ansa = ansa == null ? null : ansa.trim();
    }

    public String getAnsb() {
        return ansb;
    }

    public void setAnsb(String ansb) {
        this.ansb = ansb == null ? null : ansb.trim();
    }

    public String getAnsc() {
        return ansc;
    }

    public void setAnsc(String ansc) {
        this.ansc = ansc == null ? null : ansc.trim();
    }

    public String getAnsd() {
        return ansd;
    }

    public void setAnsd(String ansd) {
        this.ansd = ansd == null ? null : ansd.trim();
    }

    public String getTrueans() {
        return trueans;
    }

    public void setTrueans(String trueans) {
        this.trueans = trueans == null ? null : trueans.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }
}