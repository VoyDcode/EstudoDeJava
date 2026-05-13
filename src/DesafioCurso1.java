import java.util.Scanner;

public class DesafioCurso1 {
    public static void main(String[] args) {
        String nome = "Victor Rodrigues De Lima Lourneço";
        String tipoConta = "Conta Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("Dados inicias do cliente:" );
        System.out.println(" ");
        System.out.println("Nome:    " + nome );
        System.out.println("Tipo de conta:              " + tipoConta);
        System.out.println("Saldo:                              " + saldo);

        System.out.println("******************************************");


        String menu = """
                Digite sua opcao:
                1 - consultar saldo
                2 - Transerir
                3 - depositar
                4 - sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = entrada.nextInt();
            System.out.println(" ");

            switch (opcao){

                case 1:
                    System.out.println("Valor em conta: " + saldo);
                    System.out.println(" ");
                    break;


                case 2:
                    System.out.println("Digite o valor a ser transferido: ");
                    double valor = entrada.nextDouble();
                    System.out.println("------------------------------------ ");

                    if (valor > saldo){
                        System.out.println("Saldo insuficiente");
                        System.out.println(" ");

                    }else if(valor <= 0){
                        System.out.println("Valor invalido");
                        System.out.println(" ");

                    }else{
                        saldo -= valor;
                        System.out.println("Valor transferido com sucesso");
                        System.out.println(" ");
                        System.out.println("Saldo atual: " + saldo);
                        System.out.println("------------------------------------ ");
                        System.out.println(" ");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = entrada.nextDouble();
                    System.out.println(" ");
                    if (valorDeposito <= 0){
                        System.out.println("Valor invalido");
                    }else{
                        saldo += valorDeposito;
                        System.out.println("Saldo atual: " + saldo);
                        System.out.println("------------------------------------ ");
                        System.out.println(" ");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando Operação");
                    break;

            }

        }


    }
}
