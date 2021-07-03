package Example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.MillzyG.JSSA.JSSA;

import java.io.IOException;

public class GetTopRequestsExample {
    public static void GetTopRequests() throws IOException {
        JSSA jssa = new JSSA();
        Gson converter = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = converter.toJson(
                jssa.Requests.GetTopRequests().get(0)
        );

        System.out.println(requestJson);
    }
}
