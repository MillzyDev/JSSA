package example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.millzyg.jssa.JSSA;

import java.io.IOException;

public class GetBelowTopRequestsExample {
    public static void GetBelowTopRequests() throws IOException {
        JSSA jssa = new JSSA();
        Gson converter = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = converter.toJson(
                jssa.Requests.getBelowTopRequests().stream().findFirst()
        );

        System.out.println(requestJson);
    }
}
