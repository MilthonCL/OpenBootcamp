public class Main {
    public static void main(String[] args) {

        int numeroIf = 20;

        if(numeroIf > 0) {
            System.out.println("el " + numeroIf + " es positivo");
        } else if (numeroIf == 0) {
            System.out.println("el " + numeroIf + " no es negativo, ni positivo");
        }else{
            System.out.println("el " + numeroIf + " es negativo");
        }

        // Loop-While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("Salida While " + numeroWhile);
            numeroWhile++;

        }

        // Do While
        int numeroDoWhile = 3;
        do {
            System.out.println("Salida Do While " + numeroDoWhile);
            numeroDoWhile++;
        }while (numeroDoWhile  < 3);

        // Loop For

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Salida For " + numeroFor);
        }

        var estacion = "Otoño";

        switch (estacion) {
            case "Verano":
                System.out.println("Estás en Verano");
                break;
            case "Invierno":
                System.out.println("Estás en Invierno");
                break;
            case "Otoño":
                System.out.println("Estás en Otoño");
                break;
            case "Primavera":
                System.out.println("Estás en Primavera");
                break;
            default:
                System.out.println("Verano, estación por Default");
                break;
        }
    }
}


