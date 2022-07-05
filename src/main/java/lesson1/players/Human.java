package lesson1.players;

import lesson1.interfaces.RunAndJump;

public class Human implements RunAndJump {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Human() {
        this.maxJumpHeight = 1;
        this.maxRunDistance = 300;
    }

    @Override
    public boolean run(int distance) {
        if (distance < 0) {
            System.out.println(this.toString() + " может бежать только вперед");
            return false;
        } else if (distance > this.maxRunDistance) {
            System.out.println(this.toString() + " не смог пробежать дистанцию " + distance + " м.");
            return false;
        } else {
            System.out.println(this.toString() + " успешно пробежал " + distance + " м.");
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height < 0) {
            System.out.println(this.toString() + " не умеет копать");
            return false;
        } else if (height > this.maxJumpHeight) {
            System.out.println(this.toString() + " не смог перепрыгнуть стену высотой " + height + " м.");
            return false;
        } else {
            System.out.println(this.toString() + " успешно перепрыгнул стену высотой " + height + " м.");
            return true;
        }
    }

    @Override
    public String toString() {
        return "Человек";
    }
}
