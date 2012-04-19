import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */

public class Keyboard {
    Scanner input = new Scanner(System.in);

    public Keyboard(){
    }

    public String getMessage(){
        String message = null;

        System.out.println("Type your message: ");

        message = input.nextLine();

        message = message.toUpperCase();

        message = message.replaceAll("[^A-Z]","");

        return message;
    }

    public String processMessage(String message) {
        message = message.toUpperCase();

        message = message.replaceAll("[^A-Z]","");

        return message;
    }
}
