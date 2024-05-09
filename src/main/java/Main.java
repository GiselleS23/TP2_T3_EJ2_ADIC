/*  2.- Escriba un diagrama que calcule el factorial de un número.
Sacchetti, Maria Giselle C2*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=0;
    int factorial = 1;

    System.out.println("Ingresar un numero para calcular su factorial: ");
    while (n <= 0) {
      n = scanner.nextInt();

      if (n <= 0) {
        System.out.println("Numero incorrecto. Ingresar nuevamente un numero positivo distinto de cero: ");
      }
    }

    for (int i = 1; i <= n; i++) {
      factorial = factorial * i;
    }
    
    System.out.println("El factorial de " + n + " es: " + factorial);
    scanner.close();

  }

}