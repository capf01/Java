package Programacao_orientada_a_objeto.escola;

public class Professor extends Pessoa{
    private String formacao;

    public Professor(String nome, String email, String cpf, String formacao) {
        super(nome, email, cpf);
        this.formacao = formacao;
    }

    @Override
    public void seApresentar() {
        super.seApresentar();
        System.out.println("OLá eu sou aluno com formação"+this.formacao);
    }
}
