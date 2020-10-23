package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PrintStream salida= System.out;
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String operando;
        int total =0;
        salida.println("Digite num1");
        num1 = entrada.nextInt();
        salida.println("Digite num2");
        num2 = entrada.nextInt();
        salida.println("Opcion +\nOpncion *\nOpcion -\n");
        salida.println("Digite su operando");
        operando = entrada.next();
        switch (operando){
            case "+":
                total = num1 + num2;
                salida.println("Su total es de "+total);
                break;
            case "*":
                total = num1 * num2;
                salida.println("Su total es de "+total);
                break;
            case "-":
                total = num1 - num2;
                salida.println("Su total es de "+total);
                break;
            default:
                salida.println("Error");
                break;
        }
    }
}
