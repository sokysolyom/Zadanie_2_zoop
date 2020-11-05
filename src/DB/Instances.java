package DB;

import people.Coach;
import people.Headcoach;
import people.Manager;
import people.Player;
import actions.Training;

import java.util.ArrayList;

public class Instances {
    private static Manager globalManager;
    private static Headcoach globalHeadcoach;
    private static ArrayList<Coach> globalCoaches = new ArrayList<>();
    private static ArrayList<Player> globalPlayers = new ArrayList<>();
    private static ArrayList<Training> globalTrainings = new ArrayList<>();

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
}

