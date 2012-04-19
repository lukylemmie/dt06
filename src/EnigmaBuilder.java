/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 9:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class EnigmaBuilder {
    // Walzenlage: Choice and order of wheels
    // input walzenlage is three digits in range 1..8 denoting slow,med,fast rotors in that order.
    // (digits 1..8 correspond to enigma rotors I..VIII)
    public static EnigmaMachine constructM3 (String walzenlage) {
        EnigmaMachineM3 machineM3 = new EnigmaMachineM3();
        int[] rotorVersion = new int[EnigmaMachineM3.NUMBER_OF_ROTORS];

        for(int i = 0; i < EnigmaMachineM3.NUMBER_OF_ROTORS; i++){
            rotorVersion[i] = walzenlage.charAt(EnigmaMachineM3.NUMBER_OF_ROTORS - 1 - i) - '0';
        }

        machineM3.setRotors(rotorVersion);

        machineM3.setReflector(walzenlage.charAt(EnigmaMachineM3.NUMBER_OF_ROTORS));

        machineM3.makeConnections();

        return machineM3;  // replace this when you implement the M3
    }

    // walezenlage is four digits in range 1..8 denoting slowest,slow,med,fast rotors in
    // that order, followed by a letter in range A..C denoting the reflector type.
    public static EnigmaMachine constructM4 (String walzenlage) {
        EnigmaMachineM4 machineM4 = new EnigmaMachineM4();
        int[] rotorVersion = new int[EnigmaMachineM4.NUMBER_OF_ROTORS];

        for(int i = 0; i < EnigmaMachineM4.NUMBER_OF_ROTORS; i++){
            rotorVersion[i] = walzenlage.charAt(EnigmaMachineM4.NUMBER_OF_ROTORS - 1 - i) - '0';
        }

        machineM4.setRotors(rotorVersion);

        machineM4.setReflector(walzenlage.charAt(EnigmaMachineM4.NUMBER_OF_ROTORS));

        machineM4.makeConnections();

        return machineM4;  // replace this when you implement the M4
    }

    // ringstellung is the ring settings for each of the 5 wheels (specified in the same
    // order as the wheels are given in the walzenlage).
    // Notice that the M4 is just the M4_1 with a ringstellung of "AAAAA"
    public static EnigmaMachine constructM4_1 (String walzenlage, String ringstellung) {
        return null;  // replace this when you implement the M4_1
    }
}
