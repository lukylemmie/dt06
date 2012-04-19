/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 6:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotorI extends Rotor {
    private final static String LETTERS = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
    private final static char notch = 'Q';

    public RotorI() {
        super(LETTERS.toCharArray(), notch);
    }

    public RotorI(boolean testing){
        super(LETTERS.toCharArray(), notch, testing);
    }
}
