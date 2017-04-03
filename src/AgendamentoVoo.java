import java.util.Date;
import java.util.Scanner;
public class AgendamentoVoo {

    private static Scanner input = new Scanner(System.in);
    private static Date date = new Date();

    public static void main(String[] args) {

        System.out.println("MENU");
        System.out.println("a- Comprar passagem");  /*
        ESCOLHER ORIGEM DESTINO.
        ESCOLHER DATA DO VOO.
        ESCOLHER CLASSE ECONOMY,FIRSTCLASS,BUSINESS
        */
        switch (menu){
            case 1:
                System.out.println("digite origem");
                System.out.println("digite destino");
                System.out.println("digite a classe");
                System.out.println("1-FirstClass");
                System.out.println("2-Business");
                System.out.println("3-Economy");
                switch (classe){
                    case 1:
                        break;
                    case 1: break;
                    case 1: break;
                }
                break;

            case 1: break;
            case 1: break;
            case 1: break;
            case 1: break;
        }
        System.out.println("b- Verificar voos disponiveis");
        /*
        imprimir voos disponiveis da compania com hora e valor
        */
        System.out.println("d- Mos dos assentos");
        /*
        mostrar assentos da classe determinada para voo X horario X
         */
        System.out.println("f- Cadastrar passageiros");
        /*
        digitar o nome sobrenome cpf
         */
        System.out.println("e- Emititrar catao de embarque");
        /*
        nome cia
        origem destino
        classe
        prioridade
        data horario
        setor aeroporto: setor 1
        embarque portao 1

         */
        System.out.println("c- Configurar Voo");
        /*
        Escolher escolher a tribulação para esse voo especifico
         */
        System.out.println("j- Imprimir passageiros do voo (EXTRA)");
        /*
        Imprimir todos os passageiros desse voo

        */
        System.out.println("i- Cancelamento da viagem (EXTRA)");

        /*
        * supondo que seja o passageiro que queira cancelar a viagem e não toda o voo
        * cancelar viagem do passageiro
        * */
        System.out.println("g- Cadatrar tripulantes");
    }

    public static void comprarPassagem(){
        String origem;


        System.out.print("Digite Origem: ");
        origem = input.nextLine();
        System.out.print("Digite Data.\n");
        System.out.print("Dia: ");
        int dia=input.nextInt();
        int mes = input.nextInt();
        int ano = input.nextInt();
        date = new Date(ano-1900,mes,dia);


        System.out.print("Escolha a Classe do Voo:\n" +
                            "1 - Primeira Classe.\n" +
                            "2 - Classe Executiva.\n" +
                            "3 - Economica\n");
    }


}
