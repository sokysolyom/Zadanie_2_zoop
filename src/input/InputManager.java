package input;

import java.util.Scanner;
import DB.Instances;
import actions.Training;
import people.Adults;
import people.Coach;
import people.Kids;
import people.Manager;

public class InputManager {
    private Scanner scanner;

    public InputManager(){
        scanner = new Scanner(System.in);
    }

    public void mainLoop(){
        while(true){
            String mainLoopInput;
            int index;

            System.out.println("1 - Show Players");
            System.out.println("2 - Show Coaches");
            System.out.println("3 - Show Manager");
            System.out.println("4 - Simulate Training");
            System.out.println("5 - Simulate Match");
            System.out.println("6 - Show Kids");
            System.out.println("0 - Exit");

            mainLoopInput = scanner.nextLine();
            if(mainLoopInput.equals("1")) {
                for(Adults adults : Instances.getGlobalAdults())
                    adults.Introduce();
            }
            if(mainLoopInput.equals("2")) {
                for(Coach coaches : Instances.getGlobalCoaches())
                    coaches.getInfoTraining();
            }
            if(mainLoopInput.equals("3")) {
                Instances.getGlobalManager().Introduce();
            }
            if(mainLoopInput.equals("4")) {
                System.out.println("0-"+ Instances.getGlobalTrainingNumber() +" - Which training information do you want?");
                index = scanner.nextInt();
                scanner.nextLine();
                    Instances.getGlobalTraining(index).showInformation();
            }

            if(mainLoopInput.equals("5")) {
                System.out.println("1 - Match with players/coaches/headcoach/manager");
                System.out.println("2 - Only the score");
                mainLoopInput = scanner.nextLine();
                if(mainLoopInput.equals("1")) {
                    Instances.getGlobalMatch().showInformation();
                    Instances.getGlobalMatch().getResult();
                }
                if(mainLoopInput.equals("2")) Instances.getGlobalMatch().getResult();
            }
            if(mainLoopInput.equals("6")) {
                System.out.println("1 - All kids with");
                System.out.println("2 - Kids training information");
                index = scanner.nextInt();
                scanner.nextLine();
                if(index == 1) {
                    for(Kids kids : Instances.getGlobalKids())
                        kids.Introduce();
                }
                if(index == 2) Instances.getGlobalTrainingKids().showInformationKid();
            }
            if(mainLoopInput.equals("0")) {
                break;
            }
        }
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
    //overload
    public void getInput(Training training){
        String wantsInformation;

        System.out.println("Do you want the inforamtions from "+ training.day +"s training?(Y/N)");

        wantsInformation = scanner.nextLine();

        if(wantsInformation.equals("Y")) {
            training.showInformation();
        }
    }
}
