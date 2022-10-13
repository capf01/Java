import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        for (int numero : numeros) {
            System.out.printf("%d\t", numero);
        }
        int [] numeros2=new int[50];
        Arrays.setAll(numeros2, i -> 100 + i);
        for (int j : numeros2) {
            System.out.printf("%d\t", j);
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o total de notas");
        int totalnotas=entrada.nextInt();
        double [] notas=new double[totalnotas];
        double soma=0, media=0;

        for(int i=0;i<totalnotas;i++){
            System.out.println("Digite a notas");
            notas [i]=entrada.nextDouble();
            soma=soma+notas[i];
            media=soma/totalnotas;
        }

        for(int i=0;i<totalnotas;i++){
            System.out.printf("%2f",notas[i]);
        }
        System.out.printf("a media da turma é: %2f",media);

    }
}
