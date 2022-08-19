package beecrowd.com.br.exercicios;

/* LINK DO EXERCICIO
 https://www.beecrowd.com.br/judge/pt/problems/view/1017 */

import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tempo da viagem: ");
        int tempo = scanner.nextInt();
        System.out.println("Informe a velocidade média KM: ");
        int velocidade = scanner.nextInt();

        double distancia = tempo * velocidade;
        double qtdLitros = distancia / 12;

        System.out.printf("%.3f ", qtdLitros);
    }
}
