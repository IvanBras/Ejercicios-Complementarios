import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Ejercicio23 {
    public static void main(String[] args) {
        
        String[] palos = {"Tréboles", "Diamantes", "Corazones", "Picas"};
        Integer[] cifras = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        List<String> mazo = new ArrayList<>();

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < cifras.length; j++) {
                mazo.add(cifras[j] + " de " + palos[i]);
            }
        }
        System.out.println("Imprimiendo el mazo en orden:");
        System.out.println(mazo);
        System.out.println();

        System.out.println("Imprimiendo el mazo en orden inverso");
        Collections.reverse(mazo);
        System.out.println(mazo);
        Collections.reverse(mazo);
        System.out.println();

        System.out.println("Imprimiendo el mazo en orden aleatorio");
        Collections.shuffle(mazo);
        System.out.println(mazo);
    }
}
