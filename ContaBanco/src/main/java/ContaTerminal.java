import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        int numeroAgencia;
        String numeroConta, nomeCliente;
        double saldo;

        // TODO: Exibir as mensagens para nosso usuário
        // TODO: Obter os valores digitados no terminal
        System.out.print("Por favor, digite o número da Agência! ");
        numeroAgencia = sc.nextInt();

        sc.nextLine();
        System.out.print("Por favor, digite o número da Conta! ");
        numeroConta = sc.nextLine();

        System.out.print("Por favor, digite o nome do Cliente! ");
        nomeCliente = sc.nextLine();

        System.out.print("Por último, digite o Saldo! ");
        saldo = sc.nextDouble();

        // TODO: Exibir mensagem para o usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
