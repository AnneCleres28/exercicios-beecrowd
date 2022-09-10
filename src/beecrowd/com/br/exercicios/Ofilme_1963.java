package beecrowd.com.br.exercicios;

/* LINK DO EXERCICIO
 https://www.beecrowd.com.br/judge/pt/problems/view/1963 */

import java.util.Scanner;

public class Ofilme_1963 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double valorIngresso = ((b - a) / a ) * 100;

        System.out.printf("%.2f%%", valorIngresso);
    }
}
