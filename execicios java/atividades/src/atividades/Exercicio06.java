import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {

        String operador = JOptionPane.showInputDialog("Escolha operação (+, -, *, /):");

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero");
                    return;
                }
                resultado = n1 / n2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida");
                return;
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}