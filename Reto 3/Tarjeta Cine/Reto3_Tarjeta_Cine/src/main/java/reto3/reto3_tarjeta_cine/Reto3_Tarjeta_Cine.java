/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package reto3.reto3_tarjeta_cine;

/**
 *
 * @author Cristian Gonzalez
 */
public class Reto3_Tarjeta_Cine {


    
    public static void main(String[] args) {
        
        double pago = 0;
        String id = "0123";
        String nombre = "John Doe";
        String email = "jd31@correo.co";
        String tel = "5552223";
        int edad= 26;
        
        TarjetaPlata tp1 = new TarjetaPlata(id, nombre, email, tel, edad);
        
        

        info(tp1);
        
        System.out.println(tp1.getNombreCompleto() + " pago:");
        pago = tp1.pagar(new String[]{"Boleta", "Boleta", "Combo 1 - Crispetas + Gaseosa", "Combo 2 - Perro + Gaseosa"}); 
        info(tp1);
        
        System.out.println(tp1.getNombreCompleto() + " pago:\n" + pago);
        tp1.pagar(new String[]{"Boleta"});
        tp1.pagar(new String[]{"Boleta"});
        tp1.pagar(new String[]{"Boleta"});
        tp1.pagar(new String[]{"Boleta"});
        info(tp1);
        
        TarjetaOro to2 = new TarjetaOro(id, nombre, email, tel, edad);
        info(to2);
        
    }
    
    public static void info(TarjetaPlata tp1){
        
        
        System.out.println("Id de la tarjeta:\n" + tp1.getIdTarjeta());
        System.out.println("Nombre del cliente:\n" + tp1.getNombreCompleto());
        System.out.println("Email del cliente:\n" + tp1.getEmail());
        System.out.println("Telefono del cliente:\n" + tp1.getTelefono());
        System.out.println("Edad del cliente:\n" + tp1.getEdad());
        System.out.println("Porcentaje de descuento:\n" + tp1.getPorcentajeDescuento());
        System.out.println("Cantidad de visitas:\n" + tp1.getCantidadVisitas());
        System.out.println("El cliente es elegible para la tarjeta Oro:\n" + tp1.isElegibleOro());
        System.out.println("");
    }
    
        public static void info(TarjetaOro to2){
        
        
        System.out.println("Id de la tarjeta:\n" + to2.getIdTarjeta());
        System.out.println("Nombre del cliente:\n" + to2.getNombreCompleto());
        System.out.println("Email del cliente:\n" + to2.getEmail());
        System.out.println("Telefono del cliente:\n" + to2.getTelefono());
        System.out.println("Edad del cliente:\n" + to2.getEdad());
        System.out.println("Porcentaje de descuento:\n" + to2.getPorcentajeDescuento());
        
            System.out.println("Beneficios:");
        for (int i = 0; i < to2.getBeneficiosDescripcion().length; i++)
            System.out.print(to2.getBeneficiosDescripcion()[i] + ", ");
        System.out.println("Estado de los beneficios:");
        for (int i = 0; i < to2.getBeneficiosEstado().length; i++)
            System.out.print(to2.getBeneficiosEstado()[i] + ", ");
        System.out.println("");
    }


    
    
}
