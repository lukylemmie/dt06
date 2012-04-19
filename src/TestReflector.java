/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 5:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestReflector {

    public static void main(String[] args){
        boolean allPassed = true;

        allPassed &= testReflectorA();
        allPassed &= testReflectorB();
        allPassed &= testReflectorC();

        if(allPassed){
            System.out.println("All tests PASSED! You are AWESOME!");
        }
    }

    private static boolean testReflectorA() {
        boolean passed = true;

        return passed;
    }

    private static boolean testReflectorB() {
        boolean passed = true;

        return passed;
    }

    private static boolean testReflectorC() {
        boolean passed = true;

        return passed;
    }


}
