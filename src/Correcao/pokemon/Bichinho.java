package Correcao.pokemon;

    import java.util.ArrayList;

    /**
     * Crie uma classe Bichinho:
     * Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
     * Construtores: Cria bichinhos com base nos atributos nome, idade, peso.
     * Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
     * Métodos:
     * - comer(Comida comida) => a comida deve alterar o peso do bichinho, o
     * bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
     * - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada
     * hora dormida o bichinho perde 10% de seu peso atual;
     * - acordar() => altera o boolean estaDormindo p/ false
     */
    public class Bichinho {
        private String nome;
        private int idade;
        private double peso;
        private ArrayList<Comida> bucho;
        private boolean estaDormindo;

        public Bichinho(String nome, int idade, double peso) {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.bucho = new ArrayList<>(); // buchin vazio
            this.estaDormindo = false; // acordado
        }
}
