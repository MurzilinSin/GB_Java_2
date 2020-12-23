package Lesson_1;

public class Robot implements Participant{
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean runWin = false;
    private boolean jumpWin = false;


    public Robot(String name){
        this.name = name;
        this.maxJump = 1000;
        this.maxRun = 1000;
    }

    @Override
    public boolean run(int distance) {
        if(distance <= maxRun){
            System.out.println(this.name + " - боевой робот Конфедерации. Ему плевать, где ты, он придет за тобой, не смотря на дистанцию: " + distance);
            runWin = true;
            return true;
        }
        else {
            System.out.println("Похоже эта дистанция, как джедай - убивает дроидов." );
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if(height <= maxJump){
            System.out.println(this.name + ", имеет встроенный реактивный ранец. Ему плевать на высоту стены");
            jumpWin = true;
            return true;
        }
        else {
            System.out.println("Заводской брак у дроида редкость, но сборщики лады веста, как отглоски хаоса во Вселенной, они везде. Прыжок не удался.");
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
