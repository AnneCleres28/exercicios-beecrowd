package beecrowd.com.br.exercicios;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, soma = 0;

        System.out.println("Número A: ");
        A = scanner.nextInt();

        System.out.println("Número B: ");
        B = scanner.nextInt();

        soma = A + B;
        System.out.println("SOMA = " + soma);
    }
}
