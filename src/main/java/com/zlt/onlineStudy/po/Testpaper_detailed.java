package com.zlt.onlineStudy.po;

public class Testpaper_detailed {
    private Integer testpaperId;

    private Integer quesId;

    private String tureAns;

    private String userAns;

    public Integer getTestpaperId() {
        return testpaperId;
    }

    public void setTestpaperId(Integer testpaperId) {
        this.testpaperId = testpaperId;
    }

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public String getTureAns() {
        return tureAns;
    }

    public void setTureAns(String tureAns) {
        this.tureAns = tureAns == null ? null : tureAns.trim();
    }

    public String getUserAns() {
        return userAns;
    }

    public void setUserAns(String userAns) {
        this.userAns = userAns == null ? null : userAns.trim();
    }
}