import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] alturas = new float[5];
        float suma = 0;

        // Leer las alturas de 5 personas
        System.out.println("Introduce las alturas de 5 personas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Altura " + (i + 1) + ": ");
            alturas[i] = scanner.nextFloat();
            suma += alturas[i];
        }

        // Calcular el promedio
        float promedio = suma / 5;
        System.out.println("Promedio de alturas: " + promedio);

        // Contar cuántas personas son más altas y cuántas más bajas que el promedio
        int masAltas = 0, masBajas = 0;
        for (float altura : alturas) {
            if (altura > promedio) {
                masAltas++;
            } else if (altura < promedio) {
                masBajas++;
            }
        }

        // Mostrar resultados
        System.out.println("Número de personas más altas que el promedio: " + masAltas);
        System.out.println("Número de personas más bajas que el promedio: " + masBajas);
    }
}