package Programacao_orientada_a_objeto;

public class Circulo {
    double raio;
    double pi=3.14;
    String cor;

    Circulo(double raio, double pi, String cor) {

        this.raio = 1;
        this.pi = 3.14;
        this.cor = cor;

    }
     double calcularArea() {
    return (pi*raio*raio);
    }
    double comprimentoDaCircunferencia(){
        return(2*pi*raio);
    }

    public void setraio(double Novoraio) {
        this.raio = Novoraio;
    }
}


