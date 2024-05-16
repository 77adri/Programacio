package examen9i10;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class LiniaDeFactura {

	public static void main(String[] args) {
		//Ruta al futxer de factures on anira a parar tota la informacio
		File f = new File("C:\\Users\\ciclesgs\\Downloads\\factures.dat");
		//Atrubuts demenats a l'enunciat
		String[] descripcio = null;
		String[] quantitat = null;
		Object preuUnitari = null;
		String liniaLlegida = "";
		//ArrayList per la factura 
		ArrayList<Factura> linies = new ArrayList<Factura>();
		int numLinias = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			descripcio = br.readLine().split(";");
			
			while((liniaLlegida = br.readLine())!= null ) {
				numLinias++;
				for(int i = 0; i<quantitat.length;i++) {
					
				}
			}
			br.close();
			
			//Empram el for per posar els decimals que volem a la factura final
			for(String s : descripcio) {
				int i = 0;
				System.out.println(i + " " + new DecimalFormat("#.00").format (linies.get(i)));
			}
			
		}
		//catch per les Exceptions
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
			//farem un altre try catch per el canvi de fitxers entre el .txt/.csv perque pasi al fitxer de factures.dat
	        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ciclesgs\\Downloads\\compra1.txt"));

	             DataOutputStream writer = new DataOutputStream(new FileOutputStream("C:\\Users\\ciclesgs\\Downloads\\factures.dat"))) {

	            String linea;

	            while ((linea = reader.readLine()) != null) {

	                writer.writeUTF(linea);

	            }

	            System.out.println("Archivo de texto convertido a binario correctamente.");

	        } catch (IOException e) {

	            System.err.println("Error al convertir el archivo de texto a binario: " + e.getMessage());

	        }

	    }
	}