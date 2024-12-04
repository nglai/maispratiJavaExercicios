package listaExercicio8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
//        Crie um programa que leia uma palavra e verifique se ela é um palíndromo
//        (se pode ser lida da mesma forma de trás para frente). Ignore
//        diferenças entre maiúsculas e minúsculas.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine().trim().toUpperCase();

//        char [] palavrasArray = palavra.toCharArray();
//        ArrayList<Character> arrayInvertido = new ArrayList<>();
//
//        for (int i = 0; i < palavrasArray.length; i++) {
//            arrayInvertido.addFirst(palavrasArray[i]);
//        }
//
//        StringBuilder palavraInvertidaBuilder = new StringBuilder();
//        arrayInvertido.forEach(palavraInvertidaBuilder::append);
//        String palavraInvertida = palavraInvertidaBuilder.toString();

        StringBuilder sb = new StringBuilder(palavra);
        String palavraInvertida = sb.reverse().toString();

        if (palavra.equals(palavraInvertida)) {
            System.out.println("A palavra " + palavra + " é um palíndromo!");
        } else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }
    }
}
