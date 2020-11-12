package com.company;

public class Main {

    public static void main(String[] args) {
	/*2) Дана строка. Показать номера символов,
              совпадающих с последним символом строки.*/
        String NubString="Why write this code he genius";
        int counter=0;
        char word =NubString.charAt(NubString.length()-1);
        for (int i = 0; i <NubString.length(); i++) {
            if (NubString.charAt(i)==word){
                System.out.println(i);
            }
        }
    }
}
