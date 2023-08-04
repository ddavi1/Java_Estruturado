public class App {
    public static void main(String[] args) throws Exception {
        String personagem = "Bulma";

       /*  if (personagem == "Vegeta") {
            System.out.println("Planeta Sayajin");
        } else if (personagem == "Goku") {
             System.out.println("Planeta Sayajin");
        } else if (personagem == "Bulma") {
            System.out.println("Planeta Terra");
        } else if (personagem == "Piccolo") {
            System.out.println("Planeta Namekuseijin");
        } else if (personagem == "Kuririn") {
            System.out.println("Planeta Sayajin");
        } else {
            System.out.println("Origem desconhecida");
        } */

        switch (personagem) {
            case "Vegeta":
                    System.out.println("Planeta Sayajin");
                    break;
            case "Goku":
                    System.out.println("Planeta Sayajin");
                    break;
            case "Bulma":
                    System.out.println("Planeta Terra");
                    break;
            case "Piccolo":
                    System.out.println("Planeta Namekuseijin");
                    break;
            case "Kuririn":
                    System.out.println("Planeta Terra");
                    break;

            default:
                    System.out.println("Origem Desconhecida");
                break;
        }
    }


}
