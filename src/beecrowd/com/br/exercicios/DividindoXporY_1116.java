package beecrowd.com.br.exercicios;

/* LINK DO EXERCICIO
 https://www.beecrowd.com.br/judge/pt/problems/view/1116 */

import java.util.Scanner;

public class DividindoXporY_1116 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double X, Y;

        for (int i = 0; i < N; i++){

            X = scan.nextDouble();
            Y = scan.nextDouble();

            if(Y == 0){
                System.out.println("divisao impossivel");
            } else {
                double div = X / Y;
                System.out.printf("%.1f",div);
            }

        }
    }
}
