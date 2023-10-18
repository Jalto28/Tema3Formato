import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número real: ");
        double numero = teclado.nextDouble();

        // Mostrar el número con dos decimales usando printf
        System.out.printf("Número con dos decimales: %.2f%n", numero);

        teclado.close();
    }
}