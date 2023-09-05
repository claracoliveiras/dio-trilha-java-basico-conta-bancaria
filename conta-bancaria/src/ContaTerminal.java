import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Boa tarde! Por favor, inserir seu nome e sobrenome na linha a seguir:");
        String nome = scanner.nextLine();

        System.out.println("Em seguida, insira a sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("Agora, insira o número de sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Por último, insira seu saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        
    }
}
