package com.negozio;

import java.time.LocalDate;
import java.time.Year;
import java.util.Objects;

public class Prodotto {

        private String nome;
        private double prezzo;
        private int quantità;
        private int scadenza;
        private int calcolaValoreTotale;
    
        public Prodotto(){}
    
        public Prodotto(String n, double p, int q){
            nome = n;
            prezzo = p;
            quantità = q;
            scadenza = 0;
            calcolaValoreTotale = (int) (prezzo * quantità);
        }
        
// Setters and Getters
public void getcalcolaValoreTotale (int calcolaValoreTotale) {
    this.calcolaValoreTotale = calcolaValoreTotale;
}
public int getcalcolaValoreTotale() {
    return calcolaValoreTotale;
}   
public void setnome(String nome) {
    this.nome = nome;
}
public String getnome() {
    return nome;
}
public void setprezzo(double prezzo) {
    this.prezzo = prezzo;
}
public double getprezzo() {
    return prezzo;

}

public String toString(){
    return "Nome: " + nome + "\n" +
           "Prezzo: " + prezzo + "\n" +
           "Quantità: " + quantità + "\n" +
            "Scadenza: " + scadenza + "\n" +
           "Valore Totale: " + calcolaValoreTotale + "\n";
} 

 public boolean isClassico() {
        int scadenza = this.scadenza;
        if (scadenza == 0) {
            return false;
        }
        LocalDate dataScadenza = LocalDate.of(Year.now().getValue(), scadenza, 1);
        return dataScadenza.isBefore(LocalDate.now());
    }
public boolean isScaduto() {
        int scadenza = this.scadenza;
        if (scadenza == 0) {
            return false;
        }
        LocalDate dataScadenza = LocalDate.of(Year.now().getValue(), scadenza, 1);
        return dataScadenza.isBefore(LocalDate.now());
    }
public boolean isNonScaduto() {
        int scadenza = this.scadenza;
        if (scadenza == 0) {
            return false;
        }
        LocalDate dataScadenza = LocalDate.of(Year.now().getValue(), scadenza, 1);
        
        return scadenza > 0 && dataScadenza.isAfter(LocalDate.now());
    }

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Prodotto)) return false;
    Prodotto prodotto = (Prodotto) o;
    return Double.compare(prodotto.prezzo, prezzo) == 0 &&
            quantità == prodotto.quantità &&
            Objects.equals(nome, prodotto.nome);
}

@Override 
public int hashCode() {
    return Objects.hash(nome, prezzo, quantità);
}

}