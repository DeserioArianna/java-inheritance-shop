package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Prodotto> carrello = new ArrayList<Prodotto>();

        boolean continua = true;

        while (continua) {

            System.out.println("Scegli un prodotto tra Smartphone, Televisore o Cuffie se vuoi uscire scrivi Exit");
            String scelta = input.nextLine();
            if (scelta.equalsIgnoreCase("Exit")) {
                continua = false;
                break;
            }
            
            System.out.println("Aggiungi un prodotto al carrello con nome, marca, prezzo, iva ");
            String nomeProdotto = input.nextLine();
            String marcaProdotto = input.nextLine();
            BigDecimal prezzoProdotto = input.nextBigDecimal();
            BigDecimal ivaProdotto = input.nextBigDecimal();

            if (scelta.equalsIgnoreCase("Smartphone")) {
                System.out.println("Aggiungi la memoria dello smartphone");
                int memoriaProdotto = input.nextInt();
                Smartphone smartphone = new Smartphone(nomeProdotto, marcaProdotto, prezzoProdotto, ivaProdotto,
                        memoriaProdotto);
                carrello.add(smartphone);
            } else if (scelta.equalsIgnoreCase("Televisore")) {
                System.out.println("Aggiungi i pollici del televisore");
                int polliciProdotto = input.nextInt();
                input.nextLine();
                System.out.println("Il televisore è smart? (true/false)");
                boolean smart = input.nextBoolean();
                input.nextLine();
                Televisori televisore = new Televisori(nomeProdotto, marcaProdotto, prezzoProdotto, ivaProdotto,
                        polliciProdotto, smart);
                carrello.add(televisore);
            } else if (scelta.equalsIgnoreCase("Cuffie")) {
                System.out.println("Aggiungi il colore delle cuffie");
                String colore = input.nextLine();
                input.nextLine();
                System.out.println("Le cuffie sono wireless? (true/false)");
                boolean wireless = input.nextBoolean();
                Cuffie cuffie = new Cuffie(nomeProdotto, marcaProdotto, prezzoProdotto, ivaProdotto, colore, wireless);
                input.nextLine();
                carrello.add(cuffie);
            } else {
                System.out.println("Prodotto non disponibile");
            }

            while (continua) {
                System.out.println("Vuoi aggiungere un altro prodotto? (si/no)");
                String risposta = input.nextLine();
                if (risposta.equalsIgnoreCase("no")) {
                    continua = false;
                    break;
                } else if (risposta.equalsIgnoreCase("si")) {
                    break;
                } else {
                    System.out.println("Risposta non valida");
                }
            }
        }

        System.out.println("Il carrello contiene: ");
        carrello.forEach((prodotto) -> {
            System.out.println(prodotto.toString() + " Prezzo con IVA: " + prodotto.getPrezzoIvato());
        });

        BigDecimal totale = new BigDecimal(0);
        for (Prodotto prodotto : carrello) {
            totale = totale.add(prodotto.getPrezzoIvato());
        }

        System.out.println("Il tuo carrello contiene " + carrello.size() + " prodotti" + " con un totale di: " + totale + "€");
        input.close();
    }
}
