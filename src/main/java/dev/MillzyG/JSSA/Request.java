package dev.MillzyG.JSSA;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Represents a full request from a specific ID
 * @since v0.2.0
 */
public class Request {
    /**
     * The id of the song
     */
    public int songId;

    /**
     * Type of request
     */
    public int requestType;

    /**
     * Song's description
     */
    public String description;

    /**
     *
     */
    public int approved;

    /**
     *
     */
    public String id;

    /**
     * Song's name
     */
    public String name;

    /**
     * Name of the level's author
     */
    public String levelAuthorName;

    /**
     * Song difficulty
     */
    public int difficulty;

    /**
     * Ranked upvotes
     */
    public int rankUpvotes;

    /**
     * Ranked downvotes
     */
    public int rankDownvotes;

    /**
     * Upvotes
     */
    public int qatUpvotes;

    /**
     * Downvotes
     */
    public int qatDownvotes;

    /**
     * Ranked comments
     */
    public ArrayList<Comment> rankComments;

    /**
     * Ranked comments
     */
    public ArrayList<Comment> qatComments;

    /**
     * List of each difficulty available
     */
    public ArrayList<Difficulty> difficulties;

    private ArrayList<Comment> listComments(JsonArray comments) {
        ArrayList<Comment> out = new ArrayList<Comment>();
        for (JsonElement comment : comments) {
            out.add(new Comment(comment.getAsJsonObject()));
        }
        return out;
    }

    private ArrayList<Difficulty> listDifficulties(JsonArray difficulties) {
        ArrayList<Difficulty> out = new ArrayList<Difficulty>();
        for (JsonElement difficulty : difficulties) {
            out.add(new Difficulty(difficulty.getAsJsonObject()));
        }
        return out;
    }

    Request(JsonObject jsonObject) throws IOException {
        JsonObject request = jsonObject.get("request").getAsJsonObject();
        JsonObject info = request.get("info").getAsJsonObject();

        this.songId = info.get("songId").getAsInt();
        this.requestType = info.get("requestType").getAsInt();
        this.description = info.get("description").getAsString();
        this.approved = info.get("approved").getAsInt();
        this.id = info.get("id").getAsString();
        this.name = info.get("name").getAsString();
        this.levelAuthorName = info.get("levelAuthorName").getAsString();
        this.difficulty = info.get("difficulty").getAsInt();
        this.rankUpvotes = info.get("rankVotes").getAsJsonObject().get("upvotes").getAsInt();
        this.rankDownvotes = info.get("rankVotes").getAsJsonObject().get("downvotes").getAsInt();
        this.qatUpvotes = info.get("qatVotes").getAsJsonObject().get("upvotes").getAsInt();
        this.qatDownvotes = info.get("qatVotes").getAsJsonObject().get("downvotes").getAsInt();
        this.rankComments = listComments(info.get("rankComments").getAsJsonArray());
        this.qatComments = listComments(info.get("qatComments").getAsJsonArray());
        this.difficulties = listDifficulties(request.get("difficulties").getAsJsonArray());
    }
}
