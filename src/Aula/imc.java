import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome?\n");
        String nome = entrada.nextLine();
        System.out.println("Seu nome é:\n" + nome);

        System.out.print("Qual a sua idade?\n");
        int idade = entrada.nextInt();

        System.out.print("Qual o seu peso?\n");
        double peso = entrada.nextDouble();

        System.out.print("Qual a sua altura em metros?\n");
        double altura = entrada.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("Olá %s de %d anos seu IMC: %.2f", nome, idade, imc);

        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso!");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II");
        } else {
            System.out.println("Obesidade III");
        }
        //Switch-case

        System.out.println("Selecione uma dieta de 1 a 3");
        System.out.println("Selecione 1- Água");
        System.out.println("Selecione 2- Fruta");
        System.out.println("Selecione 3- Batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1 -> System.out.println("Dieta da Água");
            case 2 -> System.out.println("Dieta da Fruta");
            case 3 -> System.out.println("Dieta da Batata");
            default -> System.out.println("Dieta Invalida");
        }

        System.out.println("digite a quantida de alimentos");

        int totalAlimentos=entrada.nextInt();

        for (int i=0; i<totalAlimentos; i++){
            System.out.println("digite seu alimento preferido");

            String alimentos=entrada.nextLine();
            System.out.printf("você gosta de %s",alimentos);

        }
    }

}
