package com.company;

import com.company.Person.Person;

public class Main {

    public static void main(String[] args) {
        Person per = new Person("Alen", "Walker", "Axe", "Rudaky 76/2", 2020, 1);
        Person per1 = new Person("jack", "richard", "Robert", "Rudaky 73/2", 0020, 2);
        Person per2 = new Person("Robert", "Tom", "Kiyosaki", "Rudaky 70/1", 3527, 3);
        Person per3 = new Person("jessika", "Alba", "rich", "Tursunzoda 98", 8979, 4);
        Person[] persons = new Person[4];
        persons[0] = per;
        persons[1] = per1;
        persons[2] = per2;
        persons[3] = per3;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getIdealNumber() % 2 == 0) {
                System.out.println(persons[i].getName() + "\n" + persons[i].getLastName() + "\n" + persons[i].getMiddleName() + "\n" +
                        persons[i].getAddress() + "\n" + persons[i].getCreditCard() + "\n" + persons[i].getIdealNumber());
                System.out.println("--------------------------------------------------------------------------------");
            }

        }
    }
}
