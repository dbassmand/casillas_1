package ejercicio_71b;

import java.util.Scanner;

public class Tablero {
	
	Scanner entrada = new Scanner(System.in);
	int lado=0;
	int array [][];
	int ejeX, ejeY;
	String mueve;
	
	public Tablero() {
				
	}
	
	public void creaTablero() {
		
		
		
		System.out.print("Cuantas casillas quieres que tenga el tablero?: ");
				 lado = entrada.nextInt();
				 array = new int[lado][lado];
		
		for (int i=0;i<lado;i++) {
			for(int j=0;j<lado;j++) {
				if(i==0 ||j==0||i==(lado-1)||j==(lado-1)) {
					array[i][j]=1;
				}else {
					array[i][j]=0;
				}
			}
		}
		
	}
	
	public void muestraTablero() {
		for (int i=0;i<lado;i++) {
			for(int j=0;j<lado;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	public void posicionTablero() {
		System.out.println("En que posicion quieres empezar?");
		System.out.print("Eje X: ");
		ejeX =entrada.nextInt();
		if(ejeX>lado) {
			System.out.println("Debes proporcionar una valor menor al lado del tablero");
			posicionTablero();
		}
		System.out.print("Eje y: ");
		ejeY=entrada.nextInt();
		if(ejeY>lado) {
			System.out.println("Debes proporcionar una valor menor al lado del tablero");
			posicionTablero();
		}
	}

	public void posicionInicio() {
			
		array[ejeY-1][ejeX-1]=8;
		muestraTablero();
	}
	
	public void movimiento() {
		
		System.out.print("Hacia donde quieres moverte?");
		mueve=entrada.next();
		
		while(!mueve.equalsIgnoreCase("x")) {
			
			if(mueve.equalsIgnoreCase("abajo")||mueve.equalsIgnoreCase("s")) {
				ejeY++;
				array[ejeY-1][ejeX-1]=8;
				if(ejeX==0||ejeY==0||ejeX==(lado-1)||ejeY==(lado-1)) {
					array[ejeY-2][ejeX-1]=1;
				}
				else {
					array[ejeY-2][ejeX-1]=0;
				}
				
			}else if(mueve.equalsIgnoreCase("arriba")||mueve.equalsIgnoreCase("w")) {
				ejeY--;
				array[ejeY-1][ejeX-1]=8;
				if(ejeX==0||ejeY==0||ejeX==(lado-1)||ejeY==(lado-1)) {
					array[ejeY][ejeX-1]=1;
				}
				else {
					array[ejeY][ejeX-1]=0;
				}
				
			}else if(mueve.equalsIgnoreCase("derecha")||mueve.equalsIgnoreCase("d")) {
				ejeX++;
				array[ejeY-1][ejeX-1]=8;
				if(ejeX==0||ejeY==0||ejeX==(lado-1)||ejeY==(lado-1)) {
					array[ejeY-1][ejeX-2]=1;
				}
				else {
					array[ejeY-1][ejeX-2]=0;
				}
				
			}else if(mueve.equalsIgnoreCase("izquierda")||mueve.equalsIgnoreCase("a")) {
				ejeX--;
				array[ejeY-1][ejeX-1]=8;
				if(ejeX==0||ejeY==0||ejeX==(lado-1)||ejeY==(lado-1)) {
					array[ejeY-1][ejeX]=1;
				}
				else {
					array[ejeY-1][ejeX]=0;
				}
				
			}
			else {
				 System.out.println("Introduce un movimiento válido: ");
		            mueve = entrada.next(); // Pedir nueva entrada después del mensaje de error
		            continue; // Saltar al siguiente ciclo sin ejecutar el resto del bloque
			}
			muestraTablero();
			System.out.println("");
			System.out.println("Introduce tu proximo movimiento (o 'x' para salir): ");
	        mueve = entrada.next();
			
		}
	}
}
