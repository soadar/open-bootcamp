/*
Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a edad, nombre y telefono,
por último muéstralas por consola.
 */

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad(34);
        persona1.setTelefono(1555555555);

        System.out.println("Mi nombre es : " + persona1.getnombre());
        System.out.println("Mi edad es : " + persona1.getEdad());
        System.out.println("Mi telefono es : " + persona1.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return this.nombre;
    }

    void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}
