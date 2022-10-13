import java.util.Scanner;
public class Estoque_medio_peca_ex01 {
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        System.out.println("Digite a quantidade minima da peça");
        double QUANTIDADE_MINIMA = enter.nextDouble();
        System.out.println("Digite a quantidade maxima da peça");
        double QUANTIDADE_MAXIMA = enter.nextDouble();
        double Estoque_medio = (QUANTIDADE_MINIMA + QUANTIDADE_MAXIMA) / 2;
        System.out.printf("O estoque medio e %.2f",Estoque_medio);
    }
}
