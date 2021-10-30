public class Empleados {
    
    String nombre;
    String apellido;
    int dni;
    int horasTrabajadas;
    int valorPorHora;

    public Empleados(String nombre, String apellido, int dni, int horas, int valor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horas;
        this.valorPorHora = valor;
    }
}
