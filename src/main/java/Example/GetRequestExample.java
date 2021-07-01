package Example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.MillzyG.JSSA.JSSA;

import java.io.IOException;

public class GetRequestExample {
    public static void GetRequest() throws IOException {
        JSSA jssa = new JSSA();
        Gson converter = new GsonBuilder().setPrettyPrinting().create();

        String req = "6243";

        String requestJson = converter.toJson(
                jssa.Requests.GetRequest(req)
        );

        System.out.println(requestJson);
    }
}
