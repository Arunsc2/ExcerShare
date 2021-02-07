package com.company;

import java.util.ArrayList;

public class MentalHealthPost {
    private String user;
    private String name;
    private ArrayList<String> exercises;
    private ArrayList<Comment> comments;
    private String description;
    private int likes;
    private boolean isSaved;

    public MentalHealthPost(String name, String user, ArrayList<String> exercises, ArrayList<Comment> comments, String description, int likes) {
        this.name = name;
        this.user = user;
        this.exercises = exercises;
        this.comments = comments;
        this.description = description;
        this.likes = likes;
        isSaved = false;
    }

    public MentalHealthPost(String user) {
        this.user = user;
        this.name = "";
        this.exercises = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.description = "";
        this.likes = 0;
        isSaved = false;
    }

    public MentalHealthPost() {
        this.name = "";
        this.user = "";
        this.exercises = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.description = "";
        this.likes = 0;
        isSaved = false;
    }

    public MentalHealthPost(String name, String user, ArrayList<String> exercises, ArrayList<Comment> comments,
                            String description, int likes, boolean isSaved) {
        this.name = name;
        this.user = user;
        this.exercises = exercises;
        this.comments = comments;
        this.description = description;
        this.likes = likes;
        this.isSaved = isSaved;
    }

    public void save() {
        isSaved = true;
    }

    public boolean isSaved() {
        return isSaved;
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

    public void printPost() {
        System.out.println("User: " + user);
        System.out.println("Workout Name: " + name);
        System.out.println();
        for(String s : exercises) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println(description);
        System.out.println("Likes: " + likes + "                             Comments:");

        if(comments.size() != 0) {
            for(Comment c : comments) {
                System.out.println(c.getName() + ": " + c.getComment());
            }
        }
    }
}
