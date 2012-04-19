/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 5:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestRotor {
    public static void main(String[] args){
        boolean allPassed = true;
        allPassed &= testRotorI();
        allPassed &= testRotorII();
        allPassed &= testRotorIII();
        allPassed &= testRotorIV();
        allPassed &= testRotorV();
        allPassed &= testRotorVI();
        allPassed &= testRotorVII();
        allPassed &= testRotorVIII();

        if(allPassed){
            System.out.println("All tests PASSED! You are AWESOME!");
        }
    }

    private static boolean testRotorI() {
        //variables
        boolean passed = true;
        int output = 0;
        char printOutput;
        char[] rotorIArray = {'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W','Y','H','X','U','S','P','A','I','B','R','C','J'};

        //objects
        RotorI rotorI = new RotorI(true);

        for(int i = 0; i < Rotor.SIZE_ALPHABET; i++){
            output = rotorI.passSignal(i);
            printOutput = (char)(output + 'A');
            if(printOutput != rotorIArray[i]){
                passed = false;
            }
        }
        if(passed){
            System.out.println("testRotorI PASSED!");
        } else {
            System.out.println("testRotorI FAILED!");
        }

        return passed;
    }

    private static boolean testRotorII() {
        boolean passed = true;
        int output = 0;
        char printOutput;
        char[] rotorIIArray = {'A','J','D','K','S','I','R','U','X','B','L','H','W','T','M','C','Q','G','Z','N','P','Y','F','V','O','E'};

        //objects
        RotorII rotorII = new RotorII(true);

        for(int i = 0; i < Rotor.SIZE_ALPHABET; i++){
            output = rotorII.passSignal(i);
            printOutput = (char)(output + 'A');
            if(printOutput != rotorIIArray[i]){
                passed = false;
            }
        }
        if(passed){
            System.out.println("testRotorI PASSED!");
        } else {
            System.out.println("testRotorI FAILED!");
        }

        return passed;
    }

    private static boolean testRotorIII() {
        boolean passed = true;

        return passed;
    }

    private static boolean testRotorIV() {
        boolean passed = true;

        return passed;
    }

    private static boolean testRotorV() {
        boolean passed = true;

        return passed;
    }

    private static boolean testRotorVI() {
        boolean passed = true;

        return passed;
    }

    private static boolean testRotorVII() {
        boolean passed = true;

        return passed;
    }

    private static boolean testRotorVIII() {
        boolean passed = true;

        return passed;
    }
}
