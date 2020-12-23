package Lesson_1;

public class Man implements Participant{
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean runWin = false;
    private boolean jumpWin = false;

    public Man(String name){
        this.name = name;
        this.maxJump = random.nextInt(4)+1;
        this.maxRun = random.nextInt(150)+1;
    }

    @Override
    public boolean run(int distance) {
        if(distance <= maxRun){
            System.out.println(this.name + ", легко преодолел эту дистанцию " + distance);
            runWin = true;
            return true;
        }
        else {
            System.out.println("Человек на такое не способен" );
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if(height <= maxJump){
            System.out.println(this.name + ", легко перепрыгнул");
            jumpWin = true;
            return true;
        }
        else {
            System.out.println("Неужели, " + this.name + ", похож на Исимбаеву ? Высота то " + height + " метров");
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
