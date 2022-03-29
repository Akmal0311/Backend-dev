package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World");

        // butun sonlar
        boolean b = false; //true
        byte by = 127;
        short s = 12345;
        int i = 341234423;
        long l = 21;

        // haqiqiy sonlar
        float f = 43.3f;
        double d = 3.5;

        char c = '*';

        System.out.println(Byte.SIZE / 8 +"byte");
        System.out.println(Short.SIZE / 8 +"byte");
        System.out.println(Integer.SIZE / 8 +"byte");
        System.out.println(Long.SIZE / 8 +"byte");
        System.out.println(Float.SIZE / 8 +"byte");
        System.out.println(Double.SIZE / 8 +"byte");
        System.out.println(Character.SIZE /8 +"byte");

    }
}
