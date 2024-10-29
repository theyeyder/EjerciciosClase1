import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra 1");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingresa Palabra 2");
        String palabra2 = scanner.nextLine();

        System.out.print("Ingrese Palabra 3");
        String palabra3 = scanner.nextLine();

        System.out.println(palabra1 + "" + palabra2 + ""
                + palabra3);
        System.out.println("Eyder Arroyo_DevSinior");
    }

}