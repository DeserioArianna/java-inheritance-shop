package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean wireless;

    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        if (wireless) {
            System.out.println("Le cuffie sono wireless");
            return wireless;
        } else {
            System.out.println("Le cuffie sono cablate");
            return wireless;
        }
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Cuffie: " + getNome() + " Marca: " + getMarca() + " Prezzo: " + getPrezzo() + "€ " + " Iva: " + getIva() + " Colore: " + colore + " " + isWireless();
    }
}
