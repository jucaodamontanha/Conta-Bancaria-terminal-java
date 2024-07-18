package scr;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       //TODO: Conhecer e importar a classe Scanner
        Scanner ler = new Scanner(System.in);
        int numero;
        String agencia;
        String nomedocliente;
        double saldo;
        //Exibir as mensagens para o usuario
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Digite o numero da conta:");
        numero = ler.nextInt();
        System.out.println("Digite o numero da Agencia:");
        agencia = ler.next();
        System.out.println("Digite o nome do cliente:");
        nomedocliente = ler.next();
        System.out.println("Digite o saldo inicial da conta:");
        saldo = ler.nextDouble();
        //Exibir a mensagem da conta criada

        System.out.println("Ola," + nomedocliente + ", obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + " conta: " + numero +  " e seu saldo  de " +
                saldo + " ja esta disponivel para saque");


    }
}
