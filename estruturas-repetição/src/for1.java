import java.util.Random;

public class for1 {
    public static void main(String[] args) throws Exception {

      Random gerador = new Random();
      int numero = 1 + gerador.nextInt(4);

        while (numero != 3) {
            System.out.println(numero);
            numero = 1 + gerador.nextInt(4);
      }
        System.out.println("Gerou o numero 3!!!");

      
    }
}
