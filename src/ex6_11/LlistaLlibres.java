package ex6_11;

public class LlistaLlibres {
	private Llista[] llibres;
	private int numLlibres;
	
	public LlistaLlibres(int num) {
		this.llibres = new Llista[num];
		this.numLlibres = 0;
	}
	
	public void afegirLlibre(Llista llibre) {
		if (numLlibres < llibres.length) {
			llibres[numLlibres++] = llibre;
		}else {
			System.out.println("No hi ha espai.");
		}
	}
	public void eleminiarLlibre(int i) {
		if (i >= 0 && i < numLlibres) {
			for (int n = i; i < numLlibres - 1; i++) {
				llibres[n] = llibres[n + 1];
			}
			llibres[--numLlibres] = null;
		}else {
			System.out.println("NO valido!!!");
		}
	}
	public void modificarLlibre(int i, Llista nouLlibre) {
		if(i >= 0 && i < numLlibres) {
			llibres[i] = nouLlibre;
		}else {
            System.out.println("NO valido!!!");
		}
	}
	public void mostrarLlibres() {
        for (int i = 0; i < numLlibres; i++) {
            System.out.println("Llibre " + (i + 1) + ": " + llibres[i]);
        }
    }
}
