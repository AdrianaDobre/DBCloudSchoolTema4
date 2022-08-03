package com.dobreadrianaliatema4.dobreadrianaliatema4.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Command {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String status;
    private String comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
