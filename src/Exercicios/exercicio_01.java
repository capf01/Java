package Exercicios;

import java.util.Scanner;

public class exercicio_01 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora\nDigite 1 para SOMA\nDigite 2 para SUBTRAÇÃO\nDigite 3 para MULTIPLICAÇÃO\nDigite 4 para DIVISÃO");
        int op = entrada.nextInt();
        System.out.println("Digite o primeiro número");
        double x=entrada.nextDouble();
        System.out.println("Digite o segundo número");
        double y=entrada.nextDouble();
        double resultado;

        switch (op) {
            case 1 -> {
                resultado = x + y;
                System.out.printf("%.2f + %.2f = %.2f", x, y, resultado);
            }
            case 2 -> {
                resultado = x - y;
                System.out.printf("%.2f + %.2f =%.2f", x, y, resultado);
            }
            case 3 -> {
                resultado = x * y;
                System.out.printf("%.2f + %.2f = %.2f", x, y, resultado);
            }
            case 4 -> {
                resultado = x / y;
                System.out.printf("%.2f + %.2f = %.2f", x, y, resultado);
            }
            default -> System.out.println("Opção incorreta");
        }

    }
}
