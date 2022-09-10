package beecrowd.com.br.exercicios;

/* LINK DO EXERCICIO
 https://www.beecrowd.com.br/judge/pt/problems/view/1003 */

import java.util.Scanner;

public class SomaSimples1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        System.out.println("Número A: ");
        A = scanner.nextInt();

        System.out.println("Número B: ");
        B = scanner.nextInt();

        System.out.println("SOMA = " + soma(A, B));
    }
    public static int soma(int A, int B){
        return A + B;
    }
}
