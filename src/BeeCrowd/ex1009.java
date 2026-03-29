package BeeCrowd;

import java.util.Scanner;

/**
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
 *<br></br>
 * Entrada:<br>
 * O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
 *<br></br>
 * Saída:<br>
 * Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

public class ex1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salario = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        String formatBonus = String.format("%.2f", ((totalVendas * 0.15) + salario));

        System.out.println("NOME: " + nome);
        System.out.println("TOTAL = R$ " + formatBonus);
    }
}

