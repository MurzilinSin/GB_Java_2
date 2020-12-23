package Lesson_1;

import java.util.Random;

public interface Participant {
    boolean run(int distance);
    boolean jump(int height);
    void printInfo();
    Random random = new Random();
    String getName();
    boolean getRunWin();
    boolean getJumpWin();
}
