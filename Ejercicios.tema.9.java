public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 33;
        cliente.telefono = 5555555;
        cliente.nombre = "Pepe";
        cliente.credito = 88;
        System.out.println("cliente: " + cliente.nombre + "\nEdad: " + cliente.edad + "\nTelefono: " + cliente.telefono + "\nCredito: " + cliente.credito + "\n");


        Trabajador trabajador = new Trabajador();
        trabajador.edad = 22;
        trabajador.telefono = 2222222;
        trabajador.nombre = "Juan";
        trabajador.salario = 11.254;
        System.out.println("Trabajador: " + cliente.nombre + "\nEdad: " + cliente.edad + "\nTelefono: " + cliente.telefono + "\nCredito: " + cliente.credito + "\n");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    double salario;
}