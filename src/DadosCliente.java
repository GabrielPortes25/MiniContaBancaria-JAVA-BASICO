import java.util.Random;
import java.util.Scanner;

public class DadosCliente {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int saldo = new Random().nextInt(4000);
        String tipoConta = "";
        int numeroConta = 0;

        System.out.println("--------------------------------------------------------");
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = leitura.nextLine();
        System.out.println("--------------------------------------------------------");
        System.out.println("ditite o tipo de conta do " + nomeCliente);
        System.out.println("Digite 1 para conta corrente!");
        System.out.println("--------------------------------------------------------");
         numeroConta = leitura.nextInt();



        while(numeroConta != 1){
            System.out.println("--------------------------------------------------------");
            System.out.println("-----DIGITE UMA OPÇÃO VALIDA!!!-----");
            System.out.println("ditite o tipo de conta do " + nomeCliente);
            System.out.println("Digite 1 para conta corrente!");
            numeroConta = leitura.nextInt();
        }

        if (numeroConta == 1){
            tipoConta = "Corrente";
        }
        System.out.println("*************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$ " + saldo);
        System.out.println("*************************************************");

        System.out.println("Operações:");
        System.out.println("1- Consultar valor");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- sair");
        System.out.println("Digite a operação desejada:");
        int operacoes = leitura.nextInt();


        while (operacoes != 4){

            if(operacoes == 1){
                System.out.println("--------------------------------------------------");
                System.out.println("Seu saldo é: R$ " + saldo);
                System.out.println("--------------------------------------------------");
            }else if(operacoes == 2){
                System.out.println("--------------------------------------------------");
                System.out.println("Digite o valor que você deseja depositar: ");
                int novoSaldo = leitura.nextInt();
                saldo += novoSaldo;
                System.out.println("Seu novo saldo é de: R$ " + saldo);
                System.out.println("--------------------------------------------------");

            }else if (operacoes == 3) {
                System.out.println("--------------------------------------------------");
                System.out.println("Digite o valor que você deseja transferir: ");
                int novoSaldo = leitura.nextInt();
                if (novoSaldo > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= novoSaldo;
                    System.out.println("Seu novo saldo é de: R$ " + saldo);

                }
                System.out.println("--------------------------------------------------");

            }else if (operacoes != 4) {
                System.out.println("--------------------------------------------------");
                System.out.println("OPERAÇÃO INVALIDA!!!");
                System.out.println("--------------------------------------------------");
            }
            System.out.println("------------------------------------------------------");
            System.out.println("Operações:");
            System.out.println("1- Consultar valor");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- sair");
            System.out.println("Digite a operação desejada:");
            operacoes = leitura.nextInt();
        }
        System.out.println("Obrigado por usar nosso sistema! Volte sempre.");

    }
}



