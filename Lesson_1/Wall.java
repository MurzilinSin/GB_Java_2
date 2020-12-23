package Lesson_1;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {this.height = height;}

    public int getHeight() {return height;}


    @Override
    public void start(Participant participant) {
        participant.jump(height);
    }

    @Override
    public void winners(Participant participant) {

    }
}
