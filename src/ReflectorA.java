/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReflectorA extends Reflector {
    private final static String LETTERS = "EJMZALYXVBWFCRQUONTSPIKHGD";
//    private final static char[] LETTERS = {'E','J','M','Z','A','L','Y','X','V','B','W','F','C','R','Q','U','O','N','T','S','P','I','K','H','G','D'};

    public ReflectorA() {
        super(LETTERS.toCharArray());
    }
}
