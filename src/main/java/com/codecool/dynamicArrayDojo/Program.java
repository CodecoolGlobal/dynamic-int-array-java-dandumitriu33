package com.codecool.dynamicArrayDojo;

public class Program {

    public static void main(String[] args) {
        System.out.println("Do not run me, run the TESTS!");

        DynamicIntArray obji = new DynamicIntArray(3);
        obji.add(4);
        for (int i=0; i<obji.data.length; i++) {
            obji.data[i] = i;
        }
//        System.out.println(obji.data[2]);
    }
}
