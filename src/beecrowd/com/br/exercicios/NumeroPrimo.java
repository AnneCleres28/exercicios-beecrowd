package beecrowd.com.br.exercicios;

/* LINK DO EXERCICIO
 https://www.beecrowd.com.br/judge/pt/problems/view/1165 */

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = 0, cont = 0;

        for (int i = 0; i < N; i++) {
            cont = 0;
            X = scan.nextInt();
            for (int j = 2; j < X; j++){
                if (X % j == 0) cont++;
            }
            if (cont == 0) System.out.println(X + " eh primo");
            else System.out.println(X + " nao eh primo");
        }
    }
}
