import java.util.Scanner;

public class morse {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		char abecedario[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
		String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
		System.out.print("------------------------------------------------------\n1.pasar de morse a texto o 2.pasar de texto a morse (1 o 2): ");
		int respuesta = entrada.nextInt();

		if (respuesta == 1) {
			System.out.print("------------------------------------------------------\nIngrese en morse lo que quiere pasar a texto: ");
			String texto = entrada1.nextLine();
			int espacios = 1;
			for (int i = 0; i < texto.length(); i++) {
				if (texto.charAt(i) == ' ') {
					espacios++;
				}
			}
			String texto_arreglo[] = new String[espacios];
			int contador = 0;
			for (int i = 0; i < texto_arreglo.length; i++) {
				while (true) {
					if (texto_arreglo[i] == null) {
						texto_arreglo[i] = "" + texto.charAt(contador);
					}
					else {
						texto_arreglo[i] = texto_arreglo[i] + texto.charAt(contador);
					}
					
					if (texto.charAt(contador) == ' ') {
						texto_arreglo[i+1] = "";
						contador++;
						break;
					}
					
					if (contador >= texto.length()-1){
						break;
					}
					contador++;
				}
			}
			System.out.println("------------------------------------------------------");
			for (int i = 0; i < texto_arreglo.length; i++) {
				for (int j = 0; j < morse.length; j++) {
					if (texto_arreglo[i].equals(morse[j] + " ") || texto_arreglo[i].equals(morse[j])) {
						System.out.print(abecedario[j]);
						break;
					}
				}
			}
			System.out.println("");
			System.out.println("------------------------------------------------------");
		}
		
		else if (respuesta == 2) {
			System.out.print("------------------------------------------------------\nIngrese en texto lo que quiere pasar a morse: ");
			String texto = entrada1.nextLine();
			int texto_a_array[] = new int[texto.length()]; 
			for (int i = 0; i < texto.length(); i++) {
				for (int j = 0; j < abecedario.length; j++) {
					if (abecedario[j] == texto.charAt(i)) {
						texto_a_array[i] = j;
						break;
					}
				}
			}
			System.out.println("------------------------------------------------------");
			for (int i: texto_a_array) {
				System.out.print(morse[i] + " ");
			}
			System.out.println("");
			System.out.println("------------------------------------------------------");
		}

		else {
			System.out.println("La opcion seleccionada no se encuentra en ninguna de las opciones aceptadas");
		}
		
	}
}