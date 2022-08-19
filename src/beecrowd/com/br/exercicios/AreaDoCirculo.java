package beecrowd.com.br.exercicios;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double n = 3.14159, raio = 0, area = 0;

        System.out.println("Informe o valor do raio: ");
        raio = ler.nextFloat();

        area = n * (raio * raio);
        System.out.printf("A = %.4f" , area);

    }
}
