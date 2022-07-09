/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package reto2.reto2_peaje;

/**
 *
 * @author Cristian Gonzalez
 */
public class Reto2_Peaje {        
            
    public static void main(String[] args) {
        String[] filaCoches = new String[]{"FNC901", "RBP250", "TPS706", "ITN503", "RSP845",
                                "SBL560", "IVD432", "LCS254", "ECT243", "RPL122",
                                "FRS484", "TLB884", "NFT948", "INS230", "ECB437",
                                "APQ260", "BSC602", "CRL622", "SNT254", "SGH442",
                                "GPI524"};
        
        Peaje taquillaPeaje = new Peaje(filaCoches);
        
        informacion(taquillaPeaje);
        
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        
        informacion(taquillaPeaje);
        
        taquillaPeaje.agregarCocheFlyPass();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();
        
        informacion(taquillaPeaje);
        
        taquillaPeaje.cambiarEstadoPeaje();
        taquillaPeaje.cambiarEstadoPeaje();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();
        
        informacion(taquillaPeaje);
    }
    
    public static void informacion(Peaje taquillaPeaje){
        
        for (String filaCoche : taquillaPeaje.getFilaCoches()) {
            System.out.print(filaCoche + ", ");
        }
        
        System.out.println("");
        
        for (String cochesFlyPass : taquillaPeaje.getCochesFlyPass()){
            System.out.print("'" + cochesFlyPass + "', ");
        }
        
        System.out.println("");
        
        System.out.println(taquillaPeaje.isEstadoPeaje());
        
        System.out.println(taquillaPeaje.getCocheEnAtencion());
        
        System.out.println(taquillaPeaje.getCantidadCochesAtendidos() + "\n");
        
    }
}
