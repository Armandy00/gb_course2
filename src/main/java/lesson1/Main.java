package lesson1;

import lesson1.interfaces.Obstacle;
import lesson1.interfaces.RunAndJump;
import lesson1.obstacles.Marathon;
import lesson1.obstacles.Wall;
import lesson1.players.Cat;
import lesson1.players.Human;
import lesson1.players.Robot;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[4];

        obstacles[0] = new Marathon(50);
        obstacles[1] = new Wall(2);
        obstacles[2] = new Marathon(300);
        obstacles[3] = new Wall(3);

        RunAndJump[] players = new RunAndJump[3];
        players[0] = new Cat();
        players[1] = new Human();
        players[2] = new Robot();

        for (RunAndJump player : players) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.race(player)) break;
            }
        }



    }
}
