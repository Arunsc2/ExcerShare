package com.company;

import java.util.ArrayList;

public class Post {
    private String name;
    private String user;
    private ArrayList<Comment> comments;
    private String description;
    private int likes;
    private boolean isSaved;



    public Post(String name, String user, String description, ArrayList<Comment> comments, int likes) {
        this.name = name;
        this.user = user;
        this.comments = comments;
        this.description = description;
        this.likes = likes;
        this.isSaved = false;
    }

    public Post(String name, String user, ArrayList<Comment> comments,
                String description, int likes, boolean isSaved) {
        this.name = name;
        this.user = user;
        this.comments = comments;
        this.description = description;
        this.likes = likes;
        this.isSaved = isSaved;
    }

    public Post(String user) {
        this.user = user;
        this.name = "";
        this.comments = new ArrayList<>();
        this.description = "";
        this.likes = 0;
        this.isSaved = false;
    }

    public Post() {
        this.name = "";
        this.user = "";
        this.comments = new ArrayList<>();
        this.description = "";
        this.likes = 0;
        this.isSaved = false;
    }

    public String getUser() {
        return user;
    }

    public void save() {
        isSaved = true;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void like() {
        this.likes++;
    }

    public void unLike() {
        this.likes--;
    }

    public String getName() {
        return name;
    }


}
