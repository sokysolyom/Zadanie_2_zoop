package main;

import DB.Instances;
import actions.Match;
import actions.Training;
import input.InputManager;
import jdk.internal.util.xml.impl.Input;
import people.Coach;
import people.Headcoach;
import people.Manager;
import people.Player;

public class Main {
    public static void main(String[] args) {

        Player p0 = new Player("David", "de Gea", 26, "Goalkeeper", true);
        Coach t0 = new Coach("Tomas", "Tanczos", 21, "Goalkeeper trainer");
        t0.addPlayer(p0);
        t0.showPlayers();

        Player p1 = new Player("Eric", "Bailly", 22, "Defender", true);
        Player p2 = new Player("Phil", "Jones", 27, "Defender", true);
        Player p3 = new Player("Luke", "Shaw", 23, "Defender", true);
        Player p4 = new Player("Brandon", "Williams", 25, "Defender", true);
        Coach t1 = new Coach("Ladislav", "Sokol", 20, "Defender trainer");
        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);
        t1.showPlayers();

        Player p5 = new Player("Juan", "Mata", 30, "Midfielder", true);
        Player p6 = new Player("Paul", "Pogba", 28, "Midfielder", true);
        Player p7 = new Player("Nemanja", "Matic", 24, "Midfielder", true);
        Player p8 = new Player("Bruno", "Fernandes", 23, "Midfielder", true);
        Coach t2 = new Coach("Ryan", "Giggs", 35, "Midfielder trainer");
        t2.addPlayer(p5);
        t2.addPlayer(p6);
        t2.addPlayer(p7);
        t2.addPlayer(p8);
        t2.showPlayers();

        Player p9 = new Player("Anthony", "Martial", 25, "Forward", true);
        Player p10 = new Player("Marcus", "Rashford", 25, "Forward", true);
        Coach t3 = new Coach("Jouse", "Mourinho", 40, "Forward trainer");
        t3.addPlayer(p9);
        t3.addPlayer(p10);
        t3.showPlayers();

        Headcoach h1 = new Headcoach("Patrik", "Podhorsky", 54, "HeadCoach", 69);
        h1.addCoach(t0);
        h1.addCoach(t1);
        h1.addCoach(t2);
        h1.addCoach(t3);
        h1.showCoaches();

        Manager m = new Manager("Alex", "Ferguson", 45, "Manager", true, 42);
        m.Introduce();
        m.addHeadCoach(h1);
        m.showHeadcoach();

        Match M = new Match("Liverpool", "Saturday", 7);
        M.addPlayer(p0);
        M.addPlayer(p1);
        M.addPlayer(p2);
        M.addPlayer(p3);
        M.addPlayer(p4);
        M.addPlayer(p5);
        M.addPlayer(p6);
        M.addPlayer(p7);
        M.addPlayer(p8);
        M.addPlayer(p9);
        M.addPlayer(p10);
        M.addCoach(t0);
        M.addCoach(t1);
        M.addCoach(t2);
        M.addCoach(t3);
        M.addHeadCoach(h1);
        M.addManager(m);
        Instances.addGlobalMatch(M);

        InputManager inputManager = new InputManager();
        inputManager.getInput();

        Training T1 = new Training("Monday", 2, "Endurance");
        T1.addPlayerToTraining(p0);
        T1.addPlayerToTraining(p1);
        T1.addPlayerToTraining(p2);
        T1.addPlayerToTraining(p3);
        T1.addCoachToTraining(t0);
        T1.Information();

    }
}
