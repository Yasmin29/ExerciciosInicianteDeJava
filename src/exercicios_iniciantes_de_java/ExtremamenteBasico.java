package exercicios_iniciantes_de_java;

import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int resultado = A + B;
        System.out.println("X = " + resultado );
    }
}
