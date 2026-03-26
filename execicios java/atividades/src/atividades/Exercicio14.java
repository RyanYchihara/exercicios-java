import javax.swing.JOptionPane;

public class Exercicio14 {


    public static void main(String[] args) {

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso (kg):"));

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura (m):"));

        double imc = peso / (altura * altura);

        String classificacao;

        if (imc < 18.5)

            classificacao = "Abaixo do peso";

        else if (imc < 25)

            classificacao = "Normal";

        else if (imc < 30)

            classificacao = "Sobrepeso";

        else

            classificacao = "Obesidade";

        JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", imc) + "\nClassificação: " + classificacao);
    }
}