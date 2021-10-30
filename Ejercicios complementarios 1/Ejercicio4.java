import java.util.Scanner;
import java.math.BigInteger;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= nro; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("El factorial del número ingresado es: " + fact);
        scan.close();
    }
}
