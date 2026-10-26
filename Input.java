import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) {

        String name = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your name: ");
            name = br.readLine();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        System.out.println("Your name is " + name);
    }
}
