package com.negozio;

import java.time.LocalDate;
import java.time.Year;
import java.util.Objects;

public class Scaffale {

    private Prodotto[] scaffale;
    private int dimensione;


    public Prodotto[] getScaffale() {
        return scaffale;
    }

    public int getDimensione() {
        return dimensione;
    }

    public Negozio() {
        scaffale = new Prodotto[50];
        dimensione = 0;
    }

    public void aggiungiProdotto(Prodotto l) {
        if (dimensione < scaffale.length) {
            scaffale[dimensione] = l;
            dimensione++;
        } else {
            System.out.println("Scaffale pieno, impossibile aggiungere il prodotto.");
        }
    }

public void valoreInventario() {
    double valoreTotale = 0;
    for (int i = 0; i < dimensione; i++) {
        valoreTotale += scaffale[i].getcalcolaValoreTotale();
    }
    System.out.println("Valore totale dell'inventario: " + valoreTotale);
}

public void mostraProdotti() {
    for (int i = 0; i < dimensione; i++) {
        System.out.println(scaffale[i].toString());
    }
}

public void mostraProdottiScaduti() {
    for (int i = 0; i < dimensione; i++) {
        if (scaffale[i].isClassico()) {
            System.out.println(scaffale[i].toString());
        }
    }
}


}