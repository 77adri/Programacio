package penjat;

import java.util.Random;
import java.util.Scanner;

public class Penjat {

    private String[] llistaParaules = {"mbappe", "leao", "programacio", "solitario", "olivia"};
    private String paraulaSecreta;
    private char[] paraulaEncertada;
    private int intentsMaxims = 6;
    private int intentsRestants;
    private StringBuilder lletresFallades;

    public Penjat() {
        seleccionarParaula();
        inicialitzarJoc();
    }

    private void seleccionarParaula() {
        Random random = new Random();
        paraulaSecreta = llistaParaules[random.nextInt(llistaParaules.length)];
    }

    private void inicialitzarJoc() {
        paraulaEncertada = new char[paraulaSecreta.length()];
        for (int i = 0; i < paraulaEncertada.length; i++) {
            paraulaEncertada[i] = '-';
        }

        intentsRestants = intentsMaxims;
        lletresFallades = new StringBuilder();
    }

    private void mostrarTauler() {
        System.out.println("Paraula: " + new String(paraulaEncertada));
        System.out.println("Errors: " + lletresFallades.toString());
        System.out.println("Intents restants: " + intentsRestants);
    }

    private void dibuixarPenjat() {
    	switch (intentsRestants) {
        case 6:
            System.out.println("  __ ");
            System.out.println(" /  |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            break;
        case 5:
            System.out.println("  __ ");
            System.out.println(" /  |");
            System.out.println("|   O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            break;
        case 4:
            System.out.println("  __ ");
            System.out.println(" /  |");
            System.out.println("|   O");
            System.out.println("|   |");
            System.out.println("|");
            System.out.println("|");
            break;
        case 3:
            System.out.println("  __ ");
            System.out.println(" /  |");
            System.out.println("|   O");
            System.out.println("|  /|");
            System.out.println("|");
            System.out.println("|");
            break;
        case 2:
            System.out.println("  __ ");
            System.out.println(" /  |");
            System.out.println("|   O");
            System.out.println("|  /|\\");
            System.out.println("|");
            System.out.println("|");
            break;
        case 1:
            System.out.println("  __ ");
            System.out.println(" /  |");
            System.out.println("|   O");
            System.out.println("|  /|\\");
            System.out.println("|  /");
            System.out.println("|");
            break;
        case 0:
            System.out.println("  __ ");
            System.out.println(" /  |");
            System.out.println("|   O");
            System.out.println("|  /|\\");
            System.out.println("|  / \\");
            System.out.println("|");
            break;
    	}
    }
    

    private boolean jocFinalitzat() {
        return paraulaEncertadaCompletada() || intentsRestants == 0;
    }

    private boolean paraulaEncertadaCompletada() {
        for (char lletra : paraulaEncertada) {
            if (lletra == '-') {
                return false;
            }
        }
        return true;
    }

    private void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (!jocFinalitzat()) {
            mostrarTauler();
            System.out.print("Introdueix una lletra: ");
            char lletra = scanner.next().charAt(0);

            if (paraulaSecretaConteLletra(lletra)) {
                for (int i = 0; i < paraulaSecreta.length(); i++) {
                    if (paraulaSecreta.charAt(i) == lletra) {
                        paraulaEncertada[i] = lletra;
                    }
                }
            } else {
                lletresFallades.append(lletra).append(" ");
                intentsRestants--;
                dibuixarPenjat();
            }
        }

        mostrarTauler();

        if (intentsRestants > 0) {
            System.out.println("Felicitats! Has guanyat.");
        } else {
            System.out.println("Oh no! Has perdut. La paraula era: " + paraulaSecreta);
        }
    }

    private boolean paraulaSecretaConteLletra(char lletra) {
        for (int i = 0; i < paraulaSecreta.length(); i++) {
            if (paraulaSecreta.charAt(i) == lletra) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Penjat joc = new Penjat();
        joc.jugar();
    }
}
