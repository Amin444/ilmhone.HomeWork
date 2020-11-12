package com.company;

public class Main {

    public static void main(String[] args) {
	            /*3) Дана строка. Определите, какой символ в ней
                     встречается раньше: 'x' или 'w'.Если какого-то
                     из символов нет, вывести сообщение об этом.*/
        String SentanseString ="e shouldn't miss pass etra lessons";
       String bigwords= SentanseString.toUpperCase();
        for (int i = 0; i < bigwords.length(); i++) {
            if (bigwords.charAt(i)=='W'|| bigwords.charAt(i)=='X')
            {
                System.out.println(bigwords.charAt(i));
                break;
            }

            else {
                System.out.println("Таких символов нет в данном предложении! ");
                break;
            }
           }

    }
}

