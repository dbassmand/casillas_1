package ejercicio_71b;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tablero miTablero = new Tablero();
		
		miTablero.creaTablero();
		miTablero.muestraTablero();
		miTablero.posicionTablero();
		miTablero.posicionInicio();
		System.out.println("ARRIBA, ABAJO, IZQUIERDA O DERECHA");
		System.out.println("Pulsa X para salir");
		miTablero.movimiento();
		System.out.println("Gracias por jugar");

	}
			
}
