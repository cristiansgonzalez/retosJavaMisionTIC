/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto1_tienda;

/**
 *
 * @author Cristian Gonzalez
 */
public class Reto1_tienda {

    // Atributos
    int[] compra;
    
    // Constructor
    public Reto1_tienda(){
        int[] compra = {2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400};
        
        this.compra = compra;
    }
            
    public static void main(String[] args) {
        Reto1_tienda compra = new Reto1_tienda();
        
        reporte(compra.compra);
        
    }
    
    public static int[] reporte(int[] compra){
        int[] salida = new int[3];
        int total = 0;
        int menor;
        int mayor;
        
        for (int i = 0; i < compra.length; i++){
            total = total + compra[i];
        }
        salida[0] = total;
        
        // Costo del producto mas barato       
        menor = compra[0];              
        for (int i = 1; i < compra.length; i++){
            if (compra[i] < menor){
                menor = compra[i];
            }
        }
        salida[1] = menor;
        
        // Costos del procuto mas caro
        mayor = compra[0];    
        for (int i = 1; i < compra.length; i++){
            if (compra[i] > mayor){
                mayor = compra[i];
            }
        }
        salida[2] = mayor;
        
        System.out.println("Total  menor  mayor");
        
        for (int i = 0; i < salida.length; i++){
            System.out.print(salida[i] + "\t");
        }
        
        return salida;
    }
            
}
