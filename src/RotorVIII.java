/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotorVIII extends Rotor {
    private final static String LETTERS = "FKQHTLXOCBJSPDZRAMEWNIUYGV";
    private final static char notch1 = 'Z';
    private final static char notch2 = 'M';

    public RotorVIII() {
        super(LETTERS.toCharArray(), notch1, notch2);
    }

    public RotorVIII(boolean testing){
        super(LETTERS.toCharArray(), notch1, notch2, testing);
    }
}
