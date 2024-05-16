package Vuitreines;

public class Vuitreines {

	private static int totalQueens = 8;
    private static int[] queensPosicio = new int[totalQueens];

    public static void main(String[] args) {
        check(0);
    }

    private static void check(int n) {
        if (n == totalQueens) {
            imprimirSolucio();
            System.exit(0);
        }

        for (int i = 0; i < totalQueens; i++) {
        	queensPosicio[n] = i;
            if (judge(n)) {
                check(n + 1);
            }
        }
    }

    private static boolean judge(int n) {
    	for (int i = 0; i < n; i++) {
            if (queensPosicio[i] == queensPosicio[n] || queensPosicio[i] - queensPosicio[n] == i - n || queensPosicio[i] - queensPosicio[n] == n - i) {
                return false;
            }
        }
        return true;
    }

    private static void imprimirSolucio() {
        System.out.println("Solucio resolta--> ");
        for (int i = 0; i < totalQueens; i++) {
            for (int j = 0; j < totalQueens; j++) {
                if (queensPosicio[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
  