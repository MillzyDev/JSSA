package dev.MillzyG.JSSA;

import com.google.gson.JsonObject;

public class SimplePlayer {
    public String playerId;
    public String playerName;
    public int rank;
    public float pp;
    public String avatar;
    public String country;
    public String history;
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
