import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String jogo;
        // scanner = classe
        Scanner leitor = new Scanner(System.in);
        // configurando os separadores (; \n \r)
        //leitor.useDelimiter("[;\r\n]+");
       

        System.out.println("qual seu jogo do momento : ");
        jogo = leitor.nextLine();
        System.out.println("o jogo é: " + jogo);

        leitor.close(); // opcinal, mas é uma boa pratica
    }
}
