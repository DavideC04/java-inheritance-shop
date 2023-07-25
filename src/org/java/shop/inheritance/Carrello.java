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

        Scanner scan = new Scanner(System.in);

        System.out.println("Benvenuto nel nostro shop!");




        scan.close();
    }
}
