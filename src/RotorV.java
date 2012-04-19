/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotorV extends Rotor {
    private final static String LETTERS = "VZBRGITYUPSDNHLXAWMJQOFECK";
    private final static char notch = 'Z';

    public RotorV() {
        super(LETTERS.toCharArray(), notch);
    }

    public RotorV(boolean testing){
        super(LETTERS.toCharArray(), notch, testing);

    }
}
