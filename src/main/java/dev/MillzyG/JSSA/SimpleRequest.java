package dev.MillzyG.JSSA;

import com.google.gson.JsonObject;

/**
 * Represents a request listed in the top requests or below top requests
 * @since v0.3.0
 */
public class SimpleRequest {
    /**
     * Request number
     */
    public int request;

    /**
     * Song's ID
     */
    public int songId;

    /**
     * Request's weight
     */
    public int weight;

    /**
     * Song's name
     */
    public String name;

    /**
     * Song author name
     */
    public String levelAuthorName;

    /**
     *
     */
    public String id;

    /**
     * Song creation date
     */
    public String created_at;

    /**
     * Song's ranked upvotes
     */
    public int rankUpvotes;

    /**
     * Song's ranked downvotes
     */
    public int rankDownvotes;

    /**
     * Song's upvotes
     */
    public int qatUpvotes;

    /**
     * Song's downvotes
     */
    public int qatDownvotes;

    /**
     * Song's difficulty count
     */
    public int difficulties;

    /**
     * Constructs a new SimpleRequest object
     * @param jsonObject the given json object gets converted into a SimpleRequest Object
     */
    public SimpleRequest(JsonObject jsonObject) {
        this.request = jsonObject.get("request").getAsInt();
        this.songId = jsonObject.get("songId").getAsInt();
        this.weight = jsonObject.get("weight").getAsInt();
        this.name = jsonObject.get("name").getAsString();
        this.levelAuthorName = jsonObject.get("levelAuthorName").getAsString();
        this.id = jsonObject.get("id").getAsString();
        this.created_at = jsonObject.get("created_at").getAsString();

        JsonObject rankVotes = jsonObject.get("rankVotes").getAsJsonObject();
        this.rankUpvotes = rankVotes.get("upvotes").getAsInt();
        this.rankDownvotes = rankVotes.get("downvotes").getAsInt();

        JsonObject qatVotes = jsonObject.get("qatVotes").getAsJsonObject();
        this.qatDownvotes = qatVotes.get("upvotes").getAsInt();
        this.qatUpvotes = qatVotes.get("upvotes").getAsInt();

        this.difficulties = jsonObject.get("difficulties").getAsInt();
    }
}
