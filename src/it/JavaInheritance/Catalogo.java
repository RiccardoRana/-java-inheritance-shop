package it.JavaInheritance;

import it.JavaIneheritance.Prodotto.Cuffie;
import it.JavaIneheritance.Prodotto.Prodotto;
import it.JavaIneheritance.Prodotto.Smartphone;
import it.JavaIneheritance.Prodotto.Televisori;


//Nome repo: java-inheritance-shop
//        Nell’esercizio di oggi riprendiamo Java Shop applicando le proprietà di incapsulamento ed ereditarietà che abbiamo visto nel frattempo.
//        Nel progetto java-inheritance-shop, creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
//        - codice (numero intero)
//        - nome
//        - marca
//        - prezzo
//        - iva
//        Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
//        - il codice prodotto sia accessibile solo in lettura
//        - gli altri attributi siano accessibili sia in lettura che in scrittura
//        - il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva formattato
//        Lo shop gestisce diversi tipi di prodotto:
//        - Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
//        - Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
//        - Cuffie, caratterizzate dal colore e se sono wireless o cablate
//        Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto
//        BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di prodotti con dati inseriti tramite scanner. Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo un o Smarphone o un Televisore o  Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
//        Al termine dell’inserimento stampate il catalogo (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
//        Buon lavoro!


import java.util.Random;
import java.util.Scanner;

public class Catalogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        boolean finished = false;
        int n = 0;
        System.out.print("Ciao! Quanti prodotti vuoi mettere in catalogo?  ");
        Prodotto[] prodotti = new Prodotto[Integer.parseInt(in.nextLine())];

        for (int i = 0; i < prodotti.length; i++) {
            System.out.print("Che prodotto vuoi mettere tra Televisore,Cuffie e Smartphone?  ");
            String risposta = in.nextLine();
            if (risposta.equals("Televisore")) {
                System.out.print("Quanto costa?  ");
                prodotti[i] = new Televisori(r.nextInt(100), "XXAS", "Philips", Integer.parseInt(in.nextLine()), 22, 24, true);
            } else if (risposta.equals("Cuffie")) {
                System.out.print("Quanto costa?  ");
                prodotti[i] = new Cuffie(r.nextInt(100), "Airpods", "Philips", Integer.parseInt(in.nextLine()), 22, "BLue", true);
            } else if (risposta.equals("Smartphone")) {
                System.out.print("Quanto costa?  ");
                prodotti[i] = new Smartphone(r.nextInt(100), "Iphone", "Apple", Integer.parseInt(in.nextLine()), 22, 243546452, 64);
            }
        }

        for (int i = 0; i < prodotti.length; i++) {
            prodotti[i].prendiPrezzoIva();
            System.out.println(prodotti[i].toString());
        }





        in.close();
    }


}