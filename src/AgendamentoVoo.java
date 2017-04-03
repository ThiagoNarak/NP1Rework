import java.util.Date;
import java.util.Scanner;
public class AgendamentoVoo {

    private static Scanner input = new Scanner(System.in);
    private static Date date = new Date();

    public static void main(String[] args) {
        Compania[] aeronave = new Voo [3];


        System.out.println("MENU");
        //comprar passagem.
        comprarPassagem();
        //verificar voos disponiveis - mostrar voos para data e origem-destino especifica
        verificarVoosDisponiveis();
        //mostrar assentos do voo disponivel no horario X
        imprimirAssentos();
        //digitar o nome sobrenome cpf
        cadastrarPassageiro();
        //printar cartao de embarque com informacoes do voo e passageiro
        emitirCartaoDeEmbarque();
        //cadastrar tripulação no Voo
        configurarVoo();

        //imprimir todos os passageiros do voo.
        passageirosVoo();

        //cancelar passagem do passageiro x cadeira x VOO x
        cancelarPassagem();
    }

    public static void comprarPassagem(){
        String origem;
        String destino;
        System.out.print("Digite Origem: ");
        origem = input.nextLine();
        System.out.println("Digite Destino");
        destino = input.nextLine();
        System.out.print("Digite Data.\n");
        System.out.println("Dia");
        int dia=input.nextInt();
        System.out.println("Mes");
        int mes = input.nextInt();
        System.out.println("Ano");
        int ano = input.nextInt();
        date = new Date(ano-1900,mes,dia);
        System.out.print("Escolha a Classe do Voo:\n" +
                "1 - Primeira Classe.\n" +
                "2 - Classe Executiva.\n" +
                "3 - Economica\n");
        int classe= input.nextInt();
        switch (classe){
            case 1:
                System.out.println("Primeira classe selecionada.");

                break;
            case 2:
                break;
            case 3:
                break;
        }




    }
    public static void verificarVoosDisponiveis(){
        /*
        chamar classe compania e metodos imprimir voos com hora e valor
        escolha o horario do voo.
         */
    }
    public static void imprimirAssentos(){
        /*
            imprimir mapa de assentos para classe do cliente escolheu no ato da compra.
         */
    }
    public static void cadastrarPassageiro(){
        String nome,sobrenome,cpf;
        System.out.println("digite nome.");
        nome=input.nextLine();
        System.out.println("digite sobrenome.");
        sobrenome=input.nextLine();
        System.out.println("digite cpf.");
        cpf=input.nextLine();
    }
    public static void emitirCartaoDeEmbarque(){
        System.out.println("nome: ");
        System.out.println("origem-destino");
        System.out.println("classe");
        System.out.println("prioridade");
        System.out.println("data");
        System.out.println("hora");
        System.out.println("terminal");
        System.out.println("portao do terminal");
//        nome cia
//        origem destino
//        classe
//                prioridade
//        data horario
//        setor aeroporto: setor 1
//        embarque portao 1
    }
    public static void configurarVoo(){
        //set piloto set copiloto e 4 tripulantes.
    }
    public static void passageirosVoo(){
        //imprimir passageiros do voo
    }
    public static void cancelarPassagem(){
        //cancelar passagem,
        //cancelar cadeira, cancelar pessoa
    }
}
