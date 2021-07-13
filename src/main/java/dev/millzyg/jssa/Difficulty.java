package dev.millzyg.jssa;

import com.google.gson.JsonObject;

/**
 * Represents a difficulty in a request
 * @since v0.3.0
 */
public class Difficulty {
    /**
     * Request number
     */
    public int request;

    /**
     * Request's unique id
     */
    public int uid;

    /**
     * Max performance points available
     */
    public int max_pp;

    /**
     * Difficulty level
     */
    public int difficulty;

    public Difficulty(JsonObject jsonObject) {
        this.request =  jsonObject.get("request").getAsInt();
        this.uid = jsonObject.get("uid").getAsInt();
        this.max_pp = jsonObject.get("max_pp").getAsInt();
        this.difficulty = jsonObject.get("difficulty").getAsInt();
    }
}
