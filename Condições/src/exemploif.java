public class exemploif {
    public static void main(String[] args) throws Exception {

        String corFruta = "amarelo";

        if (corFruta == "vermelho") {
            System.out.println("Está madura");
        } else if (corFruta == "amarelo") {
            System.out.println("Está quase madura");
        } else if (corFruta == "verde") {
            System.out.println("Não está boa para comer");
        } else {
            System.out.println("fruta pobre!");
        }
    }
}
