import javax.swing.JOptionPane;

public class Janela {
    public static void main(String[] args) throws Exception {
        String filme = JOptionPane.showInputDialog(null, "Qual seu filme preferido?", "title", JOptionPane.QUESTION_MESSAGE);
        String texto = JOptionPane.showInputDialog(null, "digite um numero: ");
        int numero = Integer.parseInt(texto);
        numero = numero * 10;

        System.out.println(filme);
        System.out.println(numero);
    }
}
