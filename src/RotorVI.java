/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 9:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotorVI extends Rotor {
    private final static String LETTERS = "JPGVOUMFYQBENHZRDKASXLICTW";
    private final static char notch1 = 'Z';
    private final static char notch2 = 'M';

    public RotorVI() {
        super(LETTERS.toCharArray(), notch1, notch2);
    }

    public RotorVI(boolean testing){
        super(LETTERS.toCharArray(), notch1, notch2, testing);
    }
}
