package com.example.exershare;

public class Exercise {
    private String name;
    private int sets;
    private int reps;
    private String additionalComment;

    public Exercise(String name, int sets, int reps, String additionalComment) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.additionalComment = additionalComment;
    }

    public Exercise(String name, int sets, int reps) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.additionalComment = "";
    }

    public Exercise() {
        this.name = "";
        this.sets = 0;
        this.reps = 0;
        this.additionalComment = "";
    }

    public String getName() {
        return name;
    }

    public String getAdditionalComment() {
        return additionalComment;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdditionalComment(String additionalComment) {
        this.additionalComment = additionalComment;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
