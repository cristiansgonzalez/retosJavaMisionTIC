/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package reto4.reto4_variante_notas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Cristian Gonzalez
 */
public class Reto4_Variante_Notas {

    public static void main(String[] args) {
        ArrayList<Estudiante> grupo = new ArrayList<>();
        grupo.add(new Estudiante("John Doe", "0123", 5.0, 4, 8));
        grupo.add(new Estudiante("Jane Doe", "9283", 4.1, 7, 13));
        grupo.add(new Estudiante("Pepito Perez", "0194", 1.5, 5, 9));
        grupo.add(new Estudiante("Fulano de tal", "9013", 2.3, 2, 6));
        Object[] retorno1 = reportes(grupo);
        System.out.println(Arrays.toString(retorno1));
        
    }
    
    public static Object[] reportes(ArrayList<Estudiante> grupo){
        
        double notas = 0;
        String nombreEstudianteMenorNota = grupo.get(0).getNombreCompleto();
        double menorNota = grupo.get(0).getNota();
        String nombreEstudianteMayorNota = grupo.get(0).getNombreCompleto();
        double mayorNota = grupo.get(0).getNota();
        
        for (int i = 0; i < grupo.size(); i++){
            notas += grupo.get(i).getNota();
            if (grupo.get(i).getNota() <= menorNota){
                menorNota = grupo.get(i).getNota();
                nombreEstudianteMenorNota = grupo.get(i).getNombreCompleto();
            }
            else if (grupo.get(i).getNota() >= mayorNota){
                mayorNota = grupo.get(i).getNota();
                nombreEstudianteMayorNota = grupo.get(i).getNombreCompleto();
            }                 
        }
        
        notas = notas / grupo.size();
        
        Object[] reporte = new Object[]{notas, nombreEstudianteMenorNota, menorNota,
                                        nombreEstudianteMayorNota, mayorNota};
        return reporte;
    }
}
