/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto1_carrera;

/**
 *
 * @author Cristian Gonzalez
 */
public class Reto1_carrera {
    
    // Atributos
    private int[] participantes;
    
    //constructor    
    public Reto1_carrera(){
        int [] participantes = {18,29,22,25,16,26,21,23,20};
        this.participantes = participantes;
    } 
    
    public static void main(String[] args) {
        Reto1_carrera datos = new Reto1_carrera();
        
        reporte(datos.participantes);
    }
    
    public static int [] reporte(int [] participantes){
        //EN ESTE ESPACIO PONER SU LÓGICA
        
        // Variables locales
        int cantidad;
        int[] salida = new int[3];
        int menor;
        int mayor;
        
        // Cantidad de participantes
        cantidad = participantes.length;
        salida[0] = cantidad;
        
        // Menor tiempo para terminar la carrrera
        menor = participantes[0];
        for (int i = 1; i < participantes.length; i++){
            if (participantes[i] < menor){
                menor = participantes[i];
            }
        }
        salida[1] = menor;
        
        // Mayor tiempo para terminar la carrrera
        mayor = participantes[0];
        for (int i = 1; i < participantes.length; i++){
            if (participantes[i] > mayor){
                mayor = participantes[i];
            }
        }
        salida[2] = mayor;        
        
        System.out.println("Cantidad menor mayor");
        for (int i = 0; i < salida.length; i++){
            System.out.print(salida[i] + "\t");            
        }
        
        return salida;
    }
}
