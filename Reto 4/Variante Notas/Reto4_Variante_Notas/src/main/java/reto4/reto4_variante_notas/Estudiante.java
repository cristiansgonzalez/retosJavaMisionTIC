/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4.reto4_variante_notas;

/**
 *
 * @author Cristian Gonzalez
 */
class Estudiante {
    // ATRIBUTOS
    private String nombreCompleto;
    private String documentoIdentidad;
    private double nota;
    private int grado;
    private int edad;
    
    // CONSTRUCTOR
    public Estudiante(String nombreCompleto, String documentoIdentidad, double nota,
                      int grado, int edad){
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.nota = nota;
        this.grado = grado;
        this.edad = edad;       
    }
    
    //GETTERS

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public double getNota() {
        return nota;
    }

    public int getGrado() {
        return grado;
    }

    public int getEdad() {
        return edad;
    }
    
    //SETTERS

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
