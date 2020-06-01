package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Millenials");
        User yGeneration = new YGeneration("Y Generation");
        User zGeneration = new ZGeneration("Z Generation");

        //When
        String millenialsSharePostFrom = millenials.sharePost();
        System.out.println("Millenials posts from: " + millenialsSharePostFrom);
        String yGenerationSharePostFrom = yGeneration.sharePost();
        System.out.println("Y Generation posts from: " + yGenerationSharePostFrom);
        String zGenerationSharePostFrom = zGeneration.sharePost();
        System.out.println("Z Generation posts from: " + zGenerationSharePostFrom);

        //Then
        Assert.assertEquals("Facebook", millenialsSharePostFrom);
        Assert.assertEquals("Twitter", yGenerationSharePostFrom);
        Assert.assertEquals("Snapchat", zGenerationSharePostFrom);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User zGeneration = new ZGeneration("Z Generation");

        //When
        String zGenerationSharePostFrom = zGeneration.sharePost();
        System.out.println("Z Generation post from: " + zGenerationSharePostFrom);
        zGeneration.setSocialPublisher(new TwitterPublisher());
        zGenerationSharePostFrom = zGeneration.sharePost();
        System.out.println("Z Generation post from: " + zGenerationSharePostFrom);

        //Then
        Assert.assertEquals("Twitter", zGenerationSharePostFrom);
    }
}
