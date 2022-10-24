package Programacao_orientada_a_objeto.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Aluno Aluno1=new Aluno ("Carlos José","carlos.jose@gamil.com","120.000.000-00",7.5);
    Aluno1.seApresentar();

        Professor prf=new Professor ("Almir","alrmit01@gmail.com","000000000","TI");
        prf.seApresentar();

        Pessoa p1=new Pessoa("Maria","mariazinha@gmail.com","123456789");
        p1.seApresentar();

        Pessoa p2=new Pessoa ("Joaão","joazinh@gmaiil.com","987654321");
        p2.seApresentar();

        Pessoa p3=new Pessoa("Zé","zizinhodosteclados@gmail.com","97989695");
        p3.seApresentar();

        ArrayList<Pessoa> pessoas=new ArrayList<>();
        pessoas.add(Aluno1);
        pessoas.add(prf);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

    }
}
