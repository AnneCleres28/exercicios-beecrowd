package beecrowd.com.br.exercicios;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, prod = 0;

        System.out.println("Primeiro valor: ");
        x = scanner.nextInt();

        System.out.println("Segundo valor: ");
        y = scanner.nextInt();

        prod = x * y;
        System.out.println("PROD = " + prod);
    }
}
