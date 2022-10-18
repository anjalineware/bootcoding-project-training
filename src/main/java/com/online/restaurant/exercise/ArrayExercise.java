package com.online.restaurant.exercise;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50}; // array declare + initialize
        int[] ages = new int[5]; // array declare
//        ages[0] = 10; //add elements (initialization)
//        ages[1] = 20;
//        ages[2] = 30;
//        ages[3] = 40;
//        ages[4] = 50;
        for (int i=0; i< ages.length; i++){
            ages[i] = (i+1) * 10;
        }

        //how to traverse array elements
        for(int i = 0; i < ages.length; i++) {
            System.out.println(i + " = " +ages[i]);
        }
        String[] months = {"Jan" , "Feb" , "Mar" , "Apr" , "May", "Jun" , "Jul" , "Aug" , "Sept" , "Oct" , "Nov", "Dec"};

        for (int i=0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }
}
