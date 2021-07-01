package dev.MillzyG.JSSA;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class PlayerInfo {
    /**
     * The player's unique ID
     */
    public String playerId;

    /**
     * The player's username
     */
    public String playerName;

    /**
     * The player's avatar path
     */
    public String avatar;

    /**
     * The player's global rank
     */
    public int rank;

    /**
     * The player's national rank
     */
    public int countryRank;

    /**
     * The player's performance points
     */
    public float pp;

    /**
     * The player's 2 letter country code
     */
    public String country;

    /**
     * The player's Score Saber role
     */
    public String role;

    /**
     * The player's Score Saber badges
     */
    public String[] badges;

    /**
     * The player's history
     */
    public String history;

    /**
     * The player's permissions
     */
    public int permissions;

    /**
     *
     */
    public int inactive;

    /**
     *
     */
    public int banned;

    /**
     * @param jsonObject A Gson JsonObject is taken as an argument and then gets converted into an object.
     */
    PlayerInfo(JsonObject jsonObject) {
        Gson converter = new Gson();

        this.playerId = jsonObject.get("playerId").getAsString();
        this.playerName = jsonObject.get("playerName").getAsString();
        this.avatar = jsonObject.get("avatar").getAsString();
        this.rank = jsonObject.get("rank").getAsInt();
        this.countryRank = jsonObject.get("countryRank").getAsInt();
        this.pp = jsonObject.get("pp").getAsFloat();
        this.country = jsonObject.get("country").getAsString();
        this.role = jsonObject.get("role").isJsonNull() ? null : jsonObject.get("role").getAsString();
        this.badges = converter.fromJson(jsonObject.get("badges"), String[].class);
        this.history = jsonObject.get("history").getAsString();
        this.permissions = jsonObject.get("permissions").getAsInt();
        this.inactive = jsonObject.get("inactive").getAsInt();
        this.banned = jsonObject.get("banned").getAsInt();
    }
}
