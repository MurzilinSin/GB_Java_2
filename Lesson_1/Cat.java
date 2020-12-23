package Lesson_1;

public class Cat implements Participant{
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean runWin = false;
    private boolean jumpWin = false;

    public Cat(String name){
        this.name = name;
        this.maxJump = random.nextInt(8)+4;
        this.maxRun = random.nextInt(12)+1;
    }
    @Override
    public boolean run(int distance) {
        if(distance <= maxRun){
            System.out.println("Наш котик, " + this.name + ", легко преодолел эту дистанцию " + distance);
            runWin = true;
            return true;
        }
        else {
            System.out.println("Кот не Кипчоге! Он столько не сможет пробежать" );
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if(height <= maxJump){
            System.out.println("Наш котик, " + this.name + ", легко перепрыгнул эту высоту "  + height);
            jumpWin = true;
            return true;
        }
        else {
            System.out.println("Даже коты не прыгают так высоко");
            return false;
        }
    }

    @Override
    public void printInfo() {
        System.out.println(this.name + ", может пробежать " + maxRun + " и прыгнуть в высоту на " + maxJump);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean getRunWin() {
        return runWin;
    }

    @Override
    public boolean getJumpWin() {
        return jumpWin;
    }
}
