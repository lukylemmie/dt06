/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Reflector {
    private final static boolean DEBUG = false;

    public final static int SIZE_ALPHABET = 26;

    private final int[] reflection = new int[SIZE_ALPHABET];

    private int position = 0;

    public Reflector(char[] letters){
        for(int i = 0; i < SIZE_ALPHABET; i++){
            reflection[i] = letters[i] - 'A';
        }

        for(int i = 0; i < SIZE_ALPHABET; i++){
            if(reflection[reflection[i]] != i){
                System.out.println("ERROR! Reflector doesn't reflect.");
            }
        }
    }

    public int passSignal(int signal){
        if(DEBUG){
            System.out.print("Reflect In " + position + " ");
            System.out.println((char) (signal + 'A'));
        }
        signal += position;
        signal %= SIZE_ALPHABET;

        signal = reflection[signal];

        signal += (SIZE_ALPHABET - position);
        signal %= SIZE_ALPHABET;
        if(DEBUG){
            System.out.print("Reflect Out " + position + " ");
            System.out.println((char) (signal + 'A'));
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
