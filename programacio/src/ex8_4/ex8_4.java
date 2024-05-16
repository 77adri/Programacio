package ex8_4;

public class ex8_4 {

	private static String valor;

	public static void main(String[] args) {
		try {
			provocoExcepcio(0);
			provocoExcepcio(1);
		}catch(LaExcepcio e) {
			e.printStackTrace();
		}
		System.out.println("El programa finalitza correctament");
	}

	public static void provocoExcepcio(int valor) throws LaExcepcio {
		System.out.println ("Valor: " + valor);
		if (valor!=0) throw new LaExcepcio (valor);
		System.out.println ("No s'ha provocat l'excepció.");
		}

	public class LaExcepcio extends Exception{
		private Integer valor;
		
		public LaExcepcio(int xxx) {
			valor = new Integer(xxx);
		}
		
		public String ToString() {
			return "Exception LaMevaExcepcio: Error motivat per valor = " + valor.toString();
		}
	} 
}
