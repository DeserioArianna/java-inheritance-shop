package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    protected int codice = getNumeroRandom();
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected BigDecimal iva;
    protected BigDecimal prezzoIvato;

    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
        this.prezzoIvato = calcolaPrezzoIvato();
    }

    protected int getNumeroRandom() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal calcolaPrezzoIvato() {
        BigDecimal prezzoIvato = prezzo.add(prezzo.multiply(iva));
        return prezzoIvato.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getPrezzoIvato() {
        return prezzoIvato;
    }

}
