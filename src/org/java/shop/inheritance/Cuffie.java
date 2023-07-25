package org.java.shop.inheritance;

/*
Cuffie, caratterizzate dal colore e se sono wireless o cablate
 */

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    // CAMPI
    private String colore;
    private boolean wireless;


    // COSTRUTTORI
    public Cuffie(int code, String name, String brand, double price, double iva, String colore, boolean wireless) {
        super(code, name, brand, price, iva);
        this.colore = colore;
        this.wireless = wireless;
    }




    // GETTER E SETTER

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return wireless;
    }


    // METODI


    @Override
    public String toString() {
        return "Cuffie{" +
                "colore='" + colore + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
