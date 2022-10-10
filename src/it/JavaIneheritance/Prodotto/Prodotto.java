package it.JavaIneheritance.Prodotto;

public class Prodotto {

    protected int numCodice;
    protected String name;
    protected String marca;
    protected int prezzo;
    protected int iva;



    public Prodotto(int numCodice, String name, String marca, int prezzo, int iva) {
        this.numCodice = numCodice;
        this.name = name;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
        ;
    }

    public int getNumCodice() {
        return numCodice;
    }

    public String getName() {
        return name;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public int getIva() {
        return iva;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public final int prendiPrezzoIva() {
        return this.prezzo + ((this.prezzo / 100) * this.iva);
    }

    @Override
    public String toString() {
        return " Codice prodotto:" + this.numCodice + ", Nome:" + this.name + ", Marca: " + this.marca + ", Prezzo: " + this.prezzo + ", Iva:" + this.iva + "%, Prezzo finale:" + this.prendiPrezzoIva()+ "";
    }

}
