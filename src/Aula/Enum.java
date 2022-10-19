public class Enum {
    public static void main(String[] args) {
        enum DiadaSemana{
            Segunda,
            Terca,
            Quarta,
            Quinta,
            Sexta,
            Sabado,
            Domingo,

        }
        DiadaSemana hoje= DiadaSemana.Domingo;
        System.out.println(hoje);

        DiadaSemana hoje1= DiadaSemana.Segunda;
        System.out.println(hoje1);

        DiadaSemana hoje2= DiadaSemana.Terca;
        System.out.println(hoje2);

        DiadaSemana hoje3= DiadaSemana.Quarta;
        System.out.println(hoje3);

        DiadaSemana hoje4= DiadaSemana.Quinta;
        System.out.println(hoje4);

        DiadaSemana hoje5= DiadaSemana.Sexta;
        System.out.println(hoje5);

        DiadaSemana hoje6= DiadaSemana.Sabado;
        System.out.println(hoje6);


        enum NivelDev {Junior,Pleno, Senior}
        NivelDev nivel = NivelDev.Senior;
        NivelDev nivel2= NivelDev.valueOf("Junior");

        switch (nivel) {
            case Junior:
                System.out.println("Seu nível é Junior");
                break;
            case Pleno:
                System.out.println("Seu nível é Pleno");
                break;
            case Senior:
                System.out.println("Seu nível é Senior");
                break;
        }


    }
}
