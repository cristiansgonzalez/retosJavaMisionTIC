/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2.reto2_peaje;

/**
 *
 * @author Cristian Gonzalez
 */
public class Peaje {
    
    //EN ESTE ESPACIO SE ESCRIBEN LOS ATRIBUTOS DE LA CLASE Peaje
    private String[] filaCoches;
    private String[] cochesFlyPass;
    private boolean estadoPeaje;
    private int cantidadCochesAtendidos;
    private int cocheEnAtencion;
    
    //A CONTINUACIÓN, BAJO LOS ATRIBUTOS, SE ESCRIBEN LOS MÉTODOS DEFINIDOS
    //EN EL ENUNCIADO DEL PROBLEMA:

    public Peaje(String[] filaCoches) {
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO DEL PROBLEMA
        this.filaCoches = filaCoches;
        this.estadoPeaje = true;
        this.cocheEnAtencion = 0;
        this.cantidadCochesAtendidos = 1;
        
        this.cochesFlyPass = new String[this.filaCoches.length];
        for (int i = 0; i < this.cochesFlyPass.length; i++){
            this.cochesFlyPass[i] = " ";
        }
    }
    
    public void proximoCoche(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if(isEstadoPeaje()){
            cocheEnAtencion = (cocheEnAtencion + 1) % filaCoches.length;            
            cantidadCochesAtendidos = cantidadCochesAtendidos + 1;
        }
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        int contador = 0;
        for(String coche:cochesFlyPass){
            if(coche.equals(cocheABuscar)){
                break;
            }
            if(" ".equals(coche)){
                cochesFlyPass[contador] = cocheABuscar;
                break;
            }            
            contador++;
        }        
    }
    
    public void cambiarEstadoPeaje(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        estadoPeaje = !estadoPeaje;
    }
    
    //INSERTE LOS GETTERS Y SETTERS A PARTIR DE ACÁ:
    
    public boolean isEstadoPeaje(){
        return estadoPeaje;
    }
    
    public int getCocheEnAtencion(){
        return cocheEnAtencion;
    }
    
    public int getCantidadCochesAtendidos(){
        return cantidadCochesAtendidos;
    }
    
    public String[] getFilaCoches(){
        return filaCoches;
    }
    
    public String[] getCochesFlyPass(){
        return cochesFlyPass;
    }
    
    public void setEstadoPeaje(boolean estadoPeaje){
        this.estadoPeaje = estadoPeaje;
    }
    
    public void setCocheEnAtencion(int cocheEnAtencion){
        this.cocheEnAtencion = cocheEnAtencion;
    }
    
    public void setCantidadCochesAtendidos(int cantidadCochesAtentidos){
        this.cantidadCochesAtendidos = cantidadCochesAtentidos;
    }
    
    public void setFilaCoches(String[] filaCoches){
        this.filaCoches = filaCoches;
    }
    
    public void setCochesFlyPass(String[] cochesFlyPass){
        this.cochesFlyPass = cochesFlyPass;
    }
    
}
