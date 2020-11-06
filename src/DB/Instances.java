package DB;

import actions.Match;
import people.Coach;
import people.Headcoach;
import people.Manager;
import people.Player;
import actions.Training;

import java.util.ArrayList;

public class Instances {
    private static Manager globalManager;
    private static Headcoach globalHeadcoach;
    private static ArrayList<Training> globalTraining = new ArrayList<>();
    private static ArrayList<Coach> globalCoaches = new ArrayList<>();
    private static ArrayList<Player> globalPlayers = new ArrayList<>();
    private static ArrayList<Training> globalTrainings = new ArrayList<>();
    private static Match globalMatch;

    private static Instances globalInstance;

    public static Instances getGlobalInstance(){
        if(globalInstance == null){
            globalInstance = new Instances();
        }
        return globalInstance;
    }

    public static void addGlobalPlayer(Player player){
        globalPlayers.add(player);
    }

    public static void addGlobalCoaches(Coach coach){
        globalCoaches.add(coach);
    }

    public static void addGlobalHeadCoach(Headcoach headcoach){
        globalHeadcoach = headcoach;
    }

    public static void addGlobalTraining(Training training){
        globalTraining.add(training);
    }

    public static void addGlobalMatch(Match match){
        globalMatch = match;
    }

    public static Match getGlobalMatch(){
        return globalMatch;
    }
}

