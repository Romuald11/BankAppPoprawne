package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Witaj w naszym banku");
        System.out.println("Wprowadź imię");
        Scanner scanner=new scanner (System.in);
        String name=scanner.nextLine();
        System.out.println("Wprowadź nazwisko");
        Scanner scanner=new scanner (System.in);
        String surname=scanner.nextLine();
        System.out.println("Wprowadź numer pesel");
        int pesel=scanner.nextLine();

User user1=new User(name, surname, pesel)
        System.out.println("Menu\n 1.Informacja o koncie\n 2.Wpłata pieniedzy\n 3.Wypłata pieniędzy\n 4.Wyjście");
    }
}