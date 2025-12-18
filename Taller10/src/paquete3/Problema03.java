/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };

        int noFalla = 0;
        boolean falla;
        String mensaje = "";

        for (int i = 0; i < sensores.length; i++) {
            falla = false;

            for (int j = 0; j < sensores[i].length; j++) {
                if (sensores[i][j] == false) {
                    falla = true;
                }
            }

            if (falla == false) {
                noFalla = noFalla + 1;
            } else {
                mensaje = String.format(
                        "%ssensor en zona %d presenta al menos una falla\n",
                        mensaje,
                        i + 1);
            }
        }

        mensaje = String.format(
                "%s\nNumero de zonas que funcionan sin fallas: %d\n",
                mensaje,
                noFalla);

        System.out.printf("%s", mensaje);
    }
}
