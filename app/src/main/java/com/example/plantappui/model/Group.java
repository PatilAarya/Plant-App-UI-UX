package com.example.plantappui.model;

public class Group {

    private String groupTitle;
    private String groupButtonTitle;

    public Group(String groupTitle, String groupButtonTitle) {
        this.groupTitle = groupTitle;
        this.groupButtonTitle = groupButtonTitle;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public String getGroupButtonTitle() {
        return groupButtonTitle;
    }

    public void setGroupButtonTitle() {
        this.groupButtonTitle = groupButtonTitle;
    }
}
