package lesson1.obstacles;

import lesson1.interfaces.Obstacle;
import lesson1.interfaces.RunAndJump;

public class Marathon implements Obstacle {
    private int length;

    public Marathon(int length) {
        this.length = length;
    }

    @Override
    public boolean race(RunAndJump player) {
        if (player.run(length)) {
            System.out.println(player.toString() + " пробежал дистанцию!");
            return true;
        } else {
            System.out.println(player.toString() + " не смог пробежать дистанцию!");
            return false;
        }
    }
}
