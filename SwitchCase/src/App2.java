import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App2 {
    public static void main(String[] args) throws Exception {
        String personagem = JOptionPane.showInputDialog(null, "Digite um personagem de dragon ball" );
        String nomeImagem = " ";
        String origem = ""; 

        switch (personagem) {
            case "Goku":
                origem = "Planeta Sayajin";
                nomeImagem = "goku-icone";
                break;
            case "Piccolo":
                origem = "Planeta Namekuseijin";
                nomeImagem = "piccolo-icone";
                break;

            case "Vegeta":
                origem = "Planeta Sayajin";
                nomeImagem = "vegeta-icone";
                break;

            case "Bulma":
                origem = "Planeta Terra";
                nomeImagem = "bulma-icone";
                break;

            case "Kuririn":
                origem = "Planeta Terra";
                nomeImagem = "kuririn-icone";
                break;

            default:
                origem = "Desconhecida";
                nomeImagem = "default";
                break;
        }

        String caminhoImagem = String.format("Z:\\Curso-Java\\SwitchCase\\src\\imagens\\%s.png", nomeImagem);
        ImageIcon icone = new ImageIcon(caminhoImagem);

        String informacoesPersonagem = String.format("Personagem: %s\nOrigem: %s", personagem, origem);

        JOptionPane.showConfirmDialog(null, informacoesPersonagem, "Descrição", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);
    } 
}
