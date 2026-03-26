import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = 1, soma = 0, cont = 0;

        while (num != 0) {

            System.out.print("Digite um número (0 para sair): ");
            num = teclado.nextInt();

            if (num != 0) {
                soma += num;
                cont++;
            }
        }

        if (cont > 0) {
            double media = (double) soma / cont;

            System.out.println("Soma: " + soma);

            System.out.println("Quantidade: " + cont);

            System.out.println("Média: " + media);

        } else {

            System.out.println("Nenhum número válido digitado.");
        }

        teclado.close();
    }
}