package com.negozio;

public class mainNegozio {
    private mainNegozio() {
    }

    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Negozio negozio = new Negozio();


        // Creazione di prodotti
        Prodotto prodotto1 = new Prodotto("Latte", 1.5, 10);
        Prodotto prodotto2 = new Prodotto("Pane", 0.8, 20);
        Prodotto prodotto3 = new Prodotto("Uova", 2.0, 30);
        Prodotto prodotto4 = new Prodotto("Formaggio", 3.5, 15);

        // Aggiunta dei prodotti allo scaffale
        negozio.aggiungiProdotto(prodotto1);
        negozio.aggiungiProdotto(prodotto2);    
        negozio.aggiungiProdotto(prodotto3);
        negozio.aggiungiProdotto(prodotto4);

        // Visualizzazione del catalogo
        System.out.println("=== Catalogo Negozio ===");
        negozio.mostraProdotti();

        // Calcolo del valore totale dell'inventario
        System.out.println("=== Valore Totale dell'Inventario ===");
        negozio.valoreInventario();
    }
}
