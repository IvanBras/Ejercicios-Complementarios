import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A continuación ingrese el primer número: ");
        int num1 = scan.nextInt();
        System.out.println("A continuación ingrese el segundo número: ");
        int num2 = scan.nextInt();
        scan.close();

        fizzBuzz(num1, num2);
    }

    public static void fizzBuzz(int num1, int num2) {
        List<String> salida = new ArrayList<>();
        for(int i = num1; i < num2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                salida.add("FizzBuzz");
            } else if (i % 2 == 0) {
                salida.add("Fizz");
            } else if (i % 3 == 0) {
                salida.add("Buzz");
            } else {
                salida.add(String.valueOf(i));
            }
        }
        System.out.println(salida);
    }
}
