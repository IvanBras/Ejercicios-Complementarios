import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");
        Scanner scan = new Scanner(System.in);
        int nro1 = scan.nextInt();
        System.out.println("Ingrese otro número: ");
        int nro2 = scan.nextInt();
        scan.close();
        int resultado = 1;
        if (nro2 == 0) {
            resultado = 1;
        } else {
            for (int i = 1; i <= nro2; i++) {
                resultado = resultado * nro1;
            }
        }
        System.out.println("El resultado de " + nro1 + " ^ " + nro2 + " es: " + resultado);
    }
}
