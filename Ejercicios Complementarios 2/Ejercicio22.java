import java.util.ArrayList;
import java.util.List;

public class Ejercicio22 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        System.out.println("Tamaño de la lista números: " + numeros.size());
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        numeros.add(0, 1);
        numeros.add(7);

        System.out.println("Tamaño de la lista números: " + numeros.size());
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
}
