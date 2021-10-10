import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		int matriz[][] = new int[5][10];
		for (int k = 0; k < 5; k++) {

			/* Declarar variables iniciales */
			Scanner entrada = new Scanner(System.in);
			Scanner entrada1 = new Scanner(System.in);
			System.out.print("ingrese un numero del 1 al 50: ");
			int numero_ingresado = entrada.nextInt();
			int contador = 0;
			int columna = 0;
			int fila = 0;

			/*Buscar la posicion del numero en la matriz*/
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 10; j++) {
					contador++;
					if (contador == numero_ingresado) {
						columna = j;
						fila = i;
						break;
					}
				}
				if (contador == numero_ingresado) {
					break;
				}
			}

			/*verificar que la ubicacion ingresada este disponible*/
			if (numero_ingresado > 0 && numero_ingresado <= 50 && matriz[fila][columna] == 0) {

				/* Remplazar con un 1 las posiciones que estan ocupadas*/
				for (int i = 0; i < 10; i++) {
					matriz[fila][i] = 1; 
				}
				for (int i = 0; i < 5; i++) {
					matriz[i][columna] = 1;
				}

				/* Mostrar la matriz */
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 10; j++) {
						System.out.print("[ " + matriz[i][j] + " ] ");
					}
					System.out.println();
				}

				/* Darle al usuario la opcion de terminar el programa cada vez que se muestre la matriz*/
				if (k != 4) {
					System.out.print("Desea ingresar otro numero?(si / no): ");
					String respuesta = entrada1.nextLine();
					if (!respuesta.equals("si")) {
						System.out.println("--------------------------------------\nAplicaion finalizada\n--------------------------------------");
						break;
					}
				}
				else {
					System.out.println("--------------------------------------\nYa no hay mas espacios disponibles\n--------------------------------------");
				}
			}
			else {
				System.out.println("--------------------------------------\nel valor ingresado es incorrecto por favor intente nuevamente\n--------------------------------------");
				k--;
			}
		}
	}
}
