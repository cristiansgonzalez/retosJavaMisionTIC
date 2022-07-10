/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.reto3_tarjeta_cine;

/**
 *
 * @author Cristian Gonzalez
 */
public class TarjetaPlata extends TarjetaCine{
    
    private int cantidadVisitas;
    private boolean elegibleOro;
    
    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono,
            int edad){
        super(idTarjeta, nombreCompleto, email, telefono, edad);
        this.cantidadVisitas = 0;
        this.elegibleOro = false;
        super.setPorcentajeDescuento(10);

    }
    
    @Override
    public double pagar(String[] cuenta){
        
        cantidadVisitas = cantidadVisitas + 1;
        if (cantidadVisitas == 5){
            elegibleOro = true;
        }
        
        double total = 0.0f;
        
        for(String item : cuenta){
            if(super.getBOLETA().equals(item))
                total = total + 6000;           
            else if(super.getCOMBO1().equals(item))
                total = total + 8000;           
            else if(super.getCOMBO2().equals(item))
                total = total + 12000;           
        } 
        total = total * (1 - super.getPorcentajeDescuento() / 100);
        System.out.println(total);
        return total;
    }
    
    public int getCantidadVisitas(){
        return cantidadVisitas;
    }
    
    public boolean isElegibleOro(){
        return elegibleOro;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }
    
    
}
