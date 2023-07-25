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
                    int codeTV = scan.nextInt();
                    System.out.println("Inser TV model: ");
                    String nameTV = scan.next();
                    System.out.println("Insert TV brand: ");
                    String brandTV = scan.next();
                    System.out.println("Insert TV price: ");
                    double priceTV = scan.nextDouble();
                    System.out.println("Insert Iva on TV: ");
                    double ivaTV = scan.nextDouble();
                    System.out.println("Is TV smart? (true/false)");
                    boolean smart = scan.nextBoolean();
                    System.out.println("Insert TV width: ");
                    int dimensions = scan.nextInt();
                    Televisori televisore = new Televisori(codeTV, nameTV, brandTV, priceTV, ivaTV, smart, dimensions);
                    carrelloProdotti.add(televisore);
                    break;
                case 3:
                    System.out.println("Insert code: ");
                    int codeHeadphones = scan.nextInt();
                    System.out.println("Inser Headphones model: ");
                    String nameHeadphones = scan.next();
                    System.out.println("Insert Headphones brand: ");
                    String brandHeadphones = scan.next();
                    System.out.println("Insert Headphones price: ");
                    double priceHeadphones = scan.nextDouble();
                    System.out.println("Insert Iva on Headphones: ");
                    double ivaHeadphones = scan.nextDouble();
                    System.out.println("Insert Headphones color: ");
                    String color = scan.next();
                    System.out.println("Are Headphones wireless? (true/false)");
                    boolean wireless = scan.nextBoolean();
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
