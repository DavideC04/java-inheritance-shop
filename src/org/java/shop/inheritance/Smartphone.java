package org.java.shop.inheritance;

/*
Lo shop gestisce diversi tipi di prodotto:
Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
 */

import java.math.BigDecimal;

public class Smartphone extends Prodotto{

    // CAMPI
    private String imei;
    private int memoria;



    // COSTRUTTORI
    public Smartphone(int code, String brand, BigDecimal price, BigDecimal iva) {
        super(code, brand, price, iva);
        this.imei = imei;
        this.memoria = memoria;
    }


    // GETTER E SETTER

    public String getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }


    // METODI


    @Override
    public String toString() {
        return "Smartphone{" +
                "imei='" + imei + '\'' +
                ", memoria=" + memoria +
                '}';
    }
}
