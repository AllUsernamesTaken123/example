package com.example.helloworld;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args){

        message();
        points();
        numbers();
        today();
        casting(1);
    }
    public static void points(){
        Point point1 = new Point(1, 1);
        Point point2 = point1;
    }
    public static void numbers(){
        int[] numbers = new int[5];
        numbers[0] = 0;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {1, 3, 4, 5, 6, 9};
        System.out.println(numbers2.length);

        int[][] numbers3 = new int [2] [3];
        numbers3[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers3));
    }
    public static void today(){
        Date now = new Date();
        System.out.println(now);
    }

    public static void stuff(){
        final float Pi = 3.14F;

        int x = 1;
        // y=1, sest x=1 ja x=2, sest 1+1
        int y = x++;
        // z=2, sest x=2
        int z = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int result = (int)Math.ceil(1.1F);
        System.out.println(result);

        int result2 = (int)Math.max(1,2.1);
        System.out.println(result2);
    }

    public static void casting(double a){
        //implicit and explicit casting
        //double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);
    }

    public static void message(){
        String message = "Hello world";
        System.out.println(message);
    }



}
