package ExamenanyAnterior;

import java.time.LocalDate;
import java.time.LocalTime;

public class Persona {
	String dni;
    String nombre;
    int edad;
    LocalDate fechaAtencion;
    LocalTime horaAtencion;
    boolean atendidaCorrectamente;
    
	public Persona(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.atendidaCorrectamente = false;
	}
	

}
