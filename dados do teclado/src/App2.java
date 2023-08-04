import java.util.Scanner;

public class App2 {

    public static void main(String[] args) throws Exception {
        String elo;
        int tier;
        String valor;
        String Champ;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual seu elo: ");
        elo = leitor.nextLine();

        System.out.println("Qual seu Tier? ");
        valor = leitor.nextLine();
        tier = Integer.parseInt(valor);

        System.out.println("Qual seu champ favorito? ");
        Champ = leitor.nextLine();

        System.out.format("seu elo é: %s e seu tier é: %d e seu champ favorito é: %s ", elo, tier, Champ);


        leitor.close();

    }
}