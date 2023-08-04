import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        String facesString = JOptionPane.showInputDialog(null, "Quantas faces tem o dado? ");
        int facesDado = Integer.parseInt(facesString);
        
       int resultado = 1 + gerador.nextInt(facesDado);

        
        JOptionPane.showMessageDialog(null, "voce tirou " + resultado + " no dado");
        

    }

}
