package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nn2 on 1/17/17.
 */

public abstract class Mood {
    /**
     * Sets the date and mood as a super class.
     * Happy Mood and Sad Mood call upon this class.
     */
    private Date date;
    private String mood;

    public Mood(String mood) {
        this.date = new Date();
        this.mood = mood;
    }

    public Mood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

}
