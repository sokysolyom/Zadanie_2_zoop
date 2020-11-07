package input;

import java.util.Scanner;
import DB.Instances;
import actions.Training;

public class InputManager {
    private Scanner scanner;

    public InputManager(){
        scanner = new Scanner(System.in);
    }

    public void getInput(){
        String currentInput;

        System.out.println("Do you want the inforamtions from the match?(Y/N)");

        currentInput = scanner.nextLine();

        if(currentInput.equals("Y")) {
            Instances.getGlobalMatch().showInformation();
            Instances.getGlobalMatch().getResult();
        }
    }

    public void getInput(Training training){
        String wantsInformation;

        System.out.println("Do you want the inforamtions from "+ training.day +"s training?(Y/N)");

        wantsInformation = scanner.nextLine();

        if(wantsInformation.equals("Y")) {
            training.Information();
        }
    }
}
