package dev.millzyg.jssa;

import com.google.gson.JsonObject;

/**
 * Represents a scoreStats Object in a Player Object
 */
public class ScoreStats {
    /**
     * The player's total accumulated score
     */
    public int totalScore;

    /**
     * The player's total ranked score
     */
    public int totalRankedScore;

    /**
     * The player's average hit accuracy
     */
    public float averageRankedAccuracy;

    /**
     * The total number of songs the player has played
     */
    public int totalPlayCount;

    /**
     * The total number of songs the player has played
     */
    public int rankedPlayCount;

    /**
     *  Constructs a new ScoreStats object
     * @param jsonObject A Gson JsonObject is taken as an argument and then gets converted into an object.
     */
    ScoreStats(JsonObject jsonObject) {
        this.totalScore = jsonObject.get("totalScore").getAsInt();
        this.totalRankedScore = jsonObject.get("totalRankedScore").getAsInt();
        this.averageRankedAccuracy = jsonObject.get("averageRankedAccuracy").getAsFloat();
        this.totalPlayCount = jsonObject.get("totalPlayCount").getAsInt();
        this.rankedPlayCount = jsonObject.get("rankedPlayCount").getAsInt();
    }
}
