package io.github.com.moronipereira.apitodo.domain;

public class Todo {

    private Integer id;
    private String description;
    private Boolean done;

    public Todo() {

    }

    public Todo(Integer id, Boolean done, String description) {
        this.id = id;
        this.done = done;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
