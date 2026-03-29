package BeeCrowd;

import java.util.Scanner;

/**
 * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 *<br></br>
 * Entrada:<br>
 * O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
 *<br></br>
 * Saída:<br>
 * Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
 */

public class ex1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id_funcionario = sc.nextInt();
        int horas_trabalhadas = sc.nextInt();
        double pag_phora = sc.nextDouble();

        String formatSalary = String.format("%.2f", (horas_trabalhadas * pag_phora));

        System.out.println("NUMBER = " + id_funcionario);
        System.out.println("SALARY = U$ " + formatSalary);
    }
}