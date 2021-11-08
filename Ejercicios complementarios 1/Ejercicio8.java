import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        System.out.println("Ingrese su nombre y a apellido: ");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();

        System.out.println("Ingrese su edad: ");
        System.out.println();
        int edad = scan.nextInt();

        System.out.println("Ingrese su dirección: ");
        System.out.println();
        scan.nextLine();
        String direccion = scan.nextLine();

        System.out.println("Ingrese el nombre de su ciudad: ");
        System.out.println();
        String ciudad = scan.nextLine();
        scan.close();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);

    }
}
