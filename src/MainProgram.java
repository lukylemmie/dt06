import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainProgram {
    public static void main(String[] args){
        int whichMachine = 0;
        Scanner input = new Scanner(System.in);

        EnigmaBuilder builder = new EnigmaBuilder();
        EnigmaMachine machine = null;

        System.out.println("Which machine? (3 or 4): ");
        whichMachine = input.nextInt();
        if(whichMachine == 3){
            machine = builder.constructM3("123B");
        } else if(whichMachine == 4){
            machine = builder.constructM4("1234B");
        }

        if(machine != null){
            machine.runMachine();
        } else {
            System.out.println("Invalid Machine");
        }
    }
}
