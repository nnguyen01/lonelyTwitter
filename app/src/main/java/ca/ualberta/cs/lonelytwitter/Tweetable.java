package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * To be tweetable a class must be able to
 * get a message or get a date.
 */

public interface Tweetable {
    public String getmessage();
    public Date getDate();
}
