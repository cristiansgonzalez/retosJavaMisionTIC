/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package reto4.reto4_variante_carrera;

import java.util.ArrayList;

/**
 *
 * @author Cristian Gonzalez
 */
public class Reto4_Variante_Carrera {
    
    double promedio;
    String nombreCorredorMenorTiempo;
    double menorTiempo;
    String nombreCorredorMayorTiempo;
    double mayorTiempo;
    
    public Reto4_Variante_Carrera(ArrayList<Corredor> carrera){
        this.promedio = 0;
        this.nombreCorredorMenorTiempo = null;
        this.menorTiempo = carrera.get(0).getTiempoMeta();
        this.nombreCorredorMayorTiempo = null;
        this.mayorTiempo = carrera.get(0).getTiempoMeta();
    }
    
    public static void main(String[] args) {
        ArrayList<Corredor> carrera = new ArrayList<Corredor>();
        
        carrera.add(new Corredor("Luis Gomez", "12", 1.68, 20, 22));
        //carrera.add(new Corredor("Julian Corredor", "28", 1.75, 24, 21));
        //carrera.add(new Corredor("Carlos Perez", "19", 1.71, 28, 24));
        //carrera.add(new Corredor("Maria Cadavid", "13", 1.80, 32, 22));
        
        
        reporte(carrera);
    }
    
    public static Object[] reporte(ArrayList<Corredor> carrera){
        //Object[] salidas;
        //Reto4_Variante_Carrera datos = new Reto4_Variante_Carrera(carrera);
        double promedio = 0;
        double menorTiempo = carrera.get(0).getTiempoMeta();
        String nombreCorredorMenorTiempo = null;
        double mayorTiempo = carrera.get(0).getTiempoMeta();
        String nombreCorredorMayorTiempo = null;
        
        for(int i = 0; i < carrera.size(); i++){
            promedio = promedio + carrera.get(i).getTiempoMeta();
            if(menorTiempo >= carrera.get(i).getTiempoMeta()){
                menorTiempo = carrera.get(i).getTiempoMeta();
                nombreCorredorMenorTiempo = carrera.get(i).getNombreCompleto();
            }
            if(mayorTiempo <= carrera.get(i).getTiempoMeta()){
                mayorTiempo = carrera.get(i).getTiempoMeta();
                nombreCorredorMayorTiempo = carrera.get(i).getNombreCompleto();
            }
                
        }
        promedio = promedio / carrera.size();
        System.out.println("Promedio: " + promedio);
        System.out.println("Nombre corredor menor tiempo: " + nombreCorredorMenorTiempo);
        System.out.println("Menor Tiempo: " + menorTiempo);
        System.out.println("Nombre corredor mayor tiempo: " + nombreCorredorMayorTiempo);
        System.out.println("Mayor Tiempo: " + mayorTiempo);
        
        
        Object[] salidas = {promedio,nombreCorredorMenorTiempo, menorTiempo,nombreCorredorMayorTiempo,mayorTiempo};
        return salidas;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getNombreCorredorMenorTiempo() {
        return nombreCorredorMenorTiempo;
    }

    public double getMenorTiempo() {
        return menorTiempo;
    }

    public String getNombreCorredorMayorTiempo() {
        return nombreCorredorMayorTiempo;
    }

    public double getMayorTiempo() {
        return mayorTiempo;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setNombreCorredorMenorTiempo(String nombreCorredorMenorTiempo) {
        this.nombreCorredorMenorTiempo = nombreCorredorMenorTiempo;
    }

    public void setMenorTiempo(double menorTiempo) {
        this.menorTiempo = menorTiempo;
    }

    public void setNombreCorredorMayorTiempo(String nombreCorredorMayorTiempo) {
        this.nombreCorredorMayorTiempo = nombreCorredorMayorTiempo;
    }

    public void setMayorTiempo(double mayorTiempo) {
        this.mayorTiempo = mayorTiempo;
    }
    
    
}
