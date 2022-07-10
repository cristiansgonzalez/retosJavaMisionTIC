/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.reto3_tarjeta_cine;

/**
 *
 * @author Cristian Gonzalez
 */
public class TarjetaCine {
    
    private String idTarjeta;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private int edad;
    private double porcentajeDescuento;
    private final String BOLETA;
    private final String COMBO1;
    private final String COMBO2;
    
    public TarjetaCine(String idTarjeta, String nombreCompleto, String email, String telefono,
            int edad){
        this.idTarjeta = idTarjeta;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.BOLETA = "Boleta";
        this.COMBO1 = "Combo 1 - Crispetas + Gaseosa";
        this.COMBO2 = "Combo 2 - Perro + Gaseosa";
        
    }
    public double pagar(String[] cuenta){
        double total = 0;
        
        for(String item : cuenta){
            if(BOLETA.equals(item))
                total = total + 6000;           
            else if(COMBO1.equals(item))
                total = total + 8000;           
            else if(COMBO2.equals(item))
                total = total + 12000;           
        } 
        total = total * (1 - getPorcentajeDescuento() / 100);
        return total;
    }
    
    public String getIdTarjeta(){
        return idTarjeta;
    }
    
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public int getEdad(){
        return edad;
    }

    public String getBOLETA() {
        return BOLETA;
    }
    
    public String getCOMBO1(){
        return COMBO1;
    }
    
    public String getCOMBO2(){
        return  COMBO2;
    }
    
    public double getPorcentajeDescuento(){
        return porcentajeDescuento;
    }
    
    public void setIdTarjeta(String idTarjeta){
        this.idTarjeta = idTarjeta;
    }
    
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setPorcentajeDescuento(double porcentajeDescuento){
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    
}
