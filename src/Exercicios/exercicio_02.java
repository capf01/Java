package Exercicios;

import java.util.Scanner;

public class exercicio_02 {
public static void main (String [] args){
    for (int i=1;i<=2000;i++) {
        System.out.printf("%d\n", i);
    }
}

    public static class Dolar_Real_ex02 {
        public static void main(String[] args) {
            Scanner enter = new Scanner(System.in);
            System.out.print("Digite a cotação em dolar ex:(5,34)");
            double cotacao_dolar = enter.nextDouble();
            System.out.print("Digite o valor em dolares");
            double dolar = enter.nextDouble();
            double real = cotacao_dolar * dolar;

            System.out.printf("Resultado:%.2f", real);
        }
    }
}
