/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int[]diasAsistidos = new int[6];
        String reporte = "";
        String condicion = "";
        
        for (int i = 0; i < asistencia.length; i++) { 
            diasAsistidos[i]=0;
            for (int j = 0; j < asistencia[i].length; j++) { 
                if (asistencia[i][j]){
                    diasAsistidos[i]++;
                }
                     
            }
            
        }
        
        for (int i = 0; i < estudiantes.length; i++) {
            if(diasAsistidos[i]==5){
                condicion = "Su asistencia es completa";
            }else{
                condicion = "su asistencia es incompleta o no valida";
                
            }
            reporte = String.format("%sEl/La estudiante %s asistio %s dias\n%s\n ",
                    reporte,
                    estudiantes[i],
                    diasAsistidos[i],
                    condicion);
        }
        
        System.out.printf("%s\n", reporte);
    }

}
