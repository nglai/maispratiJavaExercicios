package listaExercicio8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
//        Escreva um programa que
//        leia uma frase e conte o número de palavras nela. Considere que as
//        palavras estão separadas por espaços em branco.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine().trim();

        String[] fraseArray = frase.split(" ");
        List<String> fraseArraySemEspaco = Arrays.stream(fraseArray).filter(letra -> !letra.isEmpty()).toList();
        int tamanho = fraseArraySemEspaco.size();

        System.out.println("A frase: '" + frase + "' contém " + tamanho + " palavras.");
    }
}
