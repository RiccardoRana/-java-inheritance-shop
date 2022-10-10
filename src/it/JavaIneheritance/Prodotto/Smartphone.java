package it.JavaIneheritance.Prodotto;

import it.JavaIneheritance.Prodotto.Prodotto;

public class Smartphone extends Prodotto {

    protected int IMIEI;
    protected int memory;


    public Smartphone(int numCodice, String name, String marca, int prezzo, int iva, int IMIEI, int memory) {
        super(numCodice, name, marca, prezzo, iva);
        this.IMIEI = IMIEI;
        this.memory = memory;


    }


}
