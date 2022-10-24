package Programacao_orientada_a_objeto.zoo;

public interface animal {
    void dormir();

    void fazerSom();

    void comer(String comida);

    class Gato implements animal {
        @Override
        public void dormir() {
            System.out.println("zzzzzz Miau");
        }

        @Override
        public void fazerSom() {
            System.out.println("Miau");
        }

        @Override
        public void comer(String comida) {
            if (comida.equals("Peixe")) {
                System.out.println("Hummm gosto de peixe");
            } else {
                System.out.println("Só como peixe");
            }
        }

        public void ronronar() {
            System.out.println("grmmmmm");
        }
    }

    class Galinha implements animal {
        @Override
        public void dormir() {
            System.out.println("Có có zzzzzz");
        }

        @Override
        public void fazerSom() {
            System.out.println("Có có có có");
        }

        @Override
        public void comer(String comida) {
            System.out.println("Hummm có có " + comida);
        }

        public void botarOvo() {
            System.out.println("ovo colocado");
        }

        public static void main(String[] args) {
            Galinha galinha = new Galinha();
            Gato gato = new Gato();
            Gato gato2 = new Gato();

            galinha.fazerSom();
            galinha.dormir();
            galinha.comer("Milho");
            galinha.botarOvo();

            gato.fazerSom();
            gato.dormir();
            gato.comer("Peixe");
            gato.ronronar();

            gato2.fazerSom();

            // Interface não consigo criar um objeto
            // Animal novoAnimal = new Animal(); // não consigo criar pois é Interface
            animal animalGalinha = galinha;
            animal animalGatinho = gato;
            System.out.println(" ===== POLIMORFISMO ===== ");
            animalGatinho.fazerSom();
            animalGalinha.fazerSom();
        }
    }
}
