/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class EnigmaMachineM3 implements EnigmaMachine {
    public final static int NUMBER_OF_ROTORS = 3;
    public final static int DIFFERENT_ROTORS = 8;

    Rotor[] rotors = new Rotor[NUMBER_OF_ROTORS];
    Reflector reflector = null;
    Keyboard keyboard = new Keyboard();

    public EnigmaMachineM3(){
    }

    public void setRotors(int rotorVersion[]){

        for(int i = 0; i < rotorVersion.length; i++){
            if(rotorVersion[i] == 1){
                rotors[i] = new RotorI();
            } else if(rotorVersion[i] == 2){
                rotors[i] = new RotorII();
            } else if(rotorVersion[i] == 3){
                rotors[i] = new RotorIII();
            } else if(rotorVersion[i] == 4){
                rotors[i] = new RotorIV();
            } else if(rotorVersion[i] == 5){
                rotors[i] = new RotorV();
            } else if(rotorVersion[i] == 6){
                rotors[i] = new RotorVI();
            } else if(rotorVersion[i] == 7){
                rotors[i] = new RotorVII();
            } else if(rotorVersion[i] == 8){
                rotors[i] = new RotorVIII();
            }
        }
    }

    public void setReflector(char reflectorChoice){
        if(reflectorChoice == 'A'){
            reflector = new ReflectorA();
        } else if(reflectorChoice == 'B'){
            reflector = new ReflectorB();
        } else if (reflectorChoice == 'C'){
            reflector = new ReflectorC();
        }
    }

    public void makeConnections(){
        rotors[0].setNextRotor(rotors[1]);
        rotors[1].setNextRotor(rotors[2]);
        rotors[2].setReflector(reflector);
    }

    public void runMachine(){
        String message;
        String encryption = "";
        char letter;

        message = keyboard.getMessage();

        for(int i = 0; i < message.length(); i++){
            push();
            letter = (char)(rotors[0].passSignal(message.charAt(i) - 'A') + 'A');
            encryption += letter;
        }

        System.out.println(encryption);
    }

    public void push(){
        rotors[0].push();

        if(rotors[1].pushable()){
            rotors[1].push();
            rotors[2].push();
        }

        if(rotors[0].pushNext()){
            rotors[1].push();
        }
    }

    @Override
    public int numberOfSettableWheels() {
        return NUMBER_OF_ROTORS;
    }

    @Override
    public void setIndicators(String setting) {
        for(int i = 0; i < NUMBER_OF_ROTORS; i++){
            rotors[i].setPosition(setting.charAt(NUMBER_OF_ROTORS - 1 - i) - 'A');
        }
    }

    @Override
    public String getCurrentIndicators() {
        String indicators = "";

        for(int i = 0; i < NUMBER_OF_ROTORS; i++){
            indicators += (char)(rotors[NUMBER_OF_ROTORS - 1 - i].getPosition() + 'A');
        }

        return indicators;
    }

    @Override
    public String encipher(String plainText) {
        String message;
        String encryption = "";
        char letter;

        message = keyboard.processMessage(plainText);

        for(int i = 0; i < message.length(); i++){
            push();
            letter = (char)(rotors[0].passSignal(message.charAt(i) - 'A') + 'A');
            encryption += letter;
        }

        return encryption;
    }
}
