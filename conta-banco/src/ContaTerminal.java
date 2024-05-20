import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //To do: importar a classe Scanner
        
        //Exibir as mensagens para o usuário;

        //Obter pela Scanner oa valores digitados no terminal;

        //Exibir mensagem conta criada;

        Scanner scan = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scan.nextLine();
        
        System.out.println("Digite a agência: ");
        agencia = scan.nextLine();

        System.out.println("Digite o número da conta bancária: ");
        numeroConta = scan.nextInt();

        System.out.println("Digite o saldo bancário: ");
        saldo = scan.nextDouble();

       System.out.println("Olá, " + nomeCliente +
        "! Obrigada por criar uma conta em nosso banco. A sua agência é: " + agencia +
        ". E sua contá é: " + numeroConta + ". E seu saldo é de: " + saldo);
    }
}
