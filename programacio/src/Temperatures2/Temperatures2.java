package Temperatures2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;

public class Temperatures2 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\ciclesgs\\Downloads\\temperatures.txt");
		String[] nomMesos = null;
		String[] temperatures = null;
		String lineaLlegida = "";
		HashMap<String, Double> mitjana = new HashMap<>();
		int numLineas = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			nomMesos = br.readLine().split(",");
			
			while((lineaLlegida = br.readLine())!= null ) {
				numLineas++;
				temperatures = lineaLlegida.split(",");
				for(int i = 0; i<temperatures.length;i++) {
					if(mitjana.containsKey(nomMesos[i])) {
						mitjana.put(nomMesos[i], Double.parseDouble(temperatures[i]) + mitjana.get(nomMesos[i]));
						
					}else {
						mitjana.put(nomMesos[i], Double.parseDouble(temperatures[i]));
					}
				}
			}
			
			br.close();
			for(String s : mitjana.keySet()) {
				mitjana.put(s, mitjana.get(s)/numLineas);
			}
			for(String s : nomMesos) {
				System.out.println(s + " " +  new DecimalFormat("#.00").format (mitjana.get(s)));
			}
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
