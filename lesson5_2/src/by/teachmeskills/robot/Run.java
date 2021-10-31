package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot firstRobot = new Robot(new SamsungHead(10), new SonyHand(20), new ToshibaLeg(30));
        Robot secondRobot = new Robot(new SonyHead(80), new ToshibaHand(30), new SamsungLeg(40));
        Robot thirdRobot = new Robot(new ToshibaHead(30), new SamsungHand(40), new SonyLeg(50));

        System.out.println("Действия первого робота : ");
        firstRobot.action();

        System.out.println("\nДействия второго робота : ");
        secondRobot.action();

        System.out.println("\nДействия третьего робота : ");
        thirdRobot.action();

        if (firstRobot.getPrice() > secondRobot.getPrice() & firstRobot.getPrice() > thirdRobot.getPrice())
            System.out.println("\nСамый дорогой робот - Первый , его стоимость = " + firstRobot.getPrice() + " тыс. $");
        else if (secondRobot.getPrice() > firstRobot.getPrice() & secondRobot.getPrice() > thirdRobot.getPrice())
            System.out.println("\nСамый дорогой робот - Второй , его стоимость = " + secondRobot.getPrice() + " тыс. $");
        else System.out.println("\nСамый дорогой робот - Третий , его стоимость = " + thirdRobot.getPrice() + " тыс. $");
    }
}
