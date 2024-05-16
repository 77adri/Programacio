package ex6_11;

public class Menu {
	private Llibre[] llibres;
    private int numLlibres;

    public void LlistaLlibres(int capacitat) {
        llibres = new Llibre[capacitat];
        numLlibres = 0;
    }
    public void inserirLlibre(Llibre llibre) {
        if (numLlibres < llibres.length) {
            llibres[numLlibres++] = llibre;
            System.out.println("Llibre afegit correctament.");
        } else {
            System.out.println("La llista de llibres està plena. No es pot afegir més llibres.");
        }
    }
    public void eliminarLlibre(int index) {
        if (index >= 0 && index < numLlibres) {
            for (int i = index; i < numLlibres - 1; i++) {
                llibres[i] = llibres[i + 1];
            }
            llibres[--numLlibres] = null;
            System.out.println("Llibre eliminat correctament.");
        } else {
            System.out.println("Índex de llibre no vàlid.");
        }
    }
    public void modificarLlibre(int index, Llibre nouLlibre) {
        if (index >= 0 && index < numLlibres) {
            llibres[index] = nouLlibre;
            System.out.println("Llibre modificat correctament.");
        } else {
            System.out.println("Índex de llibre no vàlid.");
        }
    }
    public void mostrarLlibres() {
        System.out.println("Llista de Llibres:");
        for (int i = 0; i < numLlibres; i++) {
            System.out.println((i + 1) + ". " + llibres[i]);
        }
    }
}

