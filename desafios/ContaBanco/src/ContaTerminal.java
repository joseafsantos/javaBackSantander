import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe a sua agência.");
        String agencia = scanner.nextLine();
        System.out.println("Informe o número da sua conta.");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual seu nome?");
        String nomeCliente = scanner.nextLine();
        System.out.println("Quanto deseja depositar?");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo);
        scanner.close();
    }
}