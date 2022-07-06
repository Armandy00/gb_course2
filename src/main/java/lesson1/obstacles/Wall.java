package lesson1.obstacles;

import lesson1.interfaces.Obstacle;
import lesson1.interfaces.RunAndJump;

public class Wall implements Obstacle {
    private final int length;

    public Wall(int length) {
        this.length = length;
    }

    @Override
    public boolean race(RunAndJump player) {
        if (player.jump(length)) {
            System.out.println(player.toString() + " перепрыгнул стену!");
            return true;
        } else {
            System.out.println(player.toString() + " не смог перепрыгнуть стену!");
            return false;
        }
    }
}

