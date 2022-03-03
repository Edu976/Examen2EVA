package examen2EVA;

public class Ejercicio1 {
	public static int habilidadDisparo(int disparo) {		
		// 10 es el mayor y 0 el menor posible
		int numeroAleatorio = (int) (Math.random()*(10-0)) + 0;
		System.out.println(numeroAleatorio);
		return numeroAleatorio;
	}
	
	public static int habilidadPorteria(int portero) {		
		// 10 es el mayor y 0 el menor posible
		int numeroAleatorio = (int) (Math.random()*(10-0)) + 0;
		System.out.println(numeroAleatorio);
		return numeroAleatorio;
	}
	
	public static void main(String[] args) {
		Jugador j1 = new Jugador("Juan", 1, habilidadDisparo(1), habilidadPorteria(1));
		Jugador j2 = new Jugador("pedro", 2, habilidadDisparo(1), habilidadPorteria(1));
		Jugador j3 = new Jugador("Maria", 3, habilidadDisparo(1), habilidadPorteria(1));
		Jugador j4 = new Jugador("Marcos", 4, habilidadDisparo(1), habilidadPorteria(1));
		Jugador j5 = new Jugador("Lucas", 5, habilidadDisparo(1), habilidadPorteria(1));
		Jugador j6 = new Jugador("Alejandro", 6, habilidadDisparo(1), habilidadPorteria(1));
		Jugador j7 = new Jugador("Cristian", 7, habilidadDisparo(1), habilidadPorteria(1));
		Jugador j8 = new Jugador("Ana", 8, habilidadDisparo(1), habilidadPorteria(1));
		Jugador j9 = new Jugador("Carmen", 9, habilidadDisparo(1), habilidadPorteria(1));
		Jugador j10 = new Jugador("Pedro", 10, habilidadDisparo(1), habilidadPorteria(1));
	}
}
