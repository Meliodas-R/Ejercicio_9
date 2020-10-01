package ejercicio_9;

import java.util.Scanner;

/**
 * 9. Crear una contraseña y pedirsela al usuario. Si las contraseñas coinciden
 * se mostrará un mensaje de éxito, en caso de que no coincidan se restará un
 * intento hasta un maximo de 3. Si el usuario se queda sin intentos, mostrar un
 * mensaje de error.
 *
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String password = "siluro22";
        String passwordUsuario;
        int intentos = 3;

        for (int i = 3; i > 0; i--) {
            System.out.print("Introduzca su contraseña: ");
            passwordUsuario = teclado.nextLine();

            if (password.equals(passwordUsuario)) {
                System.out.println("Las contraseñas coinciden, bienvenido.");
                break;
            }

            if (!password.equals(passwordUsuario)) {
                if (i == 1) {
                    System.out.println("Intentos agotados, inténtelo de nuevo más tarde.");
                }
                if (i != 1) {
                    intentos--;
                    System.out.println("Las contraseñas no coinciden, inténtelo de nuevo." + " Intentos restantes: " + intentos);
                }

            }

        }

    }

}
