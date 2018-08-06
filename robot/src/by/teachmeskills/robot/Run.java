package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        int[] priceHead = {12500, 13600, 15000};
        int[] priceHand = {5600, 9650, 9000};
        int[] priceLeg = {7800, 8000, 10200};


        SamsungHead samsungHead = new SamsungHead();
        ToshibaHead toshibaHead = new ToshibaHead();
        SonyHead sonyHead = new SonyHead();

        for (int createHead = 0; createHead < 3; createHead++){
            if (createHead == 0){
                samsungHead = new SamsungHead(priceHead[createHead]);
            } else if (createHead == 1){
                sonyHead = new SonyHead(priceHand[createHead]);
            } else if (createHead == 2) {
                toshibaHead = new ToshibaHead(priceHead[createHead]);
            }
        }

        SamsungHand samsungHand = new SamsungHand();
        ToshibaHand toshibaHand = new ToshibaHand();
        SonyHand sonyHand = new SonyHand();

        for (int createHand = 0; createHand < 3; createHand++){
            if (createHand == 0){
                samsungHand = new SamsungHand(priceHead[createHand]);
            } else if (createHand == 1){
                sonyHand = new SonyHand(priceHand[createHand]);
            } else if (createHand == 2) {
                toshibaHand = new ToshibaHand(priceHead[createHand]);
            }
        }

        SamsungLeg samsungLeg = new SamsungLeg();
        ToshibaLeg toshibaLeg = new ToshibaLeg();
        SonyLeg sonyLeg = new SonyLeg();

        for (int createLeg = 0; createLeg < 3; createLeg++){
            if (createLeg == 0){
                samsungLeg = new SamsungLeg(priceLeg[createLeg]);
            } else if (createLeg == 1){
                sonyLeg = new SonyLeg(priceLeg[createLeg]);
            } else if (createLeg == 2) {
                toshibaLeg = new ToshibaLeg(priceLeg[createLeg]);
            }
        }

        System.out.println("robotA1 :");
        Robot robotA1 = new Robot(samsungHead, sonyHand, toshibaLeg);
        robotA1.action();
        int priceA1 = robotA1.getPrice();
        System.out.println("\n");

        System.out.println("robotA2 :");
        Robot robotA2 = new Robot(samsungHead, sonyHand, toshibaLeg);
        robotA2.action();
        int priceA2 = robotA2.getPrice();
        System.out.println("\n");

        System.out.println("robotA3 :");
        Robot robotA3 = new Robot(samsungHead, sonyHand, toshibaLeg);
        robotA3.action();
        int priceA3 = robotA3.getPrice();
        System.out.println("\n");

        if (priceA1 > priceA2 && priceA1 > priceA3){
            System.out.println("Самый дорогой робот robotA1, он стоит " + priceA1);
        } else if (priceA2 > priceA1 && priceA2 > priceA3){
            System.out.println("Самый дорогой робот robotA2, он стоит " + priceA2);
        } else {
            System.out.println("Самый дорогой робот robotA3, он стоит " + priceA3);
        }

    }


}
