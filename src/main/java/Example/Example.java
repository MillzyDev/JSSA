package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws IOException {
        System.out.println("What Example would you like to see?");
        System.out.println("[1] GetPlayer()");
        System.out.println("Enter a number: ");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int code = Integer.parseInt(reader.readLine());

        switch (code) {
            case 1:
                GetPlayerExample.GetPlayer();
                break;
            default:
                System.out.println("Invalid Input...");
        }
    }
}
