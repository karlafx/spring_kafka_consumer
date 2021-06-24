package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import java.io.Serializable;
import java.util.Date;

//Hibernate als Entity machen
public class Post implements Serializable {

    private String postingId;
    private String userId;
    private String content;
    private String emotion;
    private Date creationDate;

    public Post(){
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
