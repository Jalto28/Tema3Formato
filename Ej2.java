import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar hora, minutos y segundos al usuario
        System.out.print("Introduce la hora (0-23): ");
        int hora = teclado.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int minutos = teclado.nextInt();

        System.out.print("Introduce los segundos (0-59): ");
        int segundos = teclado.nextInt();

        // Formatear y mostrar la hora en el formato hh:mm:ss
        System.out.printf("Hora en formato hh:mm:ss: %02d:%02d:%02d%n", hora, minutos, segundos);

        teclado.close();
    }
}