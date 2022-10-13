import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.println("digite a quantidade de termos dos vetores");
        int N = enter.nextInt();

        if (N < 50) {

            int[] V1 = new int[N];
            int[] V2=new int[N];

            for (int i=0;i<N;i++){
                System.out.printf("digite os numeros de V1[%d]",i);
                V1[i]=enter.nextInt();

            }

            for (int i=0;i<N;i++){
                System.out.printf("digite os numeros de V2[%d]",i);
                V2[i]=enter.nextInt();
            }
            for (int i=0;i<N;i++){
                if(V1[i]==V2[i]){
                        System.out.printf("digite os numeros de V2[%d]",i);

                }
            }


        } else {
            System.out.println("digite um valor menor que 50");
            N = enter.nextInt();
        }
    }
}