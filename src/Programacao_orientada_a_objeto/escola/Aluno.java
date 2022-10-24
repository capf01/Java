package Programacao_orientada_a_objeto.escola;

public class Aluno extends Pessoa{
    private double media;

    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf);
        this.media = media;
    }
    @Override
    public void seApresentar (){
        super.seApresentar();
        System.out.println("OLá eu sou aluno com média"+this.media);
    }

    public double getMedia() {
        return media;
    }
}
