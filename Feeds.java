package com.example.exershare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Feeds {
    private static ArrayList<Post> feed;

    private static ArrayList<MentalHealthPost> mentalHealthFeed;

    private static ArrayList<Object> savedPosts;

    private static ArrayList<Object> myPosts;

    private static int numberOfLikes;

    private static Map<String, String> profilePic;


    public Feeds() {
        feed = new ArrayList<>();
        mentalHealthFeed = new ArrayList<>();
        savedPosts = new ArrayList<>();
        myPosts = new ArrayList<>();
        profilePic = new HashMap<>();
        renderAllPosts();
        generateMyPosts();
    }


    public static ArrayList<Post> getFeed() {
        return feed;
    }

    public void setFeed(ArrayList<Post> feed) {
        this.feed = feed;
    }

    public void addPostToFeed(Post post) {
        feed.add(post);
        generateMyPosts();
    }

    public void addMentalHealthPostToFeed(MentalHealthPost post) {
        mentalHealthFeed.add(post);
        generateMyPosts();
    }

    public void savePost(Object post) {
        savedPosts.add(post);
    }

    public void generateMyPosts() {
        ArrayList<Object> temp = new ArrayList<Object>();
        int totalLikes = 0;
        for(Post p : feed) {
            if(p.getUser().equals("sergio_he")) {
                temp.add(p);
                totalLikes += p.getLikes();
            }
        }

        for(MentalHealthPost p : mentalHealthFeed) {
            if(p.getUser().equals("sergio_he")) {
                temp.add(p);
                totalLikes += p.getLikes();
            }
        }

        myPosts = temp;
        numberOfLikes = totalLikes;
    }

    public ArrayList<Object> getMyPosts() {
        return myPosts;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public int getNumberOfLikesFromPerson(String user) {
        int likes = 0;
        for(Post p : feed) {
            if(p.getUser().equals(user)) {
                likes += p.getLikes();
            }
        }

        for(MentalHealthPost p : mentalHealthFeed) {
            if(p.getUser().equals(user)) {
                likes += p.getLikes();
            }
        }

        return likes;
    }

    public ArrayList<Object> getUserPost(String user) {
        ArrayList<Object> userPost = new ArrayList<>();

        for(Post p : feed) {
            if(p.getUser().equals(user)) {
                userPost.add(p);
            }
        }

        for(MentalHealthPost p : mentalHealthFeed) {
            if(p.getUser().equals(user)) {
                userPost.add(p);
            }
        }

        return userPost;
    }


    public static void renderAllPosts() {
        Exercise shoulderPress = new Exercise("Shoulder Press", 4, 10, "70lb");
        Exercise arnoldShoulderPress = new Exercise("Arnold Shoulder Press", 4, 10, "25lb");
        Exercise lateralRaises = new Exercise("Lateral Raises", 4, 8, "15lb");

        ArrayList<Exercise> shoulderDay = new ArrayList<>();
        shoulderDay.add(shoulderPress);
        shoulderDay.add(arnoldShoulderPress);
        shoulderDay.add(lateralRaises);

        Exercise benchPress = new Exercise("Bench Press", 4, 8, "135lb");
        Exercise chestFly = new Exercise("Chest Fly", 5, 8, "25lb");
        Exercise inclineDumbellPress = new Exercise("Incline Dumbell Press", 4, 10, "30lb");
        Exercise declineChestPress = new Exercise("Decline Chest Press", 4, 10, "30lb");

        ArrayList<Exercise> chestDay = new ArrayList<>();
        chestDay.add(benchPress);
        chestDay.add(chestFly);
        chestDay.add(inclineDumbellPress);
        chestDay.add(declineChestPress);

        Exercise backSquats = new Exercise("Back Squats", 5, 10, "135lb");
        Exercise frontSquats = new Exercise("Front Squats", 5, 10, "95lb");
        Exercise calfRaises = new Exercise("Calf Raises", 4, 20, "135lb");

        ArrayList<Exercise> legDay = new ArrayList<>();
        legDay.add(backSquats);
        legDay.add(frontSquats);
        legDay.add(calfRaises);

        Exercise bicepCurl = new Exercise("Bicep Curl", 5, 10, "25lb");
        Exercise tricepExtension = new Exercise("Tricep Extension", 4, 10, "40lb");
        Exercise hammerCurls = new Exercise("Hammer Curls", 4, 10, "25lb");
        Exercise skullCrushers = new Exercise("Skull Crushers", 4, 10, "15lb");

        ArrayList<Exercise> armDay = new ArrayList<>();
        armDay.add(bicepCurl);
        armDay.add(tricepExtension);
        armDay.add(hammerCurls);
        armDay.add(skullCrushers);

        String mentalHealth1 = "Deep breaths and Conscious Breaths";
        String mentalHealth2 = "Meditate at Desk";
        String mentalHealth3 = "Stand And Stretch";
        String mentalHealth4 = "Vrikshasana";
        String mentalHealth5 = "Balasana";
        String mentalHealth6 = "Adho mukha svanasana";

        ArrayList<String> mWorkout1 = new ArrayList<>();
        ArrayList<String> mWorkout2 = new ArrayList<>();
        ArrayList<String> mWorkout3 = new ArrayList<>();
        ArrayList<String> mWorkout4 = new ArrayList<>();
        mWorkout1.add(mentalHealth1);
        mWorkout1.add(mentalHealth5);
        mWorkout1.add(mentalHealth4);
        mWorkout2.add(mentalHealth3);
        mWorkout2.add(mentalHealth2);
        mWorkout2.add(mentalHealth1);
        mWorkout3.add(mentalHealth6);
        mWorkout3.add(mentalHealth1);
        mWorkout3.add(mentalHealth2);
        mWorkout4.add(mentalHealth2);
        mWorkout4.add(mentalHealth5);
        mWorkout4.add(mentalHealth4);

        String user0 = "sergio_he";
        String user1 = "Wesley62";
        String user2 = "Ryan_M";
        String user3 = "Nishita_K";
        String user4 = "Mattw";
        String user5 = "Shiv7";
        String user6 = "Arun8";
        String user7 = "Soph2";
        String user8 = "Adot2";

        Post post1 = new Post("Arm Day", user1, armDay, new ArrayList<Comment>(), "I want to get big biceps", 3);
        Post post2 = new Post("Chest Day", user2, chestDay, new ArrayList<Comment>(), "Getting gains!", 4);
        Post post3 = new Post("Leg Day", user3, legDay, new ArrayList<Comment>(), "At 6 am wooooo", 1);
        Post post0 = new Post("Leg Day", user0, legDay, new ArrayList<Comment>(), "Im really sore", 5);
        Post post4 = new Post("Shoulder Day", user4, shoulderDay, new ArrayList<Comment>(), "This is my first time on this app :)", 0);
        Post post5 = new Post("Arm Day", user5, armDay, new ArrayList<Comment>(), "This is a really good workout", 3);
        Post post6 = new Post("Leg Day", user8, legDay, new ArrayList<Comment>(), "I want to get thunder thighs!", 2);
        Post post7 = new Post("Chest Day", user7, chestDay, new ArrayList<Comment>(), "", 2);
        Post post9 = new Post("Shoulder Day", user6, shoulderDay, new ArrayList<Comment>(), "Was pretty stress relieving", 5);
        Post post10 = new Post("Arm Day", user6, armDay, new ArrayList<Comment>(), "Never skip arm day :)", 3);

        post1.addComment(new Comment("Woah that looks like a great workout", user2));
        post4.addComment(new Comment("Make sure you use correct form!", user5));

        feed.add(post1);
        feed.add(post2);
        feed.add(post3);
        feed.add(post4);
        feed.add(post5);
        feed.add(post6);
        feed.add(post7);
        feed.add(post0);
        feed.add(post9);
        feed.add(post10);

        MentalHealthPost mPost1 = new MentalHealthPost(user7, "Soothing meditation", mWorkout1, new ArrayList<Comment>(), "I was very relaxed after this.", 3);
        MentalHealthPost mPost2 = new MentalHealthPost(user4, "Morning Sunrise", mWorkout2, new ArrayList<Comment>(), "This is great for a morning workout!", 1);
        MentalHealthPost mPost3 = new MentalHealthPost(user5, "Uplifting", mWorkout3, new ArrayList<Comment>(), "I could feel my stress melt away.....", 2);
        MentalHealthPost mPost4 = new MentalHealthPost(user8, "Beachside Yoga", mWorkout2, new ArrayList<Comment>(), "Playing relaxing wave sounds really works well with this!", 0);
        MentalHealthPost mPost5 = new MentalHealthPost(user0, "Hawaiian Yoga ", mWorkout4, new ArrayList<Comment>(), "You need to try!", 5);

        mPost1.addComment(new Comment("I def need to try this!", user3));
        mPost4.addComment(new Comment("This makes my 9-5 bearable...THANK YOU!!!!", user4));

        mentalHealthFeed.add(mPost1);
        mentalHealthFeed.add(mPost2);
        mentalHealthFeed.add(mPost3);
        mentalHealthFeed.add(mPost4);
        mentalHealthFeed.add(mPost5);
    }

    // FOR TERMINAL TESTING

    public void printFeed() {
        for(Post p : feed) {
            p.printPost();
            System.out.println();
            System.out.println("__________________________________________________");
            System.out.println();
        }
    }

}
