public class Main {

    public static void main(String[] args) {

        var resultado = suma (2, 4, 6);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.IncrementaPuertas();
        System.out.println(miCoche.puertas);

    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static class Coche {

        public int puertas = 0;

        public void IncrementaPuertas(){
            this.puertas++;
        }
    }
}
