package main;

import DB.Instances;
import actions.Match;
import actions.Training;
import input.InputManager;
import people.*;

public class Main {
    public static void main(String[] args) {
        Instances instances = new Instances();

        Adults p0 = new Adults("David", "de Gea", 26, "Goalkeeper", true);
        Coach t0 = new Coach("Tomas", "Tanczos", 21, "Goalkeeper trainer");
        t0.addPlayer(p0);
        instances.addGlobalCoaches(t0);

        Adults p1 = new Adults("Eric", "Bailly", 22, "Defender", true);
        Adults p2 = new Adults("Phil", "Jones", 27, "Defender", true);
        Adults p3 = new Adults("Luke", "Shaw", 23, "Defender", true);
        Adults p4 = new Adults("Brandon", "Williams", 25, "Defender", true);
        Coach t1 = new Coach("Ladislav", "Sokol", 20, "Defender trainer");
        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);
        instances.addGlobalCoaches(t1);

        Adults p5 = new Adults("Juan", "Mata", 30, "Midfielder", true);
        Adults p6 = new Adults("Paul", "Pogba", 28, "Midfielder", true);
        Adults p7 = new Adults("Nemanja", "Matic", 24, "Midfielder", true);
        Adults p8 = new Adults("Bruno", "Fernandes", 23, "Midfielder", true);
        Coach t2 = new Coach("Ryan", "Giggs", 35, "Midfielder trainer");
        t2.addPlayer(p5);
        t2.addPlayer(p6);
        t2.addPlayer(p7);
        t2.addPlayer(p8);
        instances.addGlobalCoaches(t2);

        Adults p9 = new Adults("Anthony", "Martial", 25, "Forward", true);
        Adults p10 = new Adults("Marcus", "Rashford", 25, "Forward", true);
        Coach t3 = new Coach("Jouse", "Mourinho", 40, "Forward trainer");
        t3.addPlayer(p9);
        t3.addPlayer(p10);
        instances.addGlobalCoaches(t3);

        Headcoach h1 = new Headcoach("Patrik", "Podhorsky", 54, "HeadCoach", 69);
        h1.addCoach(t0);
        h1.addCoach(t1);
        h1.addCoach(t2);
        h1.addCoach(t3);
        instances.addGlobalCoaches(h1);

        Manager m = new Manager("Alex", "Ferguson", 45, "Manager", true, 42);
        instances.addGlobalManager(m);
        m.addHeadCoach(h1);

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
        instances.addGlobalMatch(M);

        Training T1 = new Training("Monday", 2, "Endurance");
        T1.addPlayerToTraining(p0);
        T1.addPlayerToTraining(p1);
        T1.addPlayerToTraining(p2);
        T1.addPlayerToTraining(p3);
        T1.addCoachToTraining(t0);
        instances.addGlobalTraining(T1);

        Training T2 = new Training("Wednesday", 3, "Shooting");
        T2.addPlayerToTraining(p4);
        T2.addPlayerToTraining(p5);
        T2.addPlayerToTraining(p6);
        T2.addPlayerToTraining(p7);
        T2.addCoachToTraining(t1);
        instances.addGlobalTraining(T2);

        Training T3 = new Training("Wednesday", 2, "Tactics");
        T3.addPlayerToTraining(p8);
        T3.addPlayerToTraining(p9);
        T3.addPlayerToTraining(p10);
        T3.addCoachToTraining(t2);
        instances.addGlobalTraining(T3);

        Kids k0 = new Kids("Juan", "Mata", 10, "Midfielder");
        Kids k1 = new Kids("Paul", "Pogba", 9, "Forward");
        Kids k2 = new Kids("Nemanja", "Matic", 8, "Defender");
        Kids k3 = new Kids("Bruno", "Fernandes", 11, "Goalkeeper");
        Coach t4 = new Coach("Peter", "Martin", 35, "Kids trainer");
        t4.addKids(k0);
        t4.addKids(k1);
        t4.addKids(k2);
        t4.addKids(k3);
        instances.addGlobalCoaches(t4);

        Training KT0 = new Training("Thursday", 1, "Playing football");
        KT0.addKidToTraining(k0);
        KT0.addKidToTraining(k1);
        KT0.addKidToTraining(k2);
        KT0.addKidToTraining(k3);
        KT0.addCoachToTraining(t4);
        instances.addGlobalKidTraining(KT0);

        InputManager inputManager = new InputManager();
        inputManager.mainLoop(); // Vypisem a nacitam commandy po vytvarani hracov treningov a zapasov

        // System.out.println("--UpCasting--");
        Person up = new Adults("Ladislav", "Sokol", 21, "Forward", true);
        up.rating = 92;
        //System.out.println(up.rating);

        //System.out.println("--Polymoprhism--");
        //inputManager.showCoachesInfo();


    }
}
