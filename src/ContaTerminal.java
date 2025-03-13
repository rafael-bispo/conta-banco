package src;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("**************Bem-vindo ao cadastro de contas no Nosso Banco**************");
        System.out.println("***********Por favor, forneça os dados que serão pedidos abaixo***********");
        System.out.println();

        Scanner input = new Scanner(System.in);

        String nome, agencia;
        int numeroConta;
        double saldo;

        System.out.print("Digite o nome completo: ");
        nome = input.nextLine();
        System.out.print("Digite o número da agência: ");
        agencia = input.nextLine();
        System.out.print("Digite o número da conta: ");
        numeroConta = input.nextInt();
        System.out.print("Digite o saldo atual: ");
        saldo = input.nextDouble();

        System.out.println();
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
