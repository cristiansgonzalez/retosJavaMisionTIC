/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.reto3_tarjeta_cine;

/**
 *
 * @author Cristian Gonzalez
 */
public class TarjetaOro extends TarjetaCine{
    
    private String[] beneficiosDescripcion;
    private boolean[] beneficiosEstado;

    public TarjetaOro(String idTarjeta, String nombreCompleto, String email, String telefono,
            int edad){
        
        super(idTarjeta, nombreCompleto, email, telefono, edad);
        
        this.beneficiosDescripcion = new String[]{"Boleto Gratis", "Crispetas Gratis",
                                                  "Gaseosa Gratis"};
        
        this.beneficiosEstado = new boolean[]{true, true, true};
        
        super.setPorcentajeDescuento(20);
    }
    
    public boolean redimirBeneficio(int posicionbeneficio){
        
        if(beneficiosEstado[posicionbeneficio]){
            beneficiosEstado[posicionbeneficio] = !beneficiosEstado[posicionbeneficio];
            return true;
        }
        else{
            return false;
        }
    }

    public String[] getBeneficiosDescripcion() {
        return beneficiosDescripcion;
    }

    public boolean[] getBeneficiosEstado() {
        return beneficiosEstado;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }
    
    
}
