import javax.swing.JOptionPane;

public class input {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?"); 

        JOptionPane.showMessageDialog(null,"Bom dia "+nome);
    }
}
