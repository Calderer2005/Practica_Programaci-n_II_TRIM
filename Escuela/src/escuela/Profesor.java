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
public class Profesor {
    
    private String dni;
    private String nombre;
    private int numeroAsignaturas;
    private double sueldoHora;
    
    public Profesor(String dni, String nombre, int numeroAsignaturas , double sueldoHora){
        
        this.dni = dni;
        this.nombre = nombre;
        this.numeroAsignaturas = numeroAsignaturas;
        this.sueldoHora = Math.max(sueldoHora, 10);
        
    }
    
    public double calcularSueldoMensual(){
        
        return sueldoHora * 20 * 4;
        
    }
    
    public String getNombre(){
        
        return nombre;
        
    }
}
