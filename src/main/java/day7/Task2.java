package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
           int randValue = rand.nextInt(10) + 90;
        Player pl1 = new Player(randValue);
        Player pl2 = new Player(randValue);
        Player pl3 = new Player(randValue);
        Player pl4 = new Player(randValue);
        //Player pl5 = new Player(randValue);
        //Player pl6 = new Player(randValue);

        pl1.info();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.run();
        pl1.info();

    }
}
