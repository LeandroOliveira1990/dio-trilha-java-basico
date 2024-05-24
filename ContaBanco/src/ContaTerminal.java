import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner digite = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Por favor digite o número da Agência: ");
        String agencia = digite.next();

        System.out.print("Digite o número da conta: ");
        int numero = digite.nextInt();

        //Consumir o Line Break
        digite.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = digite.nextLine();
        

       System.out.print("Digite o valor do seu primeiro Depósito: ");
       double saldo = digite.nextDouble();

        

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");





    }
}