import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos números: ");
        Scanner scan = new Scanner(System.in);
        int nro1 = scan.nextInt();
        int nro2 = scan.nextInt();
        int suma = nro1 + nro2;
        int resta = nro1 - nro2;
        int mult = nro1 * nro2;
        float div = (float)nro1 / nro2;
        int resto = nro1 % nro2;
        System.out.println(nro1 + " + " + nro2 + " = " + suma);
        System.out.println(nro1 + " - " + nro2 + " = " + resta);
        System.out.println(nro1 + " * " + nro2 + " = " + mult);
        System.out.println(nro1 + " / " + nro2 + " = " + div);
        System.out.println(nro1 + " % " + nro2 + " = " + resto);        
        scan.close();
    }
}
