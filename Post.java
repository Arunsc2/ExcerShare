package com.example.exershare;

import java.util.ArrayList;

public class Post {
    private String name;
    private String user;
    private ArrayList<Exercise> exercises;
    private ArrayList<Comment> comments;
    private String description;
    private int likes;

    public Post(String name, String user, ArrayList<Exercise> exercises, ArrayList<Comment> comments, String description, int likes) {
        this.name = name;
        this.user = user;
        this.exercises = exercises;
        this.comments = comments;
        this.description = description;
        this.likes = likes;
    }

    public Post(String user) {
        this.user = user;
        this.name = "";
        this.exercises = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.description = "";
        this.likes = 0;
    }

    public Post() {
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

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void addExercise(Exercise exercise) {
        this.exercises.add(exercise);
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

    // FOR TERMINAL TESTING

    public void printPost() {
        System.out.println("User: " + user);
        System.out.println("Workout Name: " + name);
        System.out.println();
        for(Exercise e : exercises) {
            System.out.println(e.getName() + ": Sets: " +  e.getSets() + " Reps: " + e.getReps() + " " + e.getAdditionalComment());
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
