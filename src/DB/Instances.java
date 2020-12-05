package DB;

import actions.Match;
import people.*;
import actions.Training;

import java.util.ArrayList;

public class Instances {
    private static Manager globalManager;
    private static ArrayList<Training> globalTraining = new ArrayList<>();
    private static ArrayList<Coach> globalCoaches = new ArrayList<>();
    private static ArrayList<Adults> globalAdults = new ArrayList<>();
    private static ArrayList<Kids> globalKids = new ArrayList<>();
    private static Match globalMatch;
    private static Training globalKidTraining;

    private static Instances globalInstance;

    public static Instances getGlobalInstance(){
        if(globalInstance == null){
            globalInstance = new Instances();
        }
        return globalInstance;
    }

    public static void addGlobalPlayer(Adults adults){
        globalAdults.add(adults);
    }

    public static void addGlobalKid(Kids kids){
        globalKids.add(kids);
    }

    public static void addGlobalCoaches(Coach coach){
        globalCoaches.add(coach);
    }

    public static void addGlobalManager(Manager manager){
        globalManager = manager;
    }

    public static void addGlobalTraining(Training training){
        globalTraining.add(training);
    }

    public static void addGlobalKidTraining(Training training){
        globalKidTraining = training;
    }

    public static void addGlobalMatch(Match match){
        globalMatch = match;
    }

    public static Match getGlobalMatch(){
        return globalMatch;
    }

    public static Manager getGlobalManager(){
        return globalManager;
    }

    public static ArrayList<Coach> getGlobalCoaches() {return globalCoaches;}

    public static ArrayList<Adults> getGlobalAdults() {return globalAdults;}

    public static Training getGlobalTraining(int index) {return globalTraining.get(index);}

    public static int getGlobalTrainingNumber() {return globalTraining.size()-1;}

    public static ArrayList<Kids> getGlobalKids() {return globalKids;}

    public static Training getGlobalTrainingKids() {return globalKidTraining;}
}

