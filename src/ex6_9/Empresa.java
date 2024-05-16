package ex6_9;

public class Empresa {

	public static void main(String[] args) {
		Empleats empleats1 = new Empleats("Joan", "Carreras", 30, 1700);
		Empleats empleats2 = new Empleats("Felipe", "Gutierrez", 32, 1750);
		Director director = new Director("Alícia", "Palliser", 40, 2500);
		Treballador treballadors = new Treballador("Roberto", "De la Suarez", 25, 1200);
		
		System.out.println(empleats1);
		System.out.println(empleats2);
        System.out.println(director);
        System.out.println(treballadors);
	}
}
