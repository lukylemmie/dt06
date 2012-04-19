/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 9:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotorVII extends Rotor {
    private final static String LETTERS = "NZJHGRCXMYSWBOUFAIVLPEKQDT";
    private final static char notch1 = 'Z';
    private final static char notch2 = 'M';

    public RotorVII() {
        super(LETTERS.toCharArray(), notch1, notch2);
    }

    public RotorVII(boolean testing){
        super(LETTERS.toCharArray(), notch1, notch2, testing);
    }
}
