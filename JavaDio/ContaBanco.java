import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua Conta");
        int numConta = scanner.nextInt();
        System.out.println("Digite o número da sua Agência");
        String agencia = scanner.next();
        System.out.println("Digite o seu nome");
        String nome = scanner.next();
        System.out.println("Digite o Saldo");
        float saldo = scanner.nextFloat();

        System.out.printf("OLá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}
