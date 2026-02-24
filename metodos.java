package edu.itm.codigo;

import java.util.Scanner;

public class metodos {

    

        Scanner teclado = new Scanner(System.in);

        // Registrar asientos
        public objAsiento[][] registrarAsientos(objAsiento[][] matriz) {

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {

                    objAsiento a = new objAsiento();

                    System.out.println("\nAsiento en posición [" + i + "][" + j + "]");

                    System.out.print("Ingrese número de asiento: ");
                    a.setNumero(Integer.parseInt(teclado.nextLine()));

                    a.setFila(i);

                    System.out.print("Ingrese precio: ");
                    a.setPrecio(Double.parseDouble(teclado.nextLine()));

                    matriz[i][j] = a;
                }
            }

            return matriz;
        }

        // Ordenar cada fila por precio (ascendente)
        public void ordenarPorPrecio(objAsiento[][] matriz) {

            for (int i = 0; i < matriz.length; i++) {

                // Bubble sort en cada fila
                for (int pasada = 0; pasada < matriz[i].length - 1; pasada++) {
                    for (int j = 0; j < matriz[i].length - 1 - pasada; j++) {

                        if (matriz[i][j].getPrecio() > matriz[i][j + 1].getPrecio()) {

                            // Intercambio
                            objAsiento aux = matriz[i][j];
                            matriz[i][j] = matriz[i][j + 1];
                            matriz[i][j + 1] = aux;
                        }
                    }
                }
            }
        }

        // Mostrar matriz
        public void mostrarMatriz(objAsiento[][] matriz) {

            for (int i = 0; i < matriz.length; i++) {
                System.out.println("\nFila " + i + ":");
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }


