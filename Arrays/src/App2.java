import javax.swing.JOptionPane;

public class App2 {
    public static void main(String[] args) throws Exception {

        String[] opcoes = new String[] {
            "Anime Hunter",
            "Serie doctor who",
            "Filme sem nexto",
            "Sair"
        };

        int opcaoEscolhida = 0; // Inicializa com um valor diferente de 3

        while (opcaoEscolhida != 3) {
            opcaoEscolhida = JOptionPane.showOptionDialog(
                null,
                "O que você deseja assistir?",
                "DevFlix",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, 
                opcoes,
                0
            );
        }
        System.out.println("Opção escolhida: " + opcaoEscolhida);
    }
}