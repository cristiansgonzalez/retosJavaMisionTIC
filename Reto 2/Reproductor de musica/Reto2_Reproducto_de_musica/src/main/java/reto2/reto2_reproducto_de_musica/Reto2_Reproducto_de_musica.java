/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package reto2.reto2_reproducto_de_musica;

/**
 *
 * @author Cristian Gonzalez
 */
public class Reto2_Reproducto_de_musica {
    
    public static void main(String[] args) {
        String[] cancionesEscogidas = new String[]{"Mil horas", 
                                                   "Por ese hombre",
                                                   "A esa",
                                                   "Algo de mi",
                                                   "Si me dejas ahora",
                                                   "¿Quieres ser mi amante?",
                                                   "Quel sorriso in volto",
                                                   "Per una notte insieme",
                                                   "Como un pintor",
                                                   "Sencillamente",
                                                   "Un segundo",
                                                   "Enciéndeme",
                                                   "Cuando me enamoro",
                                                   "Tu eres mi tesoro",
                                                   "Piccola anima",
                                                   "Solo a ti pertenezco",
                                                   "Todos por todos"
                                                   };
        
        
        ReproductorMusica ventana1 = new ReproductorMusica(cancionesEscogidas);
        
        ventana1.devolverCancion();
        ventana1.devolverCancion();
        ventana1.devolverCancion();
        ventana1.devolverCancion();
        
        probarCodigo(ventana1);
        
        ventana1.agregarCancionesFavoritas();
        ventana1.proximaCancion();
        ventana1.agregarCancionesFavoritas();
        ventana1.devolverCancion();
        ventana1.agregarCancionesFavoritas();
                
        probarCodigo(ventana1);
        
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        
        probarCodigo(ventana1);
    }
    
    public static void probarCodigo(ReproductorMusica ventana1){
        
        for (int i = 0; i < ventana1.getCanciones().length; i++){
            System.out.print(ventana1.getCanciones()[i] + ", ");
        }
        System.out.println("");
        
        for (int i = 0; i < ventana1.getCancionesFavoritas().length; i++){
            System.out.print(ventana1.getCancionesFavoritas()[i] + ", ");
        }
        System.out.println("");
        
        System.out.println(ventana1.isPausado());
 
        System.out.println(ventana1.getCancionReproduciendo());
        System.out.println("");
    }
}
