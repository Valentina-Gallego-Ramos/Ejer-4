package edu.itm.codigo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("¿Cuántas filas tiene el teatro?");
        int filas = Integer.parseInt(teclado.nextLine());

        System.out.println("¿Cuántos asientos por fila?");
        int columnas = Integer.parseInt(teclado.nextLine());

        objAsiento[][] matriz = new objAsiento[filas][columnas];

        matriz = m.registrarAsientos(matriz);

        System.out.println("\n--- Antes de ordenar ---");        
        m.mostrarMatriz(matriz);

        m.ordenarPorPrecio(matriz);

        System.out.println("\n--- Después de ordenar por precio (ascendente) ---");
        m.mostrarMatriz(matriz);
    }
}
