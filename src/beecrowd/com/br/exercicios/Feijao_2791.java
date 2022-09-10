package beecrowd.com.br.exercicios;

/* LINK DO EXERCICIO
 https://www.beecrowd.com.br/judge/pt/problems/view/2791 */

import java.util.Scanner;

public class Feijao_2791 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c[] = new int[4];

        for(int i = 0; i < c.length; i++){
            c[i] = scan.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 1)
                System.out.println(i+1);
        }

    }
}
