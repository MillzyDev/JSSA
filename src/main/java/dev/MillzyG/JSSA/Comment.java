package dev.MillzyG.JSSA;

import com.google.gson.JsonObject;

public class Comment {
    /**
     * The content of the comment
     */
    public String comment;

    /**
     * The comment author's id
     */
    public String userId;

    /**
     * Time of comment submission
     */
    public String time;

    /**
     *
     */
    public String name;

    public Comment(JsonObject jsonObject) {
        this.comment = jsonObject.get("comment").getAsString();
        this.userId = jsonObject.get("userId").getAsString();
        this.time = jsonObject.get("time").getAsString();
        this.name = jsonObject.get("name").getAsString();
    }
}
