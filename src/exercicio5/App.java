package exercicio5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// inserir a string
        System.out.println("Digite uma string:");
        String input = sc.nextLine();
        
        // inicializar uma string vazia para armazenar a string invertida
        String auxiliar = "";
        
        // Percorrer a string de entrada do fim ao início
        for (int i = input.length() - 1; i >= 0; i--) {
            // adicionar cada caractere na ordem inversa a string invertida
            auxiliar += input.charAt(i);
        }
        
        // imprimir a string invertida
        System.out.println("String invertida: " + auxiliar);
		
		sc.close();

	}

}