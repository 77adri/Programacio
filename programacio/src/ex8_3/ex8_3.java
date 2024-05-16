package ex8_3;

import java.io.IOException;

public class ex8_3 {
	public static void main(String[] args) {
        try {
            metodoIOException();
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException: " + e.getMessage());
        }

        metodoNullPointerException();
    }

    public static void metodoIOException() throws IOException {
        throw new IOException("Simulación de IOException");
    }

    public static void metodoNullPointerException() {
        throw new NullPointerException("Simulación de NullPointerException");
    }
}