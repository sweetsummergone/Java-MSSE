package com.student.tasks;

import java.util.Scanner;

public class Task1 {
    public static void Program1_1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter int");
        int _i = input.nextInt();
        System.out.println("Enter float");
        float _f = input.nextFloat();
        System.out.println("Enter double");
        double _d = input.nextDouble();
        System.out.println("Enter char");
        char _c = input.next().charAt(0);
        System.out.println("Enter long");
        long _l = input.nextLong();

        String output = "Output string: " + _l + " " + _c + " " + _d + " " + _f + " " + _i;
        System.out.println(output);
    }
    public static void Program1_2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st int value: ");
        int _i1 = s.nextInt();
        System.out.println("Enter 2st int value: ");
        int _i2 = s.nextInt();
        System.out.println("Enter 3st int value: ");
        int _i3 = s.nextInt();
        System.out.printf("%.3f",(_i1+_i2+_i3)/3.0);
    }
    public static void Program1_3() {
        Scanner s = new Scanner(System.in);
        System.out.println("2: " + 2 * 2 + " " + (2 - 5) + " " + 2 / 3 + " " + 2 % 3);
        System.out.println("17: " + 17 * 2 + " " + (17 - 5) + " " + 17 / 3 + " " + 17 % 3);
        System.out.println("134: " + 134 * 2 + " " + (134 - 5) + " " + 134 / 3 + " " + 134 % 3);
        System.out.println("Enter own int: ");
        int _i = s.nextInt();
        System.out.println(_i * 2 + " " + (_i - 5) + " " + _i / 3 + " " + _i % 3);
    }
    public static void Program1_4() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first year");
        int year1 = s.nextInt();
        System.out.println("Enter second year");
        int year2 = s.nextInt();
        System.out.println(Math.abs(year2-year1));
    }
    public static void Program1_5() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter float number");
        float f = s.nextFloat();
        System.out.println((int)f + " " + (f - (int)f));
    }
    public static void Program1_6() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter int value");
        int num = s.nextInt();

//        int hundred = num / 100 % 10;
//        int ten = num % 100 / 10;
//        int unit = num % 10;

        int hundred = num / 100;
        int ten = num / 10 % 10;
        int unit = num % 10;
        System.out.println(unit + "," + ten + "," + hundred);
    }
    public static void Program1_7() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter °Fg Value: ");
            float f = s.nextFloat();
            float c = 5/9.0f * (f - 32);
            System.out.printf("%.1f °C",c);
        }
    public static void Program1_8() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3-digit int value: ");

        int i = Math.abs(s.nextInt());
        int i1,i2,i3;
        i1 = i / 100;
        i2 = i / 10 % 10;
        i3 = i % 10;
        System.out.println(i3+" "+i2+" "+i1);

        int t1,t3;
        t1 = i3-(i3-i1);
        t3 = i1-(i1-i3);
        System.out.println(t3+" "+i2+" "+t1);
    }
    public static void Program1_9(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5-digit number");
        int i = s.nextInt();
        int first = i/1000;
        int last = i%100;
        int middle = i / 100 % 10;
        int total = last*1000+middle*100+first;
        System.out.println(total);
    }
    public static void Program1_10() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter float value: ");
        float f = s.nextFloat();
        System.out.println(f);
        System.out.printf("%.2f\n",f);
        System.out.printf("%.4f\n",f);
    }
}
