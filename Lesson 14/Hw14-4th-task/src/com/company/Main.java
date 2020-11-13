package com.company;

public class Main {

    public static void main(String[] args) {
            /*4) Дана строка. Если ее длина больше 10, то оставить
                 в строке только первые 6 символов, иначе дополнить
                 строку символами 'o' до длины 12.*/
        String MoreTenWords="yester";
        for (int i = 0; i < MoreTenWords.length(); i++) {
            if (i>10)
            {
                System.out.println(MoreTenWords.substring(0,6));
                break;
            }
            if (i<=10) {
                String o="oooooooooooo";

                String result=MoreTenWords +o;
                System.out.println(result.substring(0,12));
                break;
            }
            }
        }
    }

