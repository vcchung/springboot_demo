package com.vc.demo.model;

public class Note {
    private String content;
    private String lastUpdatedBy;

    public Note(String content, String lastUpdatedBy) {
        this.content = content;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
