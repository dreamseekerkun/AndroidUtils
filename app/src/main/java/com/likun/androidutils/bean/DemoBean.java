package com.likun.androidutils.bean;

/**
 * Created by likun on 16/4/15.
 */
public class DemoBean {


    /**
     * content : 内容1
     * title : 标题1
     * type : 0
     */

    private String content;
    private String title;
    private String type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
