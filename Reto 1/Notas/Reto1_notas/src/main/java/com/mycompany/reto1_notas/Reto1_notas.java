/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto1_notas;

/**
 *
 * @author Cristian Gonzalez
 */
public class Reto1_notas {

    // Atributos
    double[] listaNotas;     
    
    // Constructor
    public Reto1_notas(){
        double[] listaNotas = {4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.0};
        
        this.listaNotas = listaNotas;        
    }
    
    public static void main(String[] args) {
        Reto1_notas notas = new Reto1_notas();
        
        reporte(notas.listaNotas);
    }
    
    public static double[] reporte(double[] listaNotas){
        double[] salida = new double[3];        
        double sumatoria = 0;
        double promedio;
        double menor;
        double mayor;
               
        // Promedio
        for (int i = 0; i < listaNotas.length; i++){
            sumatoria = sumatoria + listaNotas[i];
        }
        promedio = sumatoria / listaNotas.length;
        salida[0] = promedio;
        
        // La menor nota        
        menor = listaNotas[0];              
        for (int i = 1; i < listaNotas.length; i++){
            if (listaNotas[i] < menor){
                menor = listaNotas[i];
            }
        }
        salida[1] = menor;
        
        // La meyor nota  
        mayor = listaNotas[0];    
        for (int i = 1; i < listaNotas.length; i++){
            if (listaNotas[i] > mayor){
                mayor = listaNotas[i];
            }
        }
        salida[2] = mayor;
        
        System.out.println("Promedio               menor    mayor");
        
        for (int i = 0; i < salida.length; i++){
            System.out.print(salida[i] + "\t");
        }
        
        return salida;
    }
}
