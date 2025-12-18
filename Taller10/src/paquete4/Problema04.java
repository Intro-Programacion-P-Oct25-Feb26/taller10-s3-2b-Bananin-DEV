/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] MatrizA = new int[3][2];
        int[][] MatrizB = new int[3][2];
        boolean igualdad = true;
        boolean esMayor = false;
        String reporte = "";

        reporte = reporte + "Ingreso de matriz A\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                MatrizA[i][j] = entrada.nextInt();
            }
        }

        reporte = reporte + "\nIngreso de matriz B\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                MatrizB[i][j] = entrada.nextInt();
            }
        }

        reporte = reporte + "\nMatriz A:\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                reporte = reporte + MatrizA[i][j] + "\t";
            }
            reporte = reporte + "\n";
        }

        reporte += "\nMatriz B:\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                reporte += MatrizB[i][j] + "\t";
            }
            reporte += "\n";
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                if (MatrizA[i][j] < MatrizB[i][j]) {
                    igualdad = false;
                }

                if (MatrizA[i][j] > MatrizB[i][j]) {
                    esMayor = true;
                }
            }
        }
        if (igualdad && esMayor) {
            reporte = reporte + "\nLa matriz A es mayor que la matriz B\n";
        } else {
            reporte = reporte + "\nLa matriz A no es mayor que la matriz B\n";
        }
        System.out.println(reporte);
    }
}
