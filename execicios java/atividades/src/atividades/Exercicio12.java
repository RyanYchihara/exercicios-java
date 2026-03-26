import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Digite a quantidade de termos: ");
        n = teclado.nextInt();

        if (n <= 0) {

            System.out.println("Valor inválido");

        } else {

            int a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                
                System.out.print(a + " ");

                int proximo = a + b;
                a = b;
                b = proximo;
            }
        }

        teclado.close();
    }
}