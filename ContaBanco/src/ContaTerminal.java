import java.lang.reflect.AnnotatedWildcardType;

public class ContaTerminal {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    public static void main(String[] args) {
        
        int numero = 1021;
        String agencia = 067-8;
        String nomeCliente = MARIO ANDRADE;
        double Saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Agora, por favor digite sua Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.next();

        
    }
}
