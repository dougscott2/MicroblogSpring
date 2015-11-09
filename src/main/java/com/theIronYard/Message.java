package com.theIronYard;

/**
 * Created by DrScott on 11/9/15.
 */
public class Message {
    int id;
    String text;

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() { //for Json if I end up Jsoning
        return id;
    }

    public String getText() {
        return text;
    }
}
