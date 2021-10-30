import java.util.ArrayList;
import java.util.List;

public class Ejercicio25 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>(
            List.of(6, 7, 8, 4, 5));
        List<Integer> valorPorHora = new ArrayList<>(
            List.of(350, 345, 550, 600, 320));
        List<Integer> valorPorDia = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < 5; i++) {
            valorPorDia.add(horasTrabajadas.get(i) * valorPorHora.get(i));
            total = total + valorPorDia.get(i);
        }
        
        System.out.println(valorPorDia);
        System.out.println("Total final: $" + total);
    }
}
