/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2.reto2_turno_virtual;

/**
 *
 * @author Cristian Gonzalez
 */
public class TurnoVirtual {
    //ESTA CLASE NO TIENE MAIN
    
    //INSERTE LOS ATRIBUTOS
    private String[] turnos;
    private String[] turnosPerdidos;
    private boolean estadoTurnoVirtual;
    private int turnoEnAtencion;
    private int cantidadTurnosAtendidos;
    
    //INSERTE EL MÉTODO CONSTRUCTOR
    
    public TurnoVirtual(String[] turnos){
        this.turnos = turnos;
        this.estadoTurnoVirtual = true;
        this.turnoEnAtencion = 0;
        this.cantidadTurnosAtendidos = 1;
        
        this.turnosPerdidos = new String[this.turnos.length];
        for(int i = 0; i < this.turnosPerdidos.length; i++){
            this.turnosPerdidos[i] = " ";
        }
    }
    
    //INSERTE LOS GETTERS Y SETTERS
    public String[] getTurnos(){
        return turnos;
    }
    
    public String[] getTurnosPerdidos(){
        return turnosPerdidos;
    }
    
    public boolean isEstadoTurnoVirtual(){
        return estadoTurnoVirtual;
    }
    
    public int getTurnoEnAtencion(){
        return turnoEnAtencion;
    }
    
    public int getCantidadTurnosAtendidos(){
        return cantidadTurnosAtendidos;
    }
    
    public void setTurnos(String[] turnos){
        this.turnos = turnos;
    }
    
    public void setTurnosPerdidos(String[] turnosPerdidos){
        this.turnosPerdidos = turnosPerdidos;
    }
    
    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual){
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }
    
    public void setTurnoEnAtencion(int turnoEnAtencion){
        this.turnoEnAtencion = turnoEnAtencion;
    }
    
    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos){
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }
    
    //INSERTE LOS DEMÁS MÉTODOS
    public void atenderProximoTurno(){
        if(isEstadoTurnoVirtual()){
            turnoEnAtencion = (turnoEnAtencion + 1) % turnos.length;
            cantidadTurnosAtendidos = cantidadTurnosAtendidos + 1;
        }
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }  
    
    public void cambiarestadoTurno(){
        estadoTurnoVirtual = !estadoTurnoVirtual;
    }
}