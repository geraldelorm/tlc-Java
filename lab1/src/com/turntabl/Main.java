package com.turntabl;

public class Main {

    public static void main(String[] args) {

        // Question 1
        int n = (int)(Math.random()*100)+1;
        if (n % 2 == 0) {
            System.out.println(n + " " + "is even");
        } else {
            System.out.println(n + " " + "is odd");
        }

        // Question 2
        if (n == 0) {
            System.out.println(n+": frozen");
        } else if ((n >= 1) && (n <= 14)) {
            System.out.println(n+": Cold");
        } else if ((n >= 15) && (n <= 24)){
            System.out.println(n+": cool");
        } else if ((n >= 25) && (n <= 40)){
            System.out.println(n+": warm");
        } else if ((n >= 41) && (n <= 60)){
            System.out.println(n+": hot");
        } else if ((n >= 61) && (n <= 80)){
            System.out.println(n+": very hot");
        } else if ((n >= 81) && (n <= 99)){
            System.out.println(n+": extremely hot");
        } else {
            System.out.println(n+": boiling");
        }


        //Question 3
        int num = (int)(Math.random()*10);

        switch (num) {
            case 0:
                System.out.println(num + " : is Zero");
                break;
            case 1:
                System.out.println(num + " : is One");
                break;
            case 2:
                System.out.println(num + " : is Two");
                break;
            case 3:
                System.out.println(num + " : is Three");
                break;
            case 4:
                System.out.println(num + " : is Four");
                break;
            case 5:
                System.out.println(num + " : is Five");
                break;
            case 6:
                System.out.println(num + " : is Six");
                break;
            case 7:
                System.out.println(num + " : is Seven");
                break;
            case 8:
                System.out.println(num + " : is Eight");
                break;
            case 9:
                System.out.println(num + " : is Nine");
                break;
        }


        // Question 4
        int a;
        do {
            a = (int)(Math.random()*6)-3;
            System.out.println(a + " is num");
        } while (a != 0);

        // Question 5
        System.out.println("");
        System.out.println("****************************");
        System.out.println("Question 5");
        System.out.println("");

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j ++) {
                System.out.println(i + " x " + j + " = " + (i*j) );
            }
            System.out.println("");
            System.out.println("_________________");
            System.out.println("");
        }
        System.out.println("****************************");



        //Question 6
        System.out.println("Question 6");
        for (int r = 0; r < 6; r++) {
            int z = (int)(Math.random()*48)+1;
            System.out.println(z);
        }
        System.out.println("****************************");
        System.out.println("");

        //Question 6b

        System.out.println("Question 6b");
        int result = randomInt(50);
        System.out.println(result);

    }

    public static int randomInt(int num) {
        int z = (int)(Math.random() * (num - 1)) + 1;
        return z;
    }

}
