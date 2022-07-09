/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package reto2.reto2_turno_virtual;

/**
 *
 * @author Cristian Gonzalez
 */
public class Reto2_Turno_Virtual {

    public static void main(String[] args) {
        String[] cola = {"A0", "A1", "A2", "A3", "A5",
                         "A6", "A7", "A8", "A9", "A10",
                         "A11"};
        
        TurnoVirtual turnoVirtual1 = new TurnoVirtual(cola);
        
        informacion(turnoVirtual1);
        
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        
        informacion(turnoVirtual1);
        
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        
        informacion(turnoVirtual1);
        
        turnoVirtual1.cambiarEstadoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.cambiarEstadoTurno();
        
        informacion(turnoVirtual1);
    }
    
    public static void informacion(TurnoVirtual turnoVirtual1){
        
        for(String turno : turnoVirtual1.getTurnos()){
            System.out.print(turno + ", ");
        }
        
        System.out.println("");
        
        for(String perdido : turnoVirtual1.getTurnosPerdidos()){
            System.out.print(perdido + ", ");
        }
        System.out.println("");
        System.out.println(turnoVirtual1.isEstadoTurnoVirtual());
        
        System.out.println(turnoVirtual1.getTurnoEnAtencion());
        
        System.out.println(turnoVirtual1.getCantidadTurnosAtendidos());
        System.out.println("");
    }
}
