import java.util.Scanner;
public class exercicio_05 {
    public static void main(String [] args){
        Scanner enter = new Scanner(System.in);
        System.out.println("digite a quantidade de termos dos vetores");
        int N = enter.nextInt();
        int[] V1 = new int[N];
        double soma=0,media=0;
        for (int i=0;i<N;i++){
            System.out.printf("digite os numeros de V1[%d]",i);
            V1[i]=enter.nextInt();
            soma+=V1[i];
            media=soma/N;

        }
        System.out.printf(" Soma = %.2f e media = %.2f ",media, soma);
    }
}

