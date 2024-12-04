package listaExercicio8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
//        Escreva um programa que peça dois números e um operador (+, -, *, /).
//        Realize a operação indicada e exiba o resultado.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Digite o operador (+, -, *, /): ");
        String operador = scan.nextLine();
        double resultado = 0;
        switch (operador) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    System.out.println("Divisão por zero não é permitida.");
                } else {
                    resultado = n1 / n2;
                }
                break;
            default:
                System.out.println("Operador inválido, tente novamente.");
                break;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("O dia resultado foi: " + df.format(resultado));
    }
}
