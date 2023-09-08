import java.util.Scanner;

public class ContaBancariaSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Pedro";
        String tipoDeConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        System.out.println("**************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoDeConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("**************************");

        String menu = """
             
                ***Digete sua opção***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;


        while (opcao != 4) {
            System.out.println(menu);

            System.out.print("Digite aqui: ");
            int teclado = leitor.nextInt();

            if (teclado == 1) {
                System.out.println("Saldo da Conta R$ " + saldo);
            } else if (teclado == 2) {

                System.out.println("Digite o valor para transferencia: ");
                double transferir = leitor.nextDouble();
                    if (transferir > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Transferencia de R$ " + transferir);
                        System.out.println("Novo saldo da conta R$ " + (saldo - transferir));
                    }

            } else if ( teclado == 3) {

                System.out.println("Digite o valor para receber: ");
                double receber = leitor.nextDouble();
                System.out.println("Você recebeu R$ " + receber);
                System.out.println("Novo saldo da conta R$ " + (saldo + receber));

            } else if (teclado == 4) {
                System.out.println("Saindo do programa....pronto");
                break;
            } else {
                System.out.println("Opção invalida");
            }
        }
    }
}
