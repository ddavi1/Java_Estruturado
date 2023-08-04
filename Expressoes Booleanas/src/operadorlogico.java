import java.util.Scanner;

public class operadorlogico {
    public static void main(String[] args) throws Exception {
        // Credenciais para entrar no projeto
        Scanner scanner = new Scanner(System.in);
        String usuario ="davigabriel";
        String senha = "12345";

        // o usuario digitou na tela de login
        String usuarioDigitado;
        String senhaDigitada;

        System.out.println("TYPE THE USER: ");
        usuarioDigitado = scanner.nextLine();
        System.out.println("TYPE FOR PASSWORD: ");
        senhaDigitada = scanner.nextLine();

        boolean loginCorreto = usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha);

        System.out.println(loginCorreto);

       

         scanner.close();
    }
}
