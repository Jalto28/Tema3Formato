public class Ej5Alter {
    public static void main(String[] args) {
        int filas = 9; // Número de filas

        // Bucle para cada fila
        for (int i = 1; i <= filas; i++) {
            // Se imprimen espacios en blanco antes de los números. Se van reduciendo a medida que llegamos a las filas posteriores.
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            // Números en orden ascendente con colores
            for (int k = 1; k <= i; k++) {
                // Determinar el color en función de la fila
                String color = "";
                if (i == 9) {
                    color = "\u001B[30m"; // Negro (fila 9)
                } else if (i == 1) {
                    color = "\u001B[30m"; // Negro (fila 1)
                } else if (i == 2) {
                    color = "\u001B[31m"; // Rojo
                } else if (i == 3) {
                    color = "\u001B[32m"; // Verde
                } else if (i == 4) {
                    color = "\u001B[33m"; // Amarillo
                } else if (i == 5) {
                    color = "\u001B[34m"; // Azul fuerte
                } else if (i == 6) {
                    color = "\u001B[35m"; // Violeta
                } else if (i == 7) {
                    color = "\u001B[36m"; // Azul claro
                } else if (i == 8) {
                    color = "\u001B[37m"; // Gris
                }

                // Imprimir el número con el color correspondiente
                System.out.print(color + k);
            }

            // Resetear el color
            System.out.print("\u001B[0m");

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}
