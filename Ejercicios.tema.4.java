public class Main {
    public static void main(String[] args) {
        int numeroIf = 3;
        int numeroWhile = 1;
        String estacion = "invierno";

        if(numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }

        while (numeroWhile < 3){
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        } while (numeroWhile < 4);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        switch (estacion.toUpperCase()){
            case "VERANO" -> System.out.println("Es verano");
            case "INVIERNO" -> System.out.println("Es invierno");
            case "PRIMAVERA" -> System.out.println("Es primavera");
            case "OTOÑO" -> System.out.println("Es otoño");
            default -> System.out.println("No es ninguna estacion");
        }
    }
}
