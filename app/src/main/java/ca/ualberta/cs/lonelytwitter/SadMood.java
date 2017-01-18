package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nn2 on 1/17/17.
 */

public class SadMood extends Mood {
    public SadMood(){
        super("Sad");
    }
    public SadMood(Date date){
        super(date, "sad");
    }
}