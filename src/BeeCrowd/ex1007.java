package BeeCrowd;

import java.util.Scanner;
/**
 *
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 *<br></br>
 * Entrada:<br>
 * O arquivo de entrada contém 4 valores inteiros.
 *<br></br>
 * Saída:<br>
 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 * <br></br>
 * TESTE DE MESA
 * <blockquote><pre>
 int A = 5;
 int B = 6;
 int C = 7;
 int D = 8;

 System.out.println("DIFERENCA = " + (A * B - C * D));
 * </pre></blockquote>
 */
public class ex1007 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int A = key.nextInt();
        int B = key.nextInt();
        int C = key.nextInt();
        int D = key.nextInt();

        System.out.println("DIFERENCA = " + (A * B - C * D));
    }
}

