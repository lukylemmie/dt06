/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Rotor {
    private final static boolean DEBUG = false;

    //constants
    public final static int SIZE_ALPHABET = 26;
    private final boolean TESTING;

    //object pointers
    private Rotor nextRotor = null;
    private Reflector reflector = null;

    //variables and arrays
    private final int[] forward = new int[SIZE_ALPHABET];
    private final int[] backward = new int[SIZE_ALPHABET];
    private final int notch1;
    private final int notch2;
    private int position = 0;

    public Rotor(char[] letters, char notch){
        TESTING = false;
        for(int i = 0; i < SIZE_ALPHABET; i++){
            forward[i] = letters[i] - 'A';
            backward[forward[i]] = i;
        }

        notch1 = notch - 'A';
        notch2 = -10;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Rotor(char[] letters, char notch1, char notch2){
        TESTING = false;
        for(int i = 0; i < SIZE_ALPHABET; i++){
            forward[i] = letters[i] - 'A';
            backward[forward[i]] = i;
        }

        this.notch1 = notch1 - 'A';
        this.notch2 = notch2 - 'A';
    }

    public Rotor(char[] letters, char notch, boolean testing){
        TESTING = testing;
        for(int i = 0; i < SIZE_ALPHABET; i++){
            forward[i] = letters[i] - 'A';
            backward[forward[i]] = i;
        }

        this.notch1 = notch - 'A';
        this.notch2 = -10;
    }

    public Rotor(char[] letters, char notch1, char notch2, boolean testing){
        TESTING = testing;
        for(int i = 0; i < SIZE_ALPHABET; i++){
            forward[i] = letters[i] - 'A';
            backward[forward[i]] = i;
        }

        this.notch1 = notch1 - 'A';
        this.notch2 = notch2 - 'A';
    }

    public void setNextRotor(Rotor nextRotor) {
        this.nextRotor = nextRotor;
    }

    public void setReflector(Reflector reflector) {
        this.reflector = reflector;
    }

    public int passSignal(int signal){
        if(DEBUG){
            System.out.print("Letter In " + position + " ");
            System.out.println((char) (signal + 'A'));
        }

        signal += position;
        signal %= SIZE_ALPHABET;
        if(DEBUG){
            System.out.print("BeforeForward " + position + " ");
            System.out.println((char) (signal + 'A'));
        }
        signal = forward[signal];
        if(DEBUG){
            System.out.print("AfterForward " + position + " ");
            System.out.println((char) (signal + 'A'));
        }
        signal += (SIZE_ALPHABET - position);
        signal %= SIZE_ALPHABET;

        if(!TESTING){
            if(nextRotor != null){
                signal = nextRotor.passSignal(signal);  // WARNING: recursive function
            } else {
                signal = reflector.passSignal(signal);
            }
            if(DEBUG){
                System.out.print("Letter Out " + position + " ");
                System.out.println((char) (signal + 'A'));
            }

            signal += position;
            signal %= SIZE_ALPHABET;
            if(DEBUG){
                System.out.print("BeforeBackward " + position + " ");
                System.out.println((char) (signal + 'A'));
            }
            signal = backward[signal];
            if(DEBUG){
                System.out.print("AfterBackward " + position + " ");
                System.out.println((char) (signal + 'A'));
            }
            signal += (SIZE_ALPHABET - position);
            signal %= SIZE_ALPHABET;
        }

        return signal;
    }

    // turns the rotor clockwise once
    public void push(){
        turnOne(true);
    }

    private void turnOne(boolean clockwise){
        if(clockwise){
            position++;
            position %= SIZE_ALPHABET;
        } else {
            position += (SIZE_ALPHABET - 1);
            position %= SIZE_ALPHABET;
        }
    }

    public void turn(int value){
        boolean clockwise = true;
        boolean anticlockwise = false;
        if(value > 0){
            for(int i = 0; i < value; i++){
                turnOne(clockwise);
            }
        } else {
            for(int i = 0; i > value; i--){
                turnOne(anticlockwise);
            }
        }
    }

    public boolean pushNext(){
        boolean answer = false;
        if((position == (notch1 + 1) % SIZE_ALPHABET) || (position == (notch2 + 1) % SIZE_ALPHABET)){
            answer = true;
        }
        return answer;
    }

    public boolean pushable(){
        boolean answer = false;
        if((position == notch1) || (position == notch2)){
            answer = true;
        }
        return answer;
    }
}
