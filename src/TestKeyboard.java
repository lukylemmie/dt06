/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 7:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestKeyboard {
    public static void main(String[] args){
        String message;

        Keyboard keyboard = new Keyboard();

        message = keyboard.getMessage();

        System.out.println(message);
    }
}
