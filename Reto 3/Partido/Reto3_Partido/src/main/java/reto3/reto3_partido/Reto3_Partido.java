/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package reto3.reto3_partido;
/**
 *
 * @author Cristian Gonzalez
 */
public class Reto3_Partido {

    public static void main(String[] args) {
        
        Preferencial tiq_perf1 = new Preferencial("0123","Juan Perez", "CL 01 CR 02-03");
        VIP tiq_vip1 = new VIP("5434", "Maria Lopez", "CR 29 CL 28-27");
       
        informacion(tiq_perf1);
        informacion(tiq_vip1);
        
        tiq_perf1.participaSorteo();
        informacion(tiq_perf1);
        
        tiq_perf1.generarCredenciales();
        informacion(tiq_perf1);
        
        tiq_vip1.generarCredenciales();
        tiq_vip1.generarCredencialesPrevia();
        tiq_vip1.asignarPantallas(1);
        tiq_vip1.asignarPantallas(2);
        tiq_vip1.asignarPantallas(3);
        tiq_vip1.asignarPantallas(3);
        informacion(tiq_vip1);
        
        tiq_vip1.asignarPantallas(3);
        informacion(tiq_vip1);
        
        tiq_perf1.setDireccionResidencia("CL 04 CR 05-06");
        informacion(tiq_perf1);
    }
    
    public static void informacion(Preferencial tiq_perf1){
        
        System.out.println("ID del tiquete: ");
        System.out.println(tiq_perf1.getIdTiquete());
        System.out.println("Nombre del cliente:");
        System.out.println(tiq_perf1.getNombreCompleto());
        System.out.println("Direccion del cliente:");
        System.out.println(tiq_perf1.getDireccionResidencia());
        System.out.println("Credenciales del cliente:");
        System.out.println(tiq_perf1.getCredenciales());
        System.out.println("¿Participa en el sorte?");
        System.out.println(tiq_perf1.isParticipaSorteo());
        System.out.println("");
    }
    
    public static void informacion(VIP tiq_vip1){
        
        System.out.println("ID del tiquete: ");
        System.out.println(tiq_vip1.getIdTiquete());
        System.out.println("Nombre del cliente:");
        System.out.println(tiq_vip1.getNombreCompleto());
        System.out.println("Direccion del cliente:");
        System.out.println(tiq_vip1.getDireccionResidencia());
        System.out.println("Estado de las pantallas del cliente:");
        for (boolean pantalla : tiq_vip1.getPantallas()){
            System.out.print(pantalla + ", ");
        }
        System.out.println("");
        System.out.println("Credenciales del cliente:");
        System.out.println(tiq_vip1.getCredenciales());
        System.out.println("Credenciales del cliente para la previa");
        System.out.println(tiq_vip1.getCredencialesPrevia());
        System.out.println("");
    }
}
