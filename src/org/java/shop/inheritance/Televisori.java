package org.java.shop.inheritance;

/*
Lo shop gestisce diversi tipi di prodotto:
Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
 */
import java.math.BigDecimal;

public class Televisori extends Prodotto{

    // CAMPI
    private int dimensioni;
    private boolean smart;


    // COSTRUTTORI
    public Televisori(int code, String name, String brand, double price, double iva, boolean smart, int dimensioni) {
        super(code, name, brand, price, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }




    // GETTER E SETTER

    public int getDimensioni() {
        return dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }


    // METODI


    @Override
    public String toString() {
        return "Televisori{" +
                "dimensioni=" + dimensioni +
                ", smart=" + smart +
                '}';
    }
}
