package com.example.exershare;

import java.util.ArrayList;

public class MentalHealthPost {
    private String user;
    private String name;
    private ArrayList<String> exercises;
    private ArrayList<Comment> comments;
    private String description;
    private int likes;

    public MentalHealthPost(String name, String user, ArrayList<String> exercises, ArrayList<Comment> comments, String description, int likes) {
        this.name = name;
        this.user = user;
        this.exercises = exercises;
        this.comments = comments;
        this.description = description;
        this.likes = likes;
    }

    public MentalHealthPost(String user) {
        this.user = user;
        this.name = "";
        this.exercises = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.description = "";
        this.likes = 0;
    }

    public MentalHealthPost() {
        this.name = "";
        this.user = "";
        this.exercises = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.description = "";
        this.likes = 0;
    }

    public String getUser() {
        return user;
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

    public String getName() {
        return name;
    }

    public ArrayList<String> getExercises() {
        return exercises;
    }

    public void setExercises(ArrayList<String> exercises) {
        this.exercises = exercises;
    }

    public void addExercise(String exercise) {
        this.exercises.add(exercise);
    }
}
