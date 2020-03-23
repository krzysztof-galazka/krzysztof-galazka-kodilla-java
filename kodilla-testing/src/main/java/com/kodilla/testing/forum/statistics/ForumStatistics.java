package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if (usersQuantity > 0) {
            averagePostPerUser = postsQuantity / (double) usersQuantity;
        } else {
            averagePostPerUser = 0;
        }
        if (usersQuantity > 0) {
            averageCommentsPerUser = commentsQuantity / (double) usersQuantity;
        } else {
            averageCommentsPerUser = 0;
        }
        if (postsQuantity > 0) {
            averageCommentsPerPost = commentsQuantity / (double) postsQuantity;
        } else {
            averageCommentsPerPost = 0;
        }
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

}
