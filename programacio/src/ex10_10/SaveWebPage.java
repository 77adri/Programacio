package ex10_10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class SaveWebPage {
	 public static void main(String[] args) {
	        // URL de la pàgina web que volem descarregar
	        String webpageUrl = "http://www.iesjoanramis.org";
	        
	        // Nom del fitxer on desarem el contingut
	        String outputFilePath = "pagina_guardada.html";
	        
	        BufferedReader in = null;
	        PrintWriter out = null;
	        
	        try {
	            // Obrim un flux d'entrada des de la URL
	            URL url = new URL(webpageUrl);
	            in = new BufferedReader(new InputStreamReader(url.openStream()));
	            
	            // Obrim un flux de sortida per escriure el contingut en un fitxer
	            out = new PrintWriter(new FileWriter(outputFilePath));

	            String inputLine;
	            
	            // Llegim el contingut línia per línia i l'escrivim al fitxer
	            while ((inputLine = in.readLine()) != null) {
	                out.println(inputLine);
	            }
	            
	            System.out.println("Pàgina web desada a " + outputFilePath);
	        
	        } catch (IOException e) {
	            e.printStackTrace();
	        
	        } finally {
	            try {
	                // Tanquem els fluxos per evitar fuites de memòria
	                if (in != null) {
	                    in.close();
	                }
	                if (out != null) {
	                    out.close();
	                }
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
}
