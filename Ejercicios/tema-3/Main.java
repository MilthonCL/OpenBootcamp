public class Main {
    public static void main(String[] args) {

        System.out.println("La suma de los números son: ");
        suma(10,10,10);


        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("El Coche tiene: " + miCoche.puertas + " puertas");


    }

    public static void suma(int num1, int num2, int num3) {
        int resultado;

        resultado = num1 + num2 + num3;
        System.out.println(resultado);
    }

}

class Coche {
    public int puertas = 5;

    public void AgregarPuerta() {
        this.puertas++;
    }


}

