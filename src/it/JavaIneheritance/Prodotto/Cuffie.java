package it.JavaIneheritance.Prodotto;

import it.JavaIneheritance.Prodotto.Prodotto;

public class Cuffie extends Prodotto {

    protected String color;
    protected boolean isWireless;


    public Cuffie(int numCodice, String name, String marca, int prezzo, int iva, String color, boolean isWireless) {
        super(numCodice, name, marca, prezzo, iva);
        this.color = color;
        this.isWireless = isWireless;
    }
}
