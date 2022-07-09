/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2.reto2_reproducto_de_musica;

/**
 *
 * @author Cristian Gonzalez
 */
public class ReproductorMusica {
    
    //ATRIBUTOS
    private String[] canciones;
    private int[] cancionesFavoritas;
    private boolean pausado;
    private int cancionReproduciendo;
     
    //CONSTRUCTOR
   
    
    public ReproductorMusica(String[] canciones) {
        this.canciones = canciones;
        this.cancionesFavoritas = new int[this.canciones.length];
        this.pausado = true;
        this.cancionReproduciendo = 0;
        
        for(int i = 0; i < this.cancionesFavoritas.length; i++){
            this.cancionesFavoritas[i] = -1;
        }
        
        
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO
    }
    
    //MÉTODOS
    
    
    public void proximaCancion(){
        cancionReproduciendo = (cancionReproduciendo + 1)%canciones.length;
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
    }
    
    public void devolverCancion(){
        cancionReproduciendo = (cancionReproduciendo + canciones.length - 1)%canciones.length;
        //System.out.println(cancionReproduciendo);
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
    }
    
    public void cambiarEstadoReproduccion(){
        pausado = !pausado;
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCancionesFavoritas(){
        for(int i = 0; i < cancionesFavoritas.length; i++)
            /*En caso de que encuentre que cancionReproduciendo está en el banco de cancionesFavoritas
            no seguimos buscando espacio libre para agregarla, y salimos del método*/
            if(cancionesFavoritas[i] == cancionReproduciendo)
                return;
            //Pero si no la encontró, y además encuentra un espacio donde añadirlo, lo hace
            else if(cancionesFavoritas[i] == -1){
                cancionesFavoritas[i] = cancionReproduciendo;
                return;
            }                
    }

    public String[] getCanciones() {
        return canciones;
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
    }

    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
    }

    public int[] getCancionesFavoritas() {
        return cancionesFavoritas;
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
    }

    public void setCancionesFavoritas(int[] cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
    }

    public boolean isPausado() {
        return pausado;
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
    }

    public int getCancionReproduciendo() {
        return cancionReproduciendo;
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
    }

    public void setCancionReproduciendo(int cancionReproduciendo) {
        this.cancionReproduciendo = cancionReproduciendo;
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
    }
    
}

