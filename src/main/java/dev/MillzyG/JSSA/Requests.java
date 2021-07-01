package dev.MillzyG.JSSA;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Requests extends Base {
    //ArrayList<Request> GetTopRequests() {

    //}

    //ArrayList<Request> GetAllRequests() {

    //}

    /**
     * Searches for a single request based on request number given.
     * @param req request number
     * @return Returns matching request
     * @throws IOException
     */
    public Request GetRequest(String req) throws IOException {
        String sURl = baseURL + "/api/ranking/request/" + req;

        URL url = new URL(sURl);
        URLConnection request = url.openConnection();
        request.connect();

        JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent())).getAsJsonObject();
        return new Request(jsonObject);
    }
}
