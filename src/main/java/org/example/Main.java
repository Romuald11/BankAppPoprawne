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

 User user1=new User(name, surname, pesel);
        System.out.println("Menu\n 1.Informacja o koncie\n 2.Wpłata pieniedzy\n 3.Wypłata pieniędzy\n 4.Wyjście");
        System.out.println("Co byś chciał zrobić");
        int select=scanner.nextLine();
        switch (select){
            case 1:
                System.out.println("Informacja o koncie");
                user1.userDetails();
                break;
            case 2:
                System.out.println("Ile chcesz wpłacić pieniędzy?");
                double moneyToDeposite=scanner.nextDouble();
                user1.deposit(moneyToDeposite);
                System.out.println("Saldo twojego konta po epracji wynosi");
        break;
            case 3:
                System.out.println("Wypłata pieniędzy");
        break;
            case 4:
                System.out.println("Wyjscie");
                break;
    }
}