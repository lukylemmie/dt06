/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 6:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotorII extends Rotor {
    private final static String LETTERS = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
    private final static char notch = 'E';

    public RotorII() {
        super(LETTERS.toCharArray(), notch);
    }

    public RotorII(boolean testing){
        super(LETTERS.toCharArray(), notch, testing);
    }
}
