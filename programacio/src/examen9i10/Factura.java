package examen9i10;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Factura {

	public static void main(String[] args) {
		//Ruta al futxer de factures on anira a parar tota la informacio
		File f = new File ("C:\\Users\\ciclesgs\\Downloads\\factures.dat");
		//Atrubuts demenats a l'enunciat
		Date[] data = null;
		double[] total = null;
		String[] linies = null;
		String lineaLlegida;
		int numLineas = 0;
		//ArrayList per la factura 
		ArrayList<Factura> linies2 = new ArrayList<Factura>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			linies = br.readLine().split(";");
			
			
			while((lineaLlegida = br.readLine())!= null ) {
				numLineas++;
				linies = lineaLlegida.split(",");
				for(int i = 0; i<linies.length;i++) {
					
				}
			}
			//farem un for per al moment de la data que surti cada dia, mes i any
			for(Date s : data.clone());
				String s = null;
				System.out.println(s + " " + new String("dd-MM-yyyy"));
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

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
		
			System.out.println("Data: " + data);
			System.out.println("Total: " + total);
			System.out.println("Linies de Factura: \n" + linies);
		
	}

}
