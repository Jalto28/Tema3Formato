public class Ej5Array {
    public static void main(String[] args) {
        int filas = 9; // Número de filas

        // Colores ANSI
        String[] colores = {
            "\u001B[30m", // Negro
            "\u001B[31m", // Rojo
            "\u001B[32m", // Verde
            "\u001B[33m", // Amarillo
            "\u001B[34m", // Azul fuerte
            "\u001B[35m", // Violeta
            "\u001B[36m", // Azul claro
            "\u001B[37m"  // Gris
        };

        // Bucle para cada fila
        for (int i = 1; i <= filas; i++) {
            // Espacios en blanco antes de los números
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            // Números en orden ascendente
            for (int k = 1; k <= i; k++) {
                System.out.print(colores[i - 1] + k);
            }

            // Resetear el color
            System.out.print("\u001B[0m");

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}
