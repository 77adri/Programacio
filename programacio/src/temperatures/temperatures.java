package temperatures;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class temperatures {

	public static void main(String[] args) {
		try {
			File f  = new File ("C:\\Users\\ciclesgs\\Downloads\\temperatures.txt");
			HashMap<String, Double> mitjatemperatures = new HashMap<>();
		
			BufferedReader br = new BufferedReader (new FileReader(f));
			String linea = null;
		
			while (null != (linea = br.readLine()))
				System.out.println(linea);
			br.close();
			Object valores;
			for (int i = 0; i < valores.length; i++) {
                Object[] meses;
				String mes = ((String) meses[i]).trim();
                double temp = Double.parseDouble(valores[i].trim());
                HashMap<String, Double> sumaTemperaturas;
				sumaTemperaturas.put(mes, sumaTemperaturas.getOrDefault(mes, 0.0) + temp);
                cuentaTemperaturas.put(mes, cuentaTemperaturas.getOrDefault(mes, 0) + 1);

            }
			
		} catch (IOException e) {
            System.out.println("Error en -->" + e.getMessage());
	}
	
}