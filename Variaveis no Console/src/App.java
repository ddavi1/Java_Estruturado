public class App {
    public static void main(String[] args) throws Exception {
        String filme = "Spider Man";
        int ano_Lancamento = 2009;
        int duracao = 240;
        float notaFilme = 8.7f; 
        char letraInicial = 'V';
        boolean sucess = true;

      /*   System.out.println(filme);
        System.out.println(ano_Lancamento);
        System.out.println(duracao);
        System.out.println(notaFilme);
        System.out.println(letraInicial);
        System.out.println(sucess); */

        System.out.println("o filme: " + filme);
        System.out.println("ano de lançamento: " + ano_Lancamento);
        System.out.println("tempo de duração: " + duracao + "h");
        System.out.println("nota do filme: " + notaFilme);
        System.out.println("letra inicial do filme: " + letraInicial);
        System.out.println("foi sucesso: " + sucess);

        System.out.println("O filme " + filme + "lançado em " + ano_Lancamento + "tem uma duração de " + duracao + "minutos");

        System.out.format(" O filme %s lançado em  %d tem uma duração de %d minutos\n", filme, ano_Lancamento, duracao);

        String text = " O filme " + filme + " lançado em " + ano_Lancamento + " tem uma duração de " + duracao + "minutos ";

        String text2 = String.format("O filme " + filme + " lançado em " + ano_Lancamento + " tem uma duração de " + duracao + " minutos\n");

        System.out.println("var text: " + text);
        System.out.println("var text2: " + text2);

        


        /* format = usa pra formatar a string (caso precisar concatenar textos maiores)
         * printlen = (caso precisar concatenar texto menores ex: filme + sucess)
         */
    }
}
