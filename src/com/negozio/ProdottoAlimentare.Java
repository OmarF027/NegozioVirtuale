package com.negozio;

import java.time.LocalDate;
import java.time.Year;
import java.util.Objects;

public class ProdottoAlimentare extends Prodotto {

    private int dataScadenza;
    private int calcolaValoreTotale;
    private int quantità;
    private String nome;

    public ProdottoAlimentare(String nome, double prezzo, int quantità, int dataScadenza) {
        super(nome, prezzo, quantità);
        this.dataScadenza = dataScadenza;
        this.calcolaValoreTotale = (int) (prezzo * quantità);
    }
    public int getDataScadenza() {
        return dataScadenza;
    }
    public void setDataScadenza(int dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
    public int getCalcolaValoreTotale() {
        return calcolaValoreTotale;
    }
    public void setCalcolaValoreTotale(int calcolaValoreTotale) {
        this.calcolaValoreTotale = calcolaValoreTotale;
    }
    public int getQuantità() {
        return quantità;
    }
    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Data di scadenza: " + dataScadenza + "\n" +
               "Valore Totale: " + calcolaValoreTotale + "\n";
    }
    @Override
    public boolean isClassico() {
        if (dataScadenza == 0) {
            return false;
        }
        LocalDate dataScadenza = LocalDate.of(Year.now().getValue(), dataScadenza, 1);
        return dataScadenza.isBefore(LocalDate.now());
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataScadenza, calcolaValoreTotale);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ProdottoAlimentare)) return false;
        ProdottoAlimentare other = (ProdottoAlimentare) obj;
        return super.equals(obj) && dataScadenza == other.dataScadenza && calcolaValoreTotale == other.calcolaValoreTotale;
    }
} 