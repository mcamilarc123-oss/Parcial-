/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camaleon;
import java.util.Random;
import java.util.Scanner;

public class Camaleon {
   
    public static int sumaDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }

    
    public static int invertirNumero(int num) {
        int invertido = 0;
        while (num > 0) {
            invertido = invertido * 10 + (num % 10);
            num /= 10;
        }
        return invertido;
}

    
    public static boolean esCamaleon(int num) {
        int suma = sumaDigitos(num);
        int invertido = invertirNumero(num);
        return (suma % 2 == 0) && (invertido % 3 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Cantidad de números a validar: ");
        int cantidad = sc.nextInt();

        System.out.print("Números generados: ");
        for (int i = 0; i < cantidad; i++) {
            
            int numero = rand.nextInt(99999 - 100 + 1) + 100;

            System.out.print(numero);
            if (i < cantidad - 1) {
                System.out.print(", ");
            }

            if (esCamaleon(numero)) {
                System.out.println(" → SI es camaleón");
            } else {
                System.out.println(" → NO es camaleón");
            }
        }
        
    }
    
}

