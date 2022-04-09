package com.company;

public class Literal {

    public static void main(String[] args) {

        byte b = -100;
        short sh = 1150;
        int a = 2_000_000_000;
        long l = 45_000_000_000_000_000L;
        float f = 23.45F;
        double d = 3.1415;
        boolean yes = true;
        boolean not = false;

        char copyR = 174;
        char c1 = 169;
        char c2 = 181;

        String str = "Data types initialisation:";
        System.out.println(str + "\n" + b + "," + sh + "," + a + "\n" + l + "\n" +
                f + "," + d + "," + yes + "\\" + not);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(copyR);

    }

}
