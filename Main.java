import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String opcionInicio, opcionMenuUsuario;

        System.out.print("""
                
                ░█▀▀█ ▀█▀ ░█▀▀▀ ░█▄─░█ ░█──░█ ░█▀▀▀ ░█▄─░█ ▀█▀ ░█▀▀▄ ░█▀▀▀█ 　 ─█▀▀█\s
                ░█▀▀▄ ░█─ ░█▀▀▀ ░█░█░█ ─░█░█─ ░█▀▀▀ ░█░█░█ ░█─ ░█─░█ ░█──░█ 　 ░█▄▄█\s
                ░█▄▄█ ▄█▄ ░█▄▄▄ ░█──▀█ ──▀▄▀─ ░█▄▄▄ ░█──▀█ ▄█▄ ░█▄▄▀ ░█▄▄▄█ 　 ░█─░█\s
                
                ░█▀▀█ ─█▀▀█ ░█─── ░█▀▀█ ░█▀▀▀█ ░█▄─░█ 　 ▀▀█▀▀ ▀█▀ ░█▀▀█ ░█─▄▀ ░█▀▀▀ ▀▀█▀▀ ░█▀▀▀█\s
                ░█▀▀▄ ░█▄▄█ ░█─── ░█▀▀▄ ░█──░█ ░█░█░█ 　 ─░█── ░█─ ░█─── ░█▀▄─ ░█▀▀▀ ─░█── ─▀▀▀▄▄\s
                ░█▄▄█ ░█─░█ ░█▄▄█ ░█▄▄█ ░█▄▄▄█ ░█──▀█ 　 ─░█── ▄█▄ ░█▄▄█ ░█─░█ ░█▄▄▄ ─░█── ░█▄▄▄█\n\n""");


        System.out.print("""
                ************************************
                *  PULSA UNA TECLA PARA CONTINUAR  *
                ************************************
                \n""");
        scanner.nextLine();


        System.out.print("""
                *******************************************************************
                *                        MENÚ DE ACCESO                           *
                *******************************************************************
                 1. - ACCESO AL MENÚ DE ENTRADAS
                 2. - ACCESO AL MENÚ DE ADMINISTRADOR (SOLO PARA ADMINISTRADORES)
                """);
        System.out.print("Introduce la opción que deseas hacer: ");
        opcionInicio = scanner.nextLine();

        switch (opcionInicio) {
            case "1":

                do {
                    System.out.print("""
                        ***************************************
                        *          MENÚ DE ENTRADAS           *
                        ***************************************
                        * a. Vender entradas para un evento   *
                        * b. Consultar el estado de un evento *
                        * c. Salir                            *
                        ***************************************
                        """);

                    System.out.print("Introduce la opción que deseas hacer: ");
                    opcionMenuUsuario = scanner.nextLine();

                    switch (opcionMenuUsuario) {
                        case "a":
                            for (int i = 0; i < 50; i++) {
                                System.out.println();
                            }
                            System.out.println("""
                        ***************************************
                        *               EVENTOS               *
                        ***************************************
                        * a. Vender entradas para un evento   *
                        * b. Consultar el estado de un evento *
                        * c. Salir                            *
                        ***************************************""");

                            break;
                        case "b":
                            break;
                        case "c":
                            System.out.println("Saliendo del menú");
                            break;
                        default:
                            System.out.println("Opción seleccionada no válida\n");
                            break;
                    }

                } while (!opcionMenuUsuario.equals("c"));

                break;

            case "2":
                break;

            default:
                break;
        }


    }
}
