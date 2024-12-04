package listaExercicio8;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
//        Escreva um programa
//        que receba duas palavras e determine se elas são anagramas (se possuem
//        as mesmas letras, mas em ordem diferente). Exemplo: "amor" e "roma".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        char[] chars1 = palavra1.toCharArray();
        char[] chars2 = palavra2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean saoAnagramas = Arrays.equals(chars1, chars2);

        if (saoAnagramas) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }
    }
}
