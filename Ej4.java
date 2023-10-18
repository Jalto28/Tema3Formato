public class Ej4 {
    public static void main(String[] args) {
        int filas = 9; // Número de filas

        // Bucle para cada fila
        for (int i = 1; i <= filas; i++) {
            // Números en orden ascendente
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}