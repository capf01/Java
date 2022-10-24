package Aula;

import java.util.ArrayList;
import java.util.Scanner;
public class Lista {
    public static void main(String[] args) {

        ArrayList <Integer> numero= new ArrayList<>();
        

        Scanner enter = new Scanner(System.in);

        System.out.println("Digite um número");

        int Numero = enter.nextInt();
        numero.add(Numero);
        System.out.println("o número digitado");

        System.out.println(numero.get(0));
        numero.set(0,500);

        System.out.println("o número foi substituido por:");
        System.out.println(numero.get(0));

        numero.remove(0);
        numero.add(0, 100);
        System.out.println("o número foi substituido por:");
        System.out.println(numero.get(0));

        for (int i=0; i<numero.size(); i++){
            System.out.println("Digite um número");
            System.out.println(numero);
            numero.add(Numero);
        }


    }
}
