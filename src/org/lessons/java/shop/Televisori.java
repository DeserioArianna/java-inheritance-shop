package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori  extends Prodotto {
    private int pollici;
    private boolean smart;

    public Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int pollici, boolean smart) {
        super(nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.smart = smart;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        if (pollici > 0) {
            this.pollici = pollici;
        } else {
            System.out.println("Il numero di pollici deve essere maggiore di 0");   
        }
    }

    public boolean isSmart() {
        if (smart == true) {
            System.out.println("Il televisore è smart");
            return true;
        } else {
            System.out.println("Il televisore non è smart");
            return false;
        }
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Televisore: " + getNome() + " Marca: " + getMarca() + " Prezzo: " + getPrezzo() + "€ " + " Iva: " + getIva() + " Pollici: " + getPollici() + " " + isSmart();
    }
}


