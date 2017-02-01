package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nn2 on 1/17/17.
 */

public class HappyMood extends Mood {
    /**
     * Sets the mood to "happy"
     * and can let the user set a date or leave the date
     * to be set arbitrarily.
     */
    public HappyMood(){
        super("Happy");
    }
    public HappyMood(Date date){
        super(date, "Happy");
    }
}