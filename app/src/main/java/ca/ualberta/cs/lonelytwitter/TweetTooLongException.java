package ca.ualberta.cs.lonelytwitter;

/**
 * Created by nn2 on 1/17/17.
 */

public class TweetTooLongException extends Exception {
    /**
     * Instantiates the Tweet Too Long Exception
     * that states that a tweet a user has put is too long
     */
    public TweetTooLongException() {
    }

    /**
     * Gets the detailed message
     * when the exception is thrown
     * @param detailMessage
     */
    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}