package BeeCrowd;

import java.util.Scanner;

/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 *<br></br>
 * Entrada: <br>
 * O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
 *<br></br>
 * Saída:<br>
 * Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

public class ex1006 {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);

        double pa = 2;
        double pb = 3;
        double pc= 5;

        double n1 = keyword.nextDouble();
        double n2 = keyword.nextDouble();
        double n3 = keyword.nextDouble();

        double media = (n1 * pa + n2 * pb + n3 * pc) / (pa + pb + pc);
        String format = String.format("%.1f", media);

        System.out.println("MEDIA = " + format);
    }
}
