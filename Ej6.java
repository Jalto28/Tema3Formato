public class PatronNumerico {
    public static void main(String[] args) {
        int filas = 9; // Número de filas

        // Bucle para cada fila
        for (int i = 1; i <= filas; i++) {
            // Espacios en blanco antes de los números
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            // Números en orden ascendente
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Números en orden descendente
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}