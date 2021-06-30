package dev.MillzyG.JSSA;

import com.google.gson.JsonObject;

import java.io.IOException;

public class Request {
    private String request;

    public int songId;
    public int requestType;
    public String description;
    public int approved;
    public String id;
    public String name;
    public String levelAuthorName;
    public int difficulty;
    public int rankUpvotes;
    public int rankDownvotes;
    public int qatUpvotes;
    public int qatDownvotes;
    public Comment[] rankComments;
    public Comment[] qatComments;
    public Difficulty[] difficulties;

    Request(JsonObject jsonObject) throws IOException {

    }
}
