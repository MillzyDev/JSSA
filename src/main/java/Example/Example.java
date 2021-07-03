package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("What Example would you like to see?");
            System.out.println("[1] GetPlayer()");
            System.out.println("[2] SearchPlayers()");
            System.out.println("[3] GetRequest()");
            System.out.println("[4] GetTopRequests()");
            System.out.println("[5] GetBelowTopRequests()");
            System.out.print("Enter a number: ");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            int code = Integer.parseInt(reader.readLine());

            switch (code) {
                case 1:
                    GetPlayerExample.GetPlayer();
                    break;
                case 2:
                    SearchPlayersExample.SearchPlayers();
                    break;
                case 3:
                    GetRequestExample.GetRequest();
                case 4:
                    GetTopRequestsExample.GetTopRequests();
                default:
                    System.out.println("Invalid Input...");
            }
        }
    }
}
