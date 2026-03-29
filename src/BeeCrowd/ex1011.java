package BeeCrowd;

import java.util.Scanner;

/**
 * Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
 *<br></br>
 * Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois inteiros é outro inteiro.
 *<br></br>
 * Entrada:<br>
 * O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.
 *<br></br>
 * Saída:<br>
 * A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.
 */

public class ex1011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        double r = sc.nextDouble();
        String format = String.format("%.3f", (4/3.0) * pi * Math.pow(r, 3));
        // Como o próprio exercício menciona sobre o (4/3.0), o java iria entender que 4/3 era divisão por inteiros
        // e não como uma divisão de números racionais
        // ========================
        // Math.pow(base, exponencial), utilizamos justamente esse math.pow para que o java entendesse que era
        // uma variável elevado a 3

        System.out.println("VOLUME = " + format);
    }
}
