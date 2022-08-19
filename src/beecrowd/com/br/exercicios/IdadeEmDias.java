package beecrowd.com.br.exercicios;

/* LINK DO EXERCICIO
 https://www.beecrowd.com.br/judge/pt/problems/view/1020 */

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a idade em dias: ");
        int idadeDias = scanner.nextInt();

        int anos = idadeDias / 365;
        idadeDias -= anos * 365;
        int meses = idadeDias / 30;
        idadeDias -=  meses * 30;
        int dias = idadeDias;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
