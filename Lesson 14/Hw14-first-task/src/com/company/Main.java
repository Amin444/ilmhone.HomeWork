package com.company;

public class Main {

    public static void main(String[] args) {

         /*1) Дана строка. Вывести первые три символа и
         последний три символа, если длина строки больше 5.*/
        String SomeString="My favorite customer";
        System.out.println(SomeString.substring(0,3));
        System.out.println(SomeString.substring(17,20));
        System.out.println("==================================================");
        /*  Иначе вывести первый символ столько раз, какова длина строки.*/
        String LittleString="Android";
        for (int i = 0; i < LittleString.length(); i++) {
            if (true)
            {
                System.out.println(LittleString.substring(0,1));
            }
        }
        System.out.println("=========================================================");

    }
}
