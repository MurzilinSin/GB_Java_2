package Lesson_1;

public class Treadmill implements Obstacle{
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void start(Participant participant) {
        participant.run(distance);
    }

    @Override
    public void winners(Participant participant) {

    }
}
