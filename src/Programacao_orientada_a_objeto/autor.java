//3) Crie uma classe Autor que possui:
//    Atributos: nome, email;
//    Construtores:
//        - Cria autores com base nos parâmetros nome e email;
//    Métodos:
//        - alteraNome(String novoNome) => muda o nome atual do autor
//        - alteraEmail(String novoEmail) => muda o email atual do autor
package Programacao_orientada_a_objeto;

public class autor {
    String nome;
    String email;

    public autor(String nome, String email) {
        this.nome = nome;
        this.email=email;
    }

}
