package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nn2 on 1/17/17.
 */

public class ImportantTweet extends Tweet {
    /** Sets an important Tweet which extends the super class tweet.
     * Sets the boolean isImportant to True.
     * @param date
     * @param message
     * @throws TweetTooLongException
     */
    public ImportantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Changes the message
     * @param message
     * @throws TweetTooLongException
     */
    public ImportantTweet(String message) throws TweetTooLongException{
        super(message);
    }

    /**
     * Sets the tweet to important
     * @return
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * Returns the message
     * @return
     */
    @Override
    public String getMessage() {
        return super.getMessage() +" !!!!";
    }
}
