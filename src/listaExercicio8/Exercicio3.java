package listaExercicio8;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
//        Implemente um programa que calcule e exiba os primeiros n números
//        da sequência de Fibonacci. n deve ser fornecido pelo/a usuário/a.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são: ");

        int primeiro = 0;
        int segundo = 1;

        System.out.print(primeiro + " " + segundo + " ");

        for (int i = 2; i < n; ++i) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
