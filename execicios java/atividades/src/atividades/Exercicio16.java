import javax.swing.JOptionPane;

public class Exercicio16 {


    public static void main(String[] args) {

        double saldo = 1000.0;
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Consultar\n2- Depositar\n3- Sacar\n4- Sair"));

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo: " + saldo);
                    break;

                case 2:
                    double dep = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
                    saldo += dep;
                    break;

                case 3:
                    double saque = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
                    if (saque > saldo)
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    else
                        saldo -= saque;
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opçao invalida");
            }

        } while (opcao != 4);
    }
}