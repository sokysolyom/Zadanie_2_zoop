package input;

import java.util.Scanner;
import DB.Instances;

public class InputManager {

    public void getInput(){
        String currentInput;

        System.out.println("Do you want the inforamtions from the match?(Y/N)");

        Scanner scanner = new Scanner(System.in);
        currentInput = scanner.nextLine();

        if(currentInput.equals("Y")) {
            Instances.getGlobalMatch().showInformation();
            Instances.getGlobalMatch().getResult();
        }
        scanner.close();
    }
}
