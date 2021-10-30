import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número:");
        Scanner scan = new Scanner(System.in);
        int nro1 = scan.nextInt();
        System.out.println("Ingrese otro número:");
        int nro2 = scan.nextInt();
        int resultado = 0;
        if (nro2 == 0) {
            nro1 = 0;
        } else {
            for (int i = 1;i <= nro2; i++) {
                resultado = resultado + nro1;
            }
        }
        System.out.println("El resultado de " + nro1 + " * " + nro2 + " es: " + resultado);
        scan.close();
    }
}
