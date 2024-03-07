package exercicio2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que deseja buscar na sequência de Fibonacci:");
        int n = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3;

        int tamanho = 2; // inicializa com 2 pois já temos os dois primeiros termos (0 e 1)
        while (num1 + num2 <= n) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            tamanho++; // aumenta o tamanho do array para cada novo termo adicionado
        }
        
        
        
        //array para armazenar a sequencia
        
        int[] fibonacci = new int[tamanho];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < tamanho; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        //for para imprimir a sequencia
        System.out.println("Sequência de Fibonacci:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();

        // verifica se o número informado pertence à sequência
        boolean pertence = false;
        for (int i = 0; i < tamanho; i++) {
            if (fibonacci[i] == n) {
                pertence = true;
                break;
            }
        }

        if (pertence) {
            System.out.println("O numero " + n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O numero " + n + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}

