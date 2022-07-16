/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.reto3_partido;

/**
 *
 * @author Cristian Gonzalez
 */
public class Preferencial extends Asistente{
    
    //ATRIBUTOS
    private boolean participaSorteo;
    
    //CONSTRUCTOR
    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia){
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.participaSorteo = false;
    }
    
    //METODOS
    public void participaSorteo(){
        participaSorteo = !participaSorteo;
    }
    
    //GETTERS
    public boolean isParticipaSorteo(){
        return participaSorteo;
    }

    @Override
    public String getIdTiquete() {
        return idTiquete;
    }

    @Override
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    @Override
    public String getCredenciales() {
        return credenciales;
    }
    
    //SETTERS
    public void setParticipaSorteo(boolean participaSorteo){
        this.participaSorteo = participaSorteo;
    }

    @Override
    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    @Override
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    @Override
    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
}
