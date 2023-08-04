import java.util.Scanner;

public class not {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String usuario ="davigabriel";
        String senha = "12345";

        // o usuario digitou na tela de login
        String usuarioDigitado = "davigabriel";
        String senhaDigitada = "12345";


        boolean loginCorreto = usuarioDigitado == usuario && senhaDigitada == senha;
        System.out.println(loginCorreto);

        boolean resultado = !(usuarioDigitado == usuario);
        System.out.println(resultado);


         scanner.close();

    }
}
