package Exercicios;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String [] args){
        Scanner enter = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = enter.nextInt();
        if(idade>=18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
}
