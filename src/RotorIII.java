/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotorIII extends Rotor {
    private final static String LETTERS = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
    private final static char notch = 'V';

    public RotorIII() {
        super(LETTERS.toCharArray(), notch);
    }

    public RotorIII(boolean testing){
        super(LETTERS.toCharArray(), notch, testing);
    }
}
