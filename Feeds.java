package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Feeds {
    private static ArrayList<Post> feed;

    private static ArrayList<Post> mentalHealthFeed;

    private static ArrayList<Post> savedPosts;

    private static ArrayList<Post> myPosts;

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
        generateSavedPostFeed();
    }

    public void generateSavedPostFeed() {
        ArrayList<Post> sPosts = new ArrayList<>();
        for(Post p : feed) {
            if(p.isSaved()) {
                sPosts.add(p);
            }
        }

        for(Post p : mentalHealthFeed) {
            if(p.isSaved()) {
                sPosts.add(p);
            }
        }

        savedPosts = sPosts;
    }

    public void refresh() {
        generateMyPosts();
        generateSavedPostFeed();
    }


    public static ArrayList<Post> getFeed() {
        return feed;
    }

    public void setFeed(ArrayList<Post> feed) {
        this.feed = feed;
    }

    public void addPostToFeed(Post post) {
        feed.add(0, post);
        refresh();
    }

    public void addMentalHealthPostToFeed(Post post) {
        mentalHealthFeed.add(post);
        generateMyPosts();
    }

    public void savePost(Post post) {
        savedPosts.add(post);
    }

    public ArrayList<Post> getMentalHealthFeed() {
        return mentalHealthFeed;
    }

    public void generateMyPosts() {
        ArrayList<Post> temp = new ArrayList<Post>();
        int totalLikes = 0;
        for(Post p : feed) {
            if(p.getUser().equals("sergio_he")) {
                temp.add(p);
                totalLikes += p.getLikes();
            }
        }

        for(Post p : mentalHealthFeed) {
            if(p.getUser().equals("sergio_he")) {
                temp.add(p);
                totalLikes += p.getLikes();
            }
        }

        myPosts = temp;
        numberOfLikes = totalLikes;
    }

    public ArrayList<Post> getMyPosts() {
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

        for(Post p : mentalHealthFeed) {
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

        for(Post p : mentalHealthFeed) {
            if(p.getUser().equals(user)) {
                userPost.add(p);
            }
        }

        return userPost;
    }

    public ArrayList<Post> getSavedPosts() {
        return savedPosts;
    }



    public void renderAllPosts() {

        String arms = "- Bicep Curl 5x10 25lb \n -Tricep Extension 4x10 40lb \n - Hammer Curls 4x10 25lb \n Skull " +
                "Crushers 4x10 15lb";
        String legs = "- Back Squat 5x10 135lb \n - Front Squats 5x10 95ln \n - Calf Raises 135lb";
        String chests = "- Bench Press 4x8 135lb \n - Chest Fly 4x10 25lb \n - Incline Dumbell Press 4x10 30lb \n " +
                "- Decline Chest Press 3x10 30lb";
        String shoulders = "- Shoulder Press 4x10 70lb \n - Arnold Shoulder Press 4x10 25lb \n - Lateral Raises 4x8 " +
                "15lb";

        String mentalHealth1 = "Deep breaths and Conscious Breaths";
        String mentalHealth2 = "Meditate at Desk";
        String mentalHealth3 = "Stand And Stretch";
        String mentalHealth4 = "Vrikshasana";
        String mentalHealth5 = "Balasana";
        String mentalHealth6 = "Adho mukha svanasana";

        String mWorkout1 = mentalHealth1 + "\n" + mentalHealth3;
        String mWorkout2 = mentalHealth2 + "\n" + mentalHealth4;
        String mWorkout3 = mentalHealth3 + "\n" + mentalHealth5;
        String mWorkout4 = mentalHealth4  + "\n" + mentalHealth6;
        String mWorkout5 = mentalHealth5 + "\n" + mentalHealth4;

        String user0 = "sergio_he";
        String user1 = "Wesley62";
        String user2 = "Ryan_M";
        String user3 = "Nishita_K";
        String user4 = "Mattw";
        String user5 = "Shiv7";
        String user6 = "Arun8";
        String user7 = "Soph2";
        String user8 = "Adot2";

        Post post1 = new Post("Arm Day", user1, arms, new ArrayList<Comment>(), 3);
        Post post2 = new Post("Chest Day", user2, chests, new ArrayList<Comment>(), 4);
        Post post3 = new Post("Leg Day", user3, legs, new ArrayList<Comment>(), 1);
        Post post0 = new Post("Leg Day", user0, legs, new ArrayList<Comment>(), 5);
        Post post4 = new Post("Shoulder Day", user4, shoulders, new ArrayList<Comment>(), 0);
        Post post5 = new Post("Arm Day", user5, arms, new ArrayList<Comment>(), 3);
        Post post6 = new Post("Leg Day", user8, legs, new ArrayList<Comment>(), 2);
        Post post7 = new Post("Chest Day", user7, chests, new ArrayList<Comment>(), 2);
        Post post9 = new Post("Shoulder Day", user6, shoulders, new ArrayList<Comment>(), 5);
        Post post10 = new Post("Arm Day", user6, arms, new ArrayList<Comment>(), 3);

        post3.save();
        post7.save();
        post1.save();

        post1.addComment(new Comment("Woah that looks like a great workout", user2));
        post4.addComment(new Comment("Make sure you use correct form!", user5));

        addPostToFeed(post1);
        addPostToFeed(post2);
        addPostToFeed(post3);
        addPostToFeed(post4);
        addPostToFeed(post5);
        addPostToFeed(post6);
        addPostToFeed(post7);
        addPostToFeed(post0);
        addPostToFeed(post9);
        addPostToFeed(post10);


//        MentalHealthPost mPost1 = new MentalHealthPost(user7, "Soothing meditation", mWorkout1, new ArrayList<Comment>(), "I was very relaxed after this.", 3);
//        MentalHealthPost mPost2 = new MentalHealthPost(user4, "Morning Sunrise", mWorkout2, new ArrayList<Comment>(), "This is great for a morning workout!", 1);
//        MentalHealthPost mPost3 = new MentalHealthPost(user5, "Uplifting", mWorkout3, new ArrayList<Comment>(), "I could feel my stress melt away.....", 2);
//        MentalHealthPost mPost4 = new MentalHealthPost(user8, "Beachside Yoga", mWorkout2, new ArrayList<Comment>(), "Playing relaxing wave sounds really works well with this!", 0);
//        MentalHealthPost mPost5 = new MentalHealthPost(user0, "Hawaiian Yoga ", mWorkout4, new ArrayList<Comment>(), "You need to try!", 5);

        Post mPost1 = new Post("Soothing Meditation", user7, mWorkout1, new ArrayList<Comment>(), 3);
        Post mPost2 = new Post("Morning Sunrise", user7, mWorkout2, new ArrayList<Comment>(), 4);
        Post mPost3 = new Post("Uplifting", user7, mWorkout3, new ArrayList<Comment>(), 0);
        Post mPost4 = new Post("Beachside Yoga", user7, mWorkout4, new ArrayList<Comment>(), 2);
        Post mPost5 = new Post("Hawaiian Yoga", user7, mWorkout5, new ArrayList<Comment>(), 1);



        mPost1.addComment(new Comment("I def need to try this!", user3));
        mPost4.addComment(new Comment("This makes my 9-5 bearable...THANK YOU!!!!", user4));

        mentalHealthFeed.add(mPost1);
        mentalHealthFeed.add(mPost2);
        mentalHealthFeed.add(mPost3);
        mentalHealthFeed.add(mPost4);
        mentalHealthFeed.add(mPost5);
    }

    public ArrayList<Post> searchByKeyword(String keyword) {
        keyword = keyword.toLowerCase();
        ArrayList<Post> result = new ArrayList<>();
        for(Post p : feed) {
            if(p.getDescription().toLowerCase().contains (keyword) || p.getName().toLowerCase().contains(keyword) || p.getUser().toLowerCase().contains(keyword)) {
                result.add(p);
            }
        }
        return result;
    }
    
    public ArrayList<Post> searchMentalHealthPost(String keyword) {
        keyword = keyword.toLowerCase();
        ArrayList<Post> result = new ArrayList<>();
        for(Post p : mentalHealthFeed) {
            if(p.getDescription().toLowerCase().contains(keyword) || p.getName().toLowerCase().contains(keyword) || p.getUser().toLowerCase().contains(keyword)) {
                result.add(p);
            }
        }
        return result;
    }

    // FOR TERMINAL TESTING



}
