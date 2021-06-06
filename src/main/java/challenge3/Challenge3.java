package challenge3;
import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        System.out.println("What is the quote?");
        String response = inputs.nextLine();
        String quote = "\"" + response + "." + "\"";
        System.out.println(quote);

    }
}
