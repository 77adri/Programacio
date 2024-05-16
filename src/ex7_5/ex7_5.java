package ex7_5;

import java.util.Scanner;

public class ex7_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceix el tamany del array:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Introduceix els nombres que vols a l'array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Que vol fer?");
        System.out.println("1. Selecció Directa");
        System.out.println("2. Bombollaa");

        int opcion = scanner.nextInt();

        Ordenar ordenador = new Ordenar();

        switch (opcion) {
            case 1:
                ordenador.ordenarArray(array, "seleccio");
                break;
            case 2:
                ordenador.ordenarArray(array, "bombolla");
                break;
            default:
                System.out.println("Opció incorrecte");
                return;
        }

        System.out.println("Array ordenada:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public void ordenarArray(int[] array, String algoritme) {
        switch (algoritme.toLowerCase()) {
            case "seleccio":
                ordenarPerSeleccio(array);
                break;
            case "bombolla":
                ordenarPerBombolla(array);
                break;
            default:
                System.out.println("MAL");
        }
    }

    private void ordenarPerSeleccio(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int indexMinim = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indexMinim]) {
                    indexMinim = j;
                }
            }

            int temp = array[indexMinim];
            array[indexMinim] = array[i];
            array[i] = temp;
        }
    }

    private void ordenarPerBombolla(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
