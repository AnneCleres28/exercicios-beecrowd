package beecrowd.com.br.exercicios;

/* LINK DO EXERCICIO
 https://www.beecrowd.com.br/judge/pt/problems/view/1040 */

import java.util.Scanner;

public class Media3_1040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2, n3, n4, media, notaDoExame;

        System.out.println("Insira quatro notas: ");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();
        n4 = scan.nextDouble();

        media = CalcularMedia(n1, n2, n3, n4);

        System.out.printf("Média: %.1f", media);

        if(media >= 7.0) {
            System.out.println("\nAluno aprovado.");
        }
        else if(media >= 5.0 && media < 7.0) {
            System.out.println("\nAluno em exame.");
            notaDoExame = scan.nextDouble();
            System.out.println("Nota do exame: " + notaDoExame);
            media = CalcularMediaExame(media, notaDoExame);
            System.out.printf("Media final: %.1f", CalcularMediaExame(media, notaDoExame));
            if (media >= 7.0){
                System.out.println("\nAluno aprovado.");
            }else {
                System.out.println("\nAluno reprovado");
            }

        } else  {
            System.out.println("\nAluno reprovado.");
        }
    }
    public static double CalcularMedia(double n1, double n2, double n3, double n4){
        return (n1 + n2 + n3 + n4) / 4;
    }

    public static double CalcularMediaExame(double media, double n5){
        return (media + n5) / 2;
    }
}
