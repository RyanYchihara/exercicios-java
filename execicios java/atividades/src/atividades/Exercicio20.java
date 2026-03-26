import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio20 {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        
        System.out.print("Quantidade de alunos: ");
        n = teclado.nextInt();
        teclado.nextLine();

        int aprovados = 0, exame = 0, reprovados = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("Nota 1: ");
            double n1 = teclado.nextDouble();

            System.out.print("Nota 2: ");

            double n2 = teclado.nextDouble();
            teclado.nextLine();

            double media = (n1 + n2) / 2;
            String situacao;

            if (media >= 7) {

                situacao = "Aprovado";
                aprovados++;

            } else if (media >= 4) {

                situacao = "Exame";
                exame++;

            } else {

                situacao = "Reprovado";
                reprovados++;
            }

            System.out.printf("%s - Média: %.2f - %s\n", nome, media, situacao);
        }

        JOptionPane.showMessageDialog(null,"Aprovados: " + aprovados + "\nExame: " + exame +"\nReprovados: " + reprovados);

        teclado.close();
    }
}