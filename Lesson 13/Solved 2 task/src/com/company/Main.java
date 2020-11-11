package com.company;
import com.company.Subcriber.Subcriber;

public class Main {

    public static void main(String[] args) {
        int limit = 2;
        Subcriber subcriber1 = new Subcriber("Jack", "Robert", "gjfj", 1, "Shefcheko", 3, 1);
        Subcriber subcriber2 = new Subcriber("Alen", "Tomas", "testov", 1, "rudary", 2, 0);
        Subcriber subcriber3 = new Subcriber("Adam", "Stark", "starkov", 1, "Avengeres", 0, 3);

        Subcriber[] sub = new Subcriber[3];
        sub[0] = subcriber1;
        sub[1] = subcriber2;
        sub[2] = subcriber3;

        for (int i = 0; i < sub.length; i++) {

            if (sub[i].getCityConversationsTime() > limit) {
                System.out.println("Ваш лимит по городу исчерпан y:(");
                System.out.println("Id: "+sub[i].getid()+"\n"+"Name:"+sub[i].getName()+"\n"+"LastName:"+sub[i].getLastName()+"\n"+"Address:"+sub[i].getAddress()+
                        "\n"+"CityConversLimit:"+sub[i].getCityConversationsTime()+"\n"+"Long-distance"+sub[i].getInternationalConversationsTime());
            }

        }
    }
}
