package it.JavaIneheritance.Prodotto;

import it.JavaIneheritance.Prodotto.Prodotto;

public class Televisori extends Prodotto {

    protected int dim; //Pollici
    protected boolean smart;


    public Televisori(int numCodice, String name, String marca, int prezzo, int iva, int dim, boolean smart) {
        super(numCodice, name, marca, prezzo, iva);
        this.dim = dim;
        this.smart = smart;


    }
}
