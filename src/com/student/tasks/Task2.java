package com.student.tasks;

import java.util.Scanner;

public class Task2 {
    public static void Program2_1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter mass in kilograms: ");
        int m = s.nextInt();
        System.out.println("Enter height in cm: ");
        float h = s.nextInt()*0.01f;
        float result = m / (float)Math.pow(h,2.0f);
        if(result <= 16) { }
        else if(result > 16 && result <= 18.5f) {
            System.out.println("Severe underweight");
        }
        else if(result > 16 && result <= 18.5f) {
            System.out.println("Deficit boyd weight");
        }
        else if(result > 16 && result <= 18.5f) {
            System.out.println("Normal");
        }
        else if(result > 16 && result <= 18.5f) {
            System.out.println("Overweight");
        }
        else if(result > 16 && result <= 18.5f) {
            System.out.println("Obesity");
        }
        else {
            System.out.println("Very serious ");
        }
    }
    public static void Program2_2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integer number");
        int n = s.nextInt();
        if(n != 0 && n / 100 == 0) {
            System.out.println("2 decimal");
            if(n % 10 > n / 10) {
                System.out.println(n % 10 + " greater than " + n / 10);
                System.out.println("The difference is: "+ (n % 10 - n / 10));
            }
            else {
                System.out.println(n / 10 + " greater than " + n % 10);
                System.out.println("The difference is: "+ (n / 10 - n % 10));
            }
        }
        else if(n != 0 && n / 1000 == 0) {
            System.out.println("3 decimal");
            // 129
            int t = n / 100;
            // 1
            if(n % 100 / 10 > t){
                // 2
                t = n % 100 / 10;
            };
            if(n % 100 % 10 > t) {
                // 9
                t = n % 100 % 10;
            };
            System.out.println("The maximum value is: " + t);
        }
        else if(n != 0 && n / 10000 == 0) {
            System.out.println("4 decimal");
            boolean flag = false;
//            System.out.println(n/1000+"=="+n % 1000 % 100 % 10);
//            System.out.println(n%1000/100+"=="+n%1000%100/10);
            if((n / 1000 == n % 1000 % 100 % 10)&&(n%1000/100==n%1000%100/10)){
                flag = true;
            };
            String msg = "No symmetric value: "+n;
            if(flag){msg="Value "+n+" is symmetric";}
            System.out.println(msg);
        }
        else if(n != 0 && n / 100000 == 0) {
            System.out.println("5 decimal");
            int min, max; min = n/ 10000; max = n/10000;
            //
            if(n % 10000 / 1000 > max) {
                max = n % 10000 / 1000;
            } else if (n % 10000 / 1000 < min) {
                min = n % 10000 / 1000;
            }

            if(n % 1000 / 100 > max) {
                max = n % 1000 / 100;
            } else if (n % 1000 / 100 < min) {
                min = n % 1000 / 100;
            }

            if(n % 100 / 10 > max) {
                max = n % 100 / 10;
            } else if (n % 100 / 10 < min) {
                min = n % 100 / 10;
            }

            if(n % 10  > max) {
                max = n % 10;
            } else if (n % 10 < min) {
                min = n % 10;
            }

            System.out.println("Sum of min and max = " + (min+max));
        }
    }
    public static void Program2_3() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first 3-digit value: ");
        int i1 = s.nextInt();
        System.out.println("Enter second 3-digit value: ");
        int i2 = s.nextInt();

        boolean flag1 = false, flag2 = false, flag3 = false;

        int i11 = i1 / 100;
        int i12 = i1 % 100 / 10;
        int i13 = i1 % 100 % 10;

        int i21 = i2 / 100;
        int i22 = i2 % 100 / 10;
        int i23 = i2 % 100 % 10;

        if(i11 == i21) {
            flag1 = true;
            i21 = 999;
        } else if (i12 == i21) {
            flag1 = true;
            i21 = 999;
        } else if (i13 == i21) {
            flag1 = true;
            i21 = 999;
        }

        if(i11 == i22) {
            flag2 = true;
            i22 = 999;
        } else if (i12 == i22) {
            flag2 = true;
            i22 = 999;
        } else if (i13 == i22) {
            flag2 = true;
            i22 = 999;
        }

        if(i11 == i23) {
            flag3 = true;
            i23 = 999;
        } else if (i12 == i23) {
            flag3 = true;
            i23 = 999;
        } else if (i13 == i23) {
            flag3 = true;
            i23 = 999;
        }

        if(flag1 && flag2 && flag3) {
            System.out.println("Numbers are similar");
        } else {
            System.out.println("Numbers are not similar");
        }
    }
    public static void Program2_4() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first 5-digit value: ");
        int i = s.nextInt();
        String odd = "";
        String even = "";
        int evenCounter = 0;
        if(i / 10000 % 2 != 0) {
            odd += i /10000;
        } else {
            even += i / 10000;
            evenCounter += 1;
        }
        if(i / 1000 % 10 % 2 != 0) {
            odd += i /1000 % 10;
        } else {
            even += i / 1000 % 10;
            evenCounter += 1;
        }
        if(i / 100 % 10 % 2 != 0) {
            odd += i /100 % 10;
        } else {
            even += i / 100 % 10;
            evenCounter += 1;
        }
        if(i / 10 % 10 % 2 != 0) {
            odd += i /10 % 10;
        } else {
            even += i / 10 % 10;
            evenCounter += 1;
        }
        if(i % 10 % 2 != 0) {
            odd += i % 10;
        } else {
            even += i % 10;
            evenCounter += 1;
        }
        System.out.println(even);
        System.out.println(odd);
        System.out.println("Even count: " + evenCounter);
    }
    public static void Program2_5() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first 4-digit value: ");
        int i = s.nextInt();
        int i1,i2,i3,i4;
        i1 = i / 1000;
        i2 = i / 100 % 10;
        i3 = i / 10 % 10;
        i4 = i % 10;
        String sorted = "";
        // Iteration 1
        if(i1!=-1 && (i1 >= i2 && i1 >= i3 && i1 >= i4)) {
            sorted += i1;
            i1 = -1;
        }
        if(i2!=-1 && (i2 >= i1 && i2 >= i3 && i2 >= i4)) {
            sorted += i2;
            i2 = -1;
        }
        if(i3!=-1 && (i3 >= i1 && i3 >= i2 && i3 >= i4)) {
            sorted += i3;
            i3 = -1;
        }
        if(i4!=-1 && (i4 >= i1 && i4 >= i2 && i4 >= i3)) {
            sorted += i4;
            i4 = -1;
        }
        // Iteration 2
        if(i1!=-1 && (i1 >= i2 && i1 >= i3 && i1 >= i4)) {
            sorted += i1;
            i1 = -1;
        }
        if(i2!=-1 && (i2 >= i1 && i2 >= i3 && i2 >= i4)) {
            sorted += i2;
            i2 = -1;
        }
        if(i3!=-1 && (i3 >= i1 && i3 >= i2 && i3 >= i4)) {
            sorted += i3;
            i3 = -1;
        }
        if(i4!=-1 && (i4 >= i1 && i4 >= i2 && i4 >= i3)) {
            sorted += i4;
            i4 = -1;
        }
        // Iteration 3
        if(i1!=-1 && (i1 >= i2 && i1 >= i3 && i1 >= i4)) {
            sorted += i1;
            i1 = -1;
        }
        if(i2!=-1 && (i2 >= i1 && i2 >= i3 && i2 >= i4)) {
            sorted += i2;
            i2 = -1;
        }
        if(i3!=-1 && (i3 >= i1 && i3 >= i2 && i3 >= i4)) {
            sorted += i3;
            i3 = -1;
        }
        if(i4!=-1 && (i4 >= i1 && i4 >= i2 && i4 >= i3)) {
            sorted += i4;
            i4 = -1;
        }
        System.out.println(sorted);
    }
    public static void Program2_6() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter shekels value: ");
        float sh = s.nextFloat();
        float discount = 0;
        if(sh > 0 && sh < 200) {
            discount += sh - (sh * 0.1);
        }
        else if(sh >= 200 && sh < 400) {
            discount += sh - (sh * 0.2);
        }
        else if(sh >= 400 && sh < 600) {
            discount += sh - (sh * 0.3);
        }
        else if(sh >= 600) {
            discount += sh - (sh * 0.4);
        }
        else{
            discount += Math.abs(sh);
        }
        System.out.println("Total price with discount: "+discount+" shekels");
    }
    public static void Program2_7() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        int i1 = s.nextInt();
        System.out.println("Enter 2nd value: ");
        int i2 = s.nextInt();
        System.out.println("Enter 3rd value: ");
        int i3 = s.nextInt();
        System.out.println("Enter 4th value: ");
        int i4 = s.nextInt();

        if(i1 > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            String g1 = "Group 1: ";
            String g2 = "Group 2: ";
            boolean flag = false;
            if(i1 + i2 == i3 + i4) {
                g1 += i1+" "+i2;
                g2 += i3+" "+i4;
                flag = true;
            }
            else if(i1+i3 == i2+i4) {
                g1 += i1+" "+i3;
                g2 += i2+" "+i4;
                flag = true;
            }
            else if(i1+i4 == i2+i3){
                g1 += i1+" "+i4;
                g2 += i2+" "+i3;
                flag = true;
            }

            if(flag) {
                System.out.println(g1+"\n"+g2+"\n"+"Great!");
            }
            else {
                System.out.println("Sorry");
            }
        }
    }
    public static void Program2_8() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the birthday of the first cookie:");
        System.out.println("Day: ");
        int c1d = s.nextInt();
        if(c1d > 0 && c1d <= 31){
            System.out.println("Month: ");
            int c1m = s.nextInt();
            if(c1m > 0 && c1m <= 12) {
                System.out.println("Year: ");
                int c1y = s.nextInt();
                if(c1y > -10000 && c1y <= 2020){
                    System.out.println("Enter the birthday of the second cookie:");
                    System.out.println("Day: ");
                    int c2d = s.nextInt();
                    if(c2d > 0 && c2d <= 31){
                        System.out.println("Month: ");
                        int c2m = s.nextInt();
                        if(c2m > 0 && c2m <= 12) {
                            System.out.println("Year: ");
                            int c2y = s.nextInt();
                            if(c2y > -10000 && c2y <= 2020){
                                int days1 = c1d+c1m*31+(2020-c1y)*365;
                                int days2 = c2d+c2m*31+(2020-c2y)*365;
                                if(days1 > days2){
                                    System.out.println("The first cookie is younger");
                                }
                                else if(days1 == days2) {
                                    System.out.println("Cookies are similar");
                                }
                                else{
                                    System.out.println("The second cookie is younger");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
