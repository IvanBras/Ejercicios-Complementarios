import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número:");
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();
        for (int i = 1; i <= nro; i++){
            int contador = 1;
            while (contador <= i) {
                System.out.print(contador + " ");
                ++contador;
            }
            System.out.println("");
        }
        scan.close();
    }
}
