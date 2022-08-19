package beecrowd.com.br.exercicios;

import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a, b, soma = 0;

        System.out.println("Informe o primeiro valor: ");
        a = ler.nextInt();

        System.out.println("Informe o segundo valor: ");
        b = ler.nextInt();

        soma = a + b;
        System.out.println("X = " + soma);
    }
}
