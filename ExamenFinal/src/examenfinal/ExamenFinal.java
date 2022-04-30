package examenfinal;

import java.util.Scanner;

/**
 *
 * @author Gerardo_PC
 */
public class ExamenFinal {

    public static Ejercicios Llamar = new Ejercicios();
    private static int opcion;

    public static void main(String[] args) {
        Menu_Principal();
    }

    public static void Menu_Principal() {

        do {
            Scanner sn = new Scanner(System.in);
            System.out.println("---------------- Menu-------------------------");
            System.out.println("- 1. Ejercicio 1                             -");
            System.out.println("- 2. Ejercicio 2                             -");
            System.out.println("- 3. Ejercicio 3                             -");
            System.out.println("- 4. Salir                                   -");
            System.out.println("----------------------------------------------");
            try {

                System.out.println("ingrese una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println();
                        System.out.println("Ejercicio 1:");
                        Llamar.Ejercicio1();
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Ejercicio 2:");
                        Llamar.Ejercicio2();
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("Ejercicio 3:");
                        Llamar.Ejercicio3();
                        break;
                    case 4:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("---> opcion invalida, porfavor ingrese una de las opciones en el menu");
                }
            } catch (Exception e) {
                System.out.println("solo se aceptan valores numericos, vuelva a intentar:" + e.getMessage());
            }

        } while (opcion != 4);

    }

}
