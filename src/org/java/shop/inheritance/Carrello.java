package org.java.shop.inheritance;

/*
Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente richiamate il costruttore opportuno.
Al termine dell’inserimento stampate gli elementi del carrello (fate l’override del metodo toString nelle varie classi per restituire le informazioni da stampare)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        ArrayList<Prodotto> carrelloProdotti = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Benvenuto nel nostro shop!");



        boolean exit = false;

        while(!exit) {
            System.out.println("Seleziona il tuo prodotto: 1-Smartphone, 2-Televisore, 3-Cuffie 4-exit");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Insert code: ");
                    int code = scan.nextInt();
                    System.out.println("Inser Smartphone model: ");
                    String name = scan.next();
                    System.out.println("Insert Smartphone brand: ");
                    String brand = scan.next();
                    System.out.println("Insert Smartphone price: ");
                    double price = scan.nextDouble();
                    System.out.println("Insert Iva on Smartphone: ");
                    double iva = scan.nextDouble();
                    System.out.println("insert IMEI: ");
                    String imei = scan.next();
                    System.out.println("Insert device memory: ");
                    int memory = scan.nextInt();
                    Smartphone smartphone = new Smartphone(code, name, brand, price, iva, imei, memory);
                    carrelloProdotti.add(smartphone);
                    break;
                case 2:
                    System.out.println("Insert code: ");
                    int codeTV = Integer.parseInt(scan.nextLine());
                    System.out.println("Inser Smartphone model: ");
                    String nameTV = scan.next();
                    System.out.println("Insert Smartphone brand: ");
                    String brandTV = scan.next();
                    System.out.println("Insert Smartphone price: ");
                    double priceTV = scan.nextDouble();
                    System.out.println("Insert Iva on Smartphone: ");
                    double ivaTV = scan.nextDouble();
                    System.out.println("Is TV smart? (true/false)");
                    boolean smart = Boolean.parseBoolean(scan.nextLine());
                    System.out.println("Insert Tv width: ");
                    int dimensions = scan.nextInt();
                    Televisori televisore = new Televisori(codeTV, nameTV, brandTV, priceTV, ivaTV, smart, dimensions);
                    carrelloProdotti.add(televisore);
                    break;
                case 3:
                    System.out.println("Insert code: ");
                    int codeHeadphones = Integer.parseInt(scan.nextLine());
                    System.out.println("Inser Smartphone model: ");
                    String nameHeadphones = scan.nextLine();
                    System.out.println("Insert Smartphone brand: ");
                    String brandHeadphones = scan.nextLine();
                    System.out.println("Insert Smartphone price: ");
                    double priceHeadphones = scan.nextDouble();
                    System.out.println("Insert Iva on Smartphone: ");
                    double ivaHeadphones = scan.nextDouble();
                    System.out.println("Insert Headphones color: ");
                    String color = scan.nextLine();
                    System.out.println("Are Headphones wireless? (true/false)");
                    boolean wireless = Boolean.parseBoolean(scan.nextLine());
                    Cuffie cuffie = new Cuffie(codeHeadphones, nameHeadphones, brandHeadphones, priceHeadphones, ivaHeadphones, color, wireless);
                    carrelloProdotti.add(cuffie);
                    break;
                case 4:
                    System.out.println("Exit");
                    exit = true;
                    break;

                default:
                    System.out.println("invalid choice");
            }
        }

        for (Prodotto prodotto : carrelloProdotti) {
            System.out.println(prodotto);
            System.out.println("Il prezzo totale è: " + prodotto.priceWithIva());
        }

        System.out.println("Grazie di essere passato da noi!");


        scan.close();
    }
}
