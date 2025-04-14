import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

      //Exibir a mensagem conta criada
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Agora, por favor insira sua Agência:");
        String agencia = scanner.next();

        // to adicionando essa linha para ajudar na confusão do sistema
        scanner.nextLine();

        System.out.println("Neste momento, por favor, introduza seu nome:");
        String nomeCliente = scanner.nextLine();
     
        System.out.println("Agora, para finalizar, por favor, digite o saldo disponível em sua conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    
    }
}
