import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Escriba una frase: ");
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        System.out.println("Ingrese el caracter a buscar: ");
        char letra = scan.next().charAt(0);
        scan.close();
        char entradaArray[] = entrada.toCharArray();
        int contador = 0;
        for(char ch : entradaArray) {
            if (ch == letra) {
                contador += 1;
            }
        }
        System.out.println("El carácter " + letra + " aparece " + contador + " veces");
    }
}
