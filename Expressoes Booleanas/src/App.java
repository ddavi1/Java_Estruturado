import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int idade = 18;
        boolean resultado = idade>10;

        JOptionPane.showMessageDialog(null,resultado); // > < >= <=

        resultado = idade == 20;

        JOptionPane.showMessageDialog(null,resultado); // ==

        String nome = "João";
        boolean resultado2 = nome != "João";
        JOptionPane.showMessageDialog(null,resultado2); // != diferente e não igual. Por isso ele retorna false aqui


    }
}
