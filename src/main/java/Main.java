
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n;
        int anterior = 0;
        int atual = 1;
        int proximo;
        n = Integer.parseInt(JOptionPane.showInputDialog("qual o termo voce deseja: "));
        if (n == 1) {
            atual = 0;
            JOptionPane.showMessageDialog(null, "o termo é: " + atual);
        } else {
            int i = 2;
            while (i < n) {
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
                i = i + 1;
            }
        }
        //1 termo=0 2 termo=1 3termo=1 4 termo=2 5termo=3 6termo=5 7termo=8
        JOptionPane.showMessageDialog(null, "o termo é: " + atual);
    }
}
