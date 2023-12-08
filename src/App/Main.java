package App;

import java.util.Scanner;
import java.util.Random;

public class Main {

    static String[] colors = {"RED", "YELLOW", "GREEN"};

    public static void main(String[] args) {

        if (run() == 0) {
            switchLights(3);
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    private static int run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  '0'  to start: ");

        int inputData = sc.nextInt();
        if (inputData == 0) {

            Random rndm = new Random();
            int time = rndm.nextInt(5) + 1;

            System.out.println("Traffic light after: ");
            for (int i = time; i > 0; i--) {
                System.out.println(i + " meters");

                wait(1);
            }
            return 0;
        } else return -1;
    }

    //------------------------------------------------------------------------------------------------------------------
    private static void wait(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    private static void switchLights(int time) {
        TrafficLights trfcLights;

        for (int j = 0; j < time; j++) {

            trfcLights = TrafficLights.valueOf(colors[j]);
            System.out.println("\n" + trfcLights.getDirect());

            if (j != 2) {
                for (int i = time; i > 0; i--) {
                    wait(1);
                    System.out.println("Wait: " + i + " sec");
                }
            }
        }

    }
    //------------------------------------------------------------------------------------------------------------------
}
