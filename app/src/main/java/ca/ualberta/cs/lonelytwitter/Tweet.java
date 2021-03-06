package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Nathan Nguyen on 1/17/17.
 *
 * Tweet class is a super class that implements Tweetable
 */

public abstract class Tweet implements Tweetable {
    /**
     * Tweet class holds the moods or tweets
     * and throws the tweet too long exceptions.
     * Also has other functions such as get the tweet
     * or set the date.
     */


    private Date date;
    private String message;
    private ArrayList<Mood> Moodlist = new ArrayList<Mood>();

    /**
     * Array list of moods
     * @param moodlist
     */
    public Tweet(ArrayList<Mood> moodlist) {
        Moodlist = moodlist;
    }

    /**
     * Add moods
     * @param mood
     */
    public void addMood(Mood mood){
        Moodlist.add(mood);
    }

    /**
     * Getters and Setters for the mood
     * @return
     */
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    /**
     * Checks for tweet too long exception
     * and changes the message
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144) {
            // todo throw new error here
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Sets the message and date
     */
    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    /**
     * Sets the messeage and date to the current time
     * @param message
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date(); // current time and date
    }

    /**
     * Is important method that each subclass
     * should have
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Returns a formated string
     * @return
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}