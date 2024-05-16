package ex6_10;

import java.util.Scanner;

public class Figura {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 FiguraGeometrica figura = null;

	        while (true) {
	            System.out.println("1--> Crear Rectangle");
	            System.out.println("2--> Crear Quadrat");
	            System.out.println("3--> Crear Cercle");
	            System.out.println("4--> Crear Rombe");
	            System.out.println("5--> Calcular Àrea i Perímetre");
	            System.out.println("6--> Sortir");

	            System.out.print("Que vols fer: ");
	            int opcio = scanner.nextInt();
	            switch (opcio) {
	                case 1:
	                    figura = crearRectangle(scanner);
	                    break;
	                case 2:
	                    figura = crearQuadrat(scanner);
	                    break;
	                case 3:
	                    figura = crearCercle(scanner);
	                    break;
	                case 4:
	                    figura = crearRombe(scanner);
	                    break;
	                case 5:
	                    calcularAreaIPerimetre(figura);
	                    break;
	                case 6:
	                    System.out.println("Adio Bello!!");
	                    System.exit(0);
	                default:
	                    System.out.println("Posa un nombre del menu, gracies.");
	                    break;
	            }
	        }
	    }
	    private static FiguraGeometrica crearRectangle(Scanner scanner) {
	        System.out.print("Introdueix la X: ");
	        double x = scanner.nextDouble();
	        System.out.print("Introdueix la Y: ");
	        double y = scanner.nextDouble();
	        System.out.print("Introdueix la base del rectangle: ");
	        double base = scanner.nextDouble();
	        System.out.print("Introdueix l'altura del rectangle: ");
	        double altura = scanner.nextDouble();

	        return (FiguraGeometrica) new Rectangle(x, y, base, altura);
	    }
	    private static FiguraGeometrica crearQuadrat(Scanner scanner) {
	        System.out.print("Introdueix la coordenada X: ");
	        double x = scanner.nextDouble();
	        System.out.print("Introdueix la coordenada Y: ");
	        double y = scanner.nextDouble();
	        System.out.print("Introdueix la mida del costat del quadrat: ");
	        double costat = scanner.nextDouble();
	        
	        return new Quadrat(x, y, costat);
	    }
	    private static FiguraGeometrica crearCercle(Scanner scanner) {
	        System.out.print("Introdueix la coordenada X: ");
	        double x = scanner.nextDouble();
	        System.out.print("Introdueix la coordenada Y: ");
	        double y = scanner.nextDouble();
	        System.out.print("Introdueix el radi del cercle: ");
	        double radi = scanner.nextDouble();

	        return new Cercle(x, y, radi);
	    }
	    private static FiguraGeometrica crearRombe(Scanner scanner) {
	        System.out.print("Introdueix la coordenada X: ");
	        double x = scanner.nextDouble();
	        System.out.print("Introdueix la coordenada Y: ");
	        double y = scanner.nextDouble();
	        System.out.print("Introdueix la longitud de la diagonal major del rombe: ");
	        double diagonalMajor = scanner.nextDouble();
	        System.out.print("Introdueix la longitud de la diagonal menor del rombe: ");
	        double diagonalMinor = scanner.nextDouble();

	        return new FiguraGeometrica(x, y);
	    }
	    private static void calcularAreaIPerimetre(FiguraGeometrica figura) {
	        if (figura != null) {
	            System.out.println("Àrea: " + figura.area());
	            System.out.println("Perímetre: " + figura.perimetre() + "\n");
	        } else {
	            System.out.println("Crea una figura primer abans de calcular l'àrea i el perímetre.");
	        }
	    }
	}