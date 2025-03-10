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
public class Asignatura {
    private String codigo;
    private String nombre;
    private int horasSemanales;
    private Profesor profesor;

    public Asignatura(String codigo, String nombre, int horasSemanales, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
        this.profesor = profesor;
    }
}
