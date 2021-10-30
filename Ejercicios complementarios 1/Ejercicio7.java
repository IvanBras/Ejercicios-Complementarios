import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra en minúsculas: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        char frase[] = palabra.toCharArray();
        scan.close();
        int longitud = palabra.length();

        for (int i = 0; i < longitud; i++) {
            if (frase[i] >= 'a' && frase[i] <= 'z') {
                frase[i] = (char) ((int) frase[i] - 32);
            }
        }
        for (int i = 0; i < longitud; i++) {
            System.out.print(frase[i]);
        }
    }
}
