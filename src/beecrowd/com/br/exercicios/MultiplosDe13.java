package beecrowd.com.br.exercicios;

/* LINK DO EXERCICIO
 https://www.beecrowd.com.br/judge/pt/problems/view/1132 */

import java.util.Scanner;

public class MultiplosDe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int soma = 0;
        if (X > Y) {
            for (int i = Y; i <= X; i++) {
                if (i % 13 != 0) soma += i;
            }
        } else {
            for (int i = X; i <= Y; i++) {
                if (i % 13 != 0) soma += i;
            }
        }
        System.out.println(soma);
    }
}
