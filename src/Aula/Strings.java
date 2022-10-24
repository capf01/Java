package Aula;

import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        String nome= "Pedro";
        String sobrenome= "Pereira";
        if (nome== "Pedro"){
            System.out.println("São iguais");

        }
        if (sobrenome.equals("Pereira")){
            System.out.println("São iguais");
        }else
        {
            System.out.println("São diferentes");
        }
        String java="java";
        String ja= java.substring(0,2);
        String va= java.substring(2);

        System.out.println(java);
        System.out.println(ja);
        System.out.println(va);
    }
}
