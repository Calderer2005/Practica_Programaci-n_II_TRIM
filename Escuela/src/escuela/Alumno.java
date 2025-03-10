/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

/**
 *
 * @author EAG
 */
public class Alumno {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private Curso curso;
    private boolean pagoCompleto;
    private double deuda;

    public Alumno(String dni, String nombre, String apellidos, Curso curso, boolean pagoCompleto, double precioCurso) {
        
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.pagoCompleto = pagoCompleto;
        
        this.deuda = pagoCompleto ? 0 : precioCurso;
    }

    public double pagarMensualidad() {
        
        if (!pagoCompleto) {
        
            double cuota = deuda / 9;
            deuda -= cuota;
            return cuota;
        
        }
        
        return 0;
    
    }
}
