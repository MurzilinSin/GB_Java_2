package Lesson_1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Man man = new Man("Валера");
        Cat cat = new Cat("Барсик");
        Robot robot = new Robot("D-60");
        Participant[] participants = {robot,man,cat};

        for(Participant participant : participants) {
            participant.printInfo();
        }

        System.out.println("Введите длину дистанции");
        int distance = scanner.nextInt();
        System.out.println("Введите высоту стены");
        int height = scanner.nextInt();

        Obstacle[] obstacles = {new Treadmill(distance), new Wall(height)};

        for(Participant participant : participants){
            for(Obstacle obstacle : obstacles){
                obstacle.start(participant);
            }
            if(participant.getRunWin() && participant.getJumpWin()){
                System.out.println("\n" + participant.getName() + " прошел испытание!\n");
            }
            else {
                System.out.println("\n" + participant.getName() + " проиграл!\n");
            }
        }






    }
}
