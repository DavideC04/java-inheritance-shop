package org.java.shop.inheritance;

import java.math.BigDecimal;

/*
Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
codice (numero intero)
nome
marca
prezzo
iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
il codice prodotto sia accessibile solo in lettura
gli altri attributi siano accessibili sia in lettura che in scrittura
il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva formattato
Lo shop gestisce diversi tipi di prodotto:
Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
 */
public class Prodotto {

    // CAMPI
    private int code;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;



    // COSTRUTTORI

    public Prodotto(int code, String brand, BigDecimal price, BigDecimal iva) {
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
    }


    // GETTER E SETTER

    public int getCode() {
        return code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }


    // METODI
    public BigDecimal basicPrice(){
        return  price;
    }

    public BigDecimal priceWithIva(){
        BigDecimal ivaOnPrice = price.multiply(iva);
        BigDecimal finalPrice = price.add(ivaOnPrice);
        return finalPrice;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "code=" + code +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
