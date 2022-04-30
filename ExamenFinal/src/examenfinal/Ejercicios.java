package examenfinal;

import java.util.Scanner;

/**
 *
 * @author Gerardo_PC
 */
public class Ejercicios {

    public static void Ejercicio1() {
        System.out.println("---------- Empezanddo el Ejercicio 1 ---------- ");
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("ingrese el segundo numero: ");
        numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.print("--- El numero mayor entre los dos numeros ingresados es : " + numero1);
        } else {
            System.out.print("--- El numero mayor entre los dos numeros ingresados es : " + numero2);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public static void Ejercicio2() {
        System.out.println("---------- Empezanddo el Ejercicio 2 ---------- ");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero impar para generar la piramide: ");
        int numero = teclado.nextInt();
        int filas = 1;

        if (numero % 2 == 0) {
            System.out.print("Introduce nuevamente un numero impar para generar la piramide: ");
            numero = teclado.nextInt();
            
        } else {
            System.out.println();
            for (int p = 1; p < numero; p++) {
                if (p % 2 == 1){
                    if (filas <= p){
                        filas = filas +1;
                        System.out.println("");
                    }
                }
                
                
            }
            
            
            for (int i=1; i<=filas; i++) {
                for (int j=1; j<=filas-i; j++) {
                    System.out.print(" ");
                }
                for (int k=1; k<=(i*2)-1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    public static void Ejercicio3() {
        System.out.println("Ejercicio 3 ---------- ");
    }
}
