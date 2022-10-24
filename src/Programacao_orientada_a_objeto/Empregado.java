//Crie uma classe Empregado que possui:
//    Atributos: nome, sobrenome, salario
//    Construtores:
//        - Cria empregados com base nos parâmetros nome, sobrenome e salario;
//    Métodos:
//        - calcularSalarioAnual() => deve retornar double
//        - aumentarSalario(double aumento) => aumenta o valor do salário
//        - nomeCompleto() => deve retornar a concatenação do nome e sobrenome

package Programacao_orientada_a_objeto;

public class Empregado {

    String nome;
    String sobrenome;
    double salario;
    private double aumento;

    public Empregado(String nome,String sobrnome,double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    double calcularSalarioAnual(){
        return(salario*12);
    }

}
