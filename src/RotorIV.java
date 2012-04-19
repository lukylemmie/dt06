/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotorIV extends Rotor {
    private final static String LETTERS = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
    private final static char notch = 'J';

    public RotorIV() {
        super(LETTERS.toCharArray(), notch);
    }

    public RotorIV(boolean testing){
        super(LETTERS.toCharArray(), notch, testing);
    }
}
