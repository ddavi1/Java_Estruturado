import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) throws Exception {
            int idade;
            Scanner scanner = new Scanner(System.in);

                System.out.println("qual sua idade? ");
                idade = scanner.nextInt();

                    if (idade >=18) {

                        System.out.println("maior de idade!");

                    } else {
                        System.out.println("menor de idade");
                    }

                    scanner.close();
    }
    
}
