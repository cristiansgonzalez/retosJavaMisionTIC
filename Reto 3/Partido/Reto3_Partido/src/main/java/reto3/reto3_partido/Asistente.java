/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.reto3_partido;

import java.util.Random;

/**
 *
 * @author Cristian Gonzalez
 */
public class Asistente {
    
    //ATRIBUTOS
    protected String idTiquete;
    protected String nombreCompleto;
    protected String direccionResidencia;
    protected String credenciales;
    
    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia){
        this.idTiquete = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
        this.credenciales = "";
    }
    
    //METODOS    
    public void generarCredenciales(){
        int n;
        Random numAleatorio = new Random();

        n = numAleatorio.nextInt(100000-1);
        credenciales = String.valueOf(n);
    }
    
    public String getIdTiquete(){
        return idTiquete;
    }
    
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    
    public String getDireccionResidencia(){
        return direccionResidencia;
    }
    
    public String getCredenciales(){
        return credenciales;
    }
    
    public void setIdTiquete(String idTiquete){
        this.idTiquete = idTiquete;
    }
    
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    
    public void setDireccionResidencia(String direccionResidencia){
        this.direccionResidencia = direccionResidencia;
    }
    
    public void setCredenciales(String credenciales){
        this.credenciales = credenciales;
    }
}
