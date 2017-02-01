package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nn2 on 1/17/17.
 */

public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * Gets the message without a date
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Sets the tweet to not important
     * @return
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
