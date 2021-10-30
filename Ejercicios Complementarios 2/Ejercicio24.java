import java.util.ArrayList;
import java.util.List;

public class Ejercicio24 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>(List.of("Benjamin", "Martina", "Bautista", "Isabella", "Joaquin", "Catalina", "Santino", "Sofia", "Mateo", "Valentina", "Felipe", "Delfina"));
        System.out.println("Lista de alumnos: " + alumnos);
        List<String> comision1 = alumnos.subList(0, 4);
        System.out.println("Curso 1: " + comision1);
        List<String> comision2 = alumnos.subList(4, 8);
        System.out.println("Curso 2: " + comision2);
        List<String> comision3 = alumnos.subList(8, 12);
        System.out.println("Curso 3: " + comision3);
    }
}
