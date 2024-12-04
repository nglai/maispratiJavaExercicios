package listaExercicio8;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
//        Crie um programa que leia um número inteiro e exiba o número invertido.
//        Exemplo: se o usuário digitar 1234, o programa deve exibir 4321.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String numeroString = Integer.toString(numero);
        StringBuilder sb = new StringBuilder(numeroString);
        String numeroInvertidoString = sb.reverse().toString();
        int numeroInvertido = Integer.parseInt(numeroInvertidoString);

        System.out.println("O número invertido é: " + numeroInvertido);
    }
}
