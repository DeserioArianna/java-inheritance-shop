package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private int imei = getNumeroRandom();
    private int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int memoria) {
        super(nome, marca, prezzo, iva);
        this.memoria = memoria;
    }

    public int getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        if (memoria > 0) {
           this.memoria = memoria; 
        } else {
            System.out.println("Il numero di memoria deve essere maggiore di 0");
        }
    }

    @Override
    public String toString() {
        return "Smartphone: " + getNome() + " Marca: " + getMarca() + " Prezzo: " + getPrezzo() + "€ " + " Iva: " + getIva() + " Memoria: " + getMemoria() + "GB";
    }
}
