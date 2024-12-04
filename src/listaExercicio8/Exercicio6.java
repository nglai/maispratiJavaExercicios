package listaExercicio8;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
//        Crie um jogo em que o programa escolhe um número entre 1 e 50, e o/a usuário/a
//        deve adivinhar. O programa informa apenas se o palpite está certo ou
//        errado. O jogo termina quando o número é adivinhado.

        Random random = new Random();
        int numeroAleatorio = random.nextInt(50) + 1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Adivinhe o número sorteado: ");
            int numero = scanner.nextInt();

//            if(numero == numeroAleatorio){
//                System.out.println("Você acertou!");
//                break;
//            } else if (numero > numeroAleatorio) {
//                System.out.println("O número digitado é maior que o número sorteado, tente um número menor!");
//            } else {
//                System.out.println("O número digitado é menor que o número sorteado, tente um número maior!");
//            }

            if(numero == numeroAleatorio){
                System.out.println("Você acertou!");
                break;
            } else {
                System.out.println("Errou, tente novamente.");
            }

        } while (true);
    }
}
