import javax.swing.JOptionPane;

public class Exercicio18 {

    
    public static void main(String[] args) {

        final double DOLAR = 5.20;

        final double EURO = 5.50;

        final double LIBRA = 6.30;

        int opcao;

        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Dólar\n2- Euro\n3- Libra\n4- Sair"));

            if (opcao >= 1 && opcao <= 3) {

                double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor em reais:"));

                double resultado = 0;

                switch (opcao) {

                    case 1: resultado = valor / DOLAR; break;

                    case 2: resultado = valor / EURO; break;

                    case 3: resultado = valor / LIBRA; break;
                }

                System.out.printf("Resultado: %.2f\n", resultado);

                JOptionPane.showMessageDialog(null, "Convertido: " + String.format("%.2f", resultado));
            }

        } while (opcao != 4);
    }
}