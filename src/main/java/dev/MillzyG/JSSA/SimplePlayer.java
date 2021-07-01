package dev.MillzyG.JSSA;

import com.google.gson.JsonObject;

public class SimplePlayer {
    /**
     * Player's ID
     */
    public String playerId;

    /**
     * Player's username
     */
    public String playerName;

    /**
     * Player's global rank
     */
    public int rank;

    /**
     * Player's performance points
     */
    public float pp;

    /**
     * Player's avatar path from base url
     */
    public String avatar;

    /**
     * Player's 2 letter country code
     */
    public String country;

    /**
     *
     */
    public String history;

    /**
     *
     */
    public int difference;

    public SimplePlayer(JsonObject jsonObject) {
        this.playerId = jsonObject.get("playerId").getAsString();
        this.playerName = jsonObject.get("playerName").getAsString();
        this.rank = jsonObject.get("rank").getAsInt();
        this.pp = jsonObject.get("pp").getAsFloat();
        this.avatar = jsonObject.get("avatar").getAsString();
        this.country = jsonObject.get("country").getAsString();
        this.history = jsonObject.get("history").getAsString();
        this.difference = jsonObject.get("difference").getAsInt();
    }
}
