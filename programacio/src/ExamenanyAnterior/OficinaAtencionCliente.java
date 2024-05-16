package ExamenanyAnterior;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class OficinaAtencionCliente {

	public static void main(String[] args) {
		Persona[] cola = new Persona[100];
		int cantidadPersonas = 0;
		
		Persona[] atendidasCorrectamente = new Persona[100];
		int cantidadAtendidas = 0;
		
		Persona[] noAtendidasCorrectamente = new Persona[100];
		int cantidadnoAtendidas = 0;
		
		Scanner array = new Scanner(System.in);
		
		while (true) {
			System.out.println("MENU-->");
	        System.out.println("1. Ver la cola de personas: ");
	        System.out.println("2. Llegada de una nueva persona a la oficina: ");
	        System.out.println("3. Atención de la primera persona de la cola: ");
	        System.out.println("4. Ver lista de personas atendidas correctamente por orden de entrada: ");
	        System.out.println("5. Ver lista de personas que no se han podido atender correctamente por orden de entrada: ");
	        System.out.println("6. Ver lista de personas atendidas correctamente ordenadas por DNI: ");
	        System.out.println("7. Ver lista de personas que no se han podido atender correctamente ordenadas por DNI: ");
	        System.out.println("8. Exit");
	        
        Scanner scanner = null;
		int opcion = scanner.nextInt();
        scanner.nextLine(); 
        switch (opcion) {
            case 1:
                verCola(cola, cantidadPersonas);
                break;
            case 2:
                llegarNuevaPersona(cola, scanner, cantidadPersonas);
                cantidadPersonas++;
                break;
            case 3:
                atenderPrimeraPersona(cola, atendidasCorrectamente, noAtendidasCorrectamente, cantidadPersonas,
                        cantidadAtendidas, cantidadnoAtendidas);
                cantidadPersonas--;
                break;
            case 4:
                verLista(atendidasCorrectamente, cantidadAtendidas);
                break;
            case 5:
                verLista(noAtendidasCorrectamente, cantidadnoAtendidas);
                break;
            case 6:
                verListaOrdenadaPorDNI(atendidasCorrectamente, cantidadAtendidas);
                break;
            case 7:
                verListaOrdenadaPorDNI(noAtendidasCorrectamente, cantidadnoAtendidas);
                break;
            case 8:
                System.out.println("¡Hasta luego!");
                System.exit(0);
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}

private static void verCola(Persona[] cola, int cantidadPersonas) {
    System.out.println("Cola de personas:");
    for (int i = 0; i < cantidadPersonas; i++) {
        System.out.println("DNI: " + cola[i].dni + ", Nombre: " + cola[i].nombre + ", Edad: " + cola[i].edad);
    }
}

private static void llegarNuevaPersona(Persona[] cola, Scanner scanner, int cantidadPersonas) {
    try {
        System.out.println("Introduce el DNI:");
        String dni = scanner.nextLine();

        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        cola[cantidadPersonas] = new Persona(dni, nombre, edad);
        System.out.println("Persona agregada a la cola correctamente.");
    } catch (Exception e) {
        System.out.println("Error al introducir los datos. Asegúrate de ingresar datos válidos.");
    }
}

private static void atenderPrimeraPersona(Persona[] cola, Persona[] atendidasCorrectamente,
        Persona[] noAtendidasCorrectamente, int cantidadPersonas, int cantidadAtendidas, int cantidadNoAtendidas) {
    if (cantidadPersonas > 0) {
        Persona personaActual = cola[0];
        for (int i = 0; i < cantidadPersonas - 1; i++) {
            cola[i] = cola[i + 1];
        }
        cantidadPersonas--;

        personaActual.fechaAtencion = LocalDate.now();
        personaActual.horaAtencion = LocalTime.now();

        personaActual.atendidaCorrectamente = Math.random() < 0.8; // 80% de probabilidad de ser atendido correctamente

        if (personaActual.atendidaCorrectamente) {
            atendidasCorrectamente[cantidadAtendidas] = personaActual;
            cantidadAtendidas++;
            System.out.println("Persona atendida correctamente.");
        } else {
            noAtendidasCorrectamente[cantidadNoAtendidas] = personaActual;
            cantidadNoAtendidas++;
            System.out.println("No se pudo atender correctamente a la persona. Faltan documentos.");
        }
    } else {
        System.out.println("No hay personas en la cola para atender.");
    }
}

private static void verLista(Persona[] lista, int cantidad) {
    System.out.println("Lista de personas:");
    for (int i = 0; i < cantidad; i++) {
        System.out.println("DNI: " + lista[i].dni + ", Nombre: " + lista[i].nombre + ", Edad: " + lista[i].edad
                + ", Día de atención: " + lista[i].fechaAtencion + ", Hora de atención: " + lista[i].horaAtencion
                + ", Servida correctamente: " + (lista[i].atendidaCorrectamente ? "Sí" : "No"));
    }
}

private static void verListaOrdenadaPorDNI(Persona[] lista, int cantidad) {
    Arrays.sort(lista, 0, cantidad, (p1, p2) -> p1.dni.compareTo(p2.dni));
    verLista(lista, cantidad);	
	}

}