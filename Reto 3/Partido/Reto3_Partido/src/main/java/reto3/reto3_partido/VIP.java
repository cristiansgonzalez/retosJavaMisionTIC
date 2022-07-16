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
public class VIP extends Asistente{
    
    //ATRIBUTOS
    private boolean[] pantallas;
    private String credencialesPrevia;
    
    //CONSTRUCTOR
    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.credencialesPrevia = "";
        this.pantallas = new boolean[]{false, false, false};
    }

    //METODOS
    public void generarCredencialesPrevia(){
        int n;
        Random numAleatorio = new Random();

        n = numAleatorio.nextInt(100000-1);
        credencialesPrevia = String.valueOf(n);;
    }
    
    public void asignarPantallas(int pantalla){
        if (pantalla >= 1 && pantalla <= 3){
            pantallas[pantalla - 1] = !pantallas[pantalla - 1];
        }
    }
    
    //GETTERS
    public boolean[] getPantallas(){
        return pantallas;
    }
    
    public String getCredencialesPrevia(){
        return credencialesPrevia;
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
    public void setPantallas(boolean[] pantallas){
        this.pantallas = pantallas;
    }

    public void setCredencialesPrevia(String credencialesPrevia){
        this.credencialesPrevia = credencialesPrevia;
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
