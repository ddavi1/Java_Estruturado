
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 5, num2 = 2;
       
        int resultado = num1 % num2;

        JOptionPane.showMessageDialog(null, resultado, "Matematica",  JOptionPane.INFORMATION_MESSAGE);
    
    }
}
