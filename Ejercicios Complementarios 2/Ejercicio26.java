import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio26 {
    public static void main(String[] args) {
        
        Empleados emp1 = new Empleados("Juan", "Perez", 30597416, 160, 200);
        Empleados emp2 = new Empleados("Alberto", "Gomez", 17684276, 140, 300);
        Empleados emp3 = new Empleados("Maria", "Lopez", 24197328, 144, 250);

        Set<Empleados> emps = new HashSet<>(List.of(emp1, emp2, emp3));

        Map<Integer, Integer> sueldos = new HashMap<>();

        for (Empleados empleado : emps) {
            sueldos.put(empleado.dni, (empleado.horasTrabajadas * empleado.valorPorHora));
        }
        for (Map.Entry<Integer, Integer> registro : sueldos.entrySet()) {
            System.out.println("DNI: " + registro.getKey() + ", Sueldo: " + registro.getValue());
        }
    }
}
