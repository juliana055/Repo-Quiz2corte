
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaPares = 0, sumaImpares = 0;
        int cuentaPares = 0, cuentaImpares = 0;
        int sumaPosicionesPares = 0, sumaPosicionesImpares = 0;

        // Leer 20 números enteros
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Calcular suma y cuenta de números pares e impares
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
                cuentaPares++;
            } else {
                sumaImpares += numeros[i];
                cuentaImpares++;
            }

            // Calcular suma de elementos en posiciones pares e impares
            if (i % 2 == 0) {
                sumaPosicionesPares += numeros[i];
            } else {
                sumaPosicionesImpares += numeros[i];
            }
        }

        // Calcular promedios
        double promedioPares = (cuentaPares > 0) ? (double) sumaPares / cuentaPares : 0;
        double promedioImpares = (cuentaImpares > 0) ? (double) sumaImpares / cuentaImpares : 0;

        // Mostrar resultados
        System.out.println("Promedio de números pares: " + promedioPares);
        System.out.println("Promedio de números impares: " + promedioImpares);
        System.out.println("Suma de elementos en posiciones pares: " + sumaPosicionesPares);
        System.out.println("Suma de elementos en posiciones impares: " + sumaPosicionesImpares);
    }
}
