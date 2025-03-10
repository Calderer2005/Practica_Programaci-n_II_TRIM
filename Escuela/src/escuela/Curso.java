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
public class Curso {
    private String nombre;
    private ArrayList<Asignatura> asignaturas;
    private String aula;
    private ArrayList<Alumno> alumnos;

    public Curso(String nombre, String aula) {
        this.nombre = nombre;
        this.aula = aula;
        this.asignaturas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public void agregarAsignatura(Asignatura asignatura) {
        if (asignaturas.size() < 5) {
            asignaturas.add(asignatura);
        } else {
            System.out.println("El curso ya tiene 5 asignaturas.");
        }
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (alumnos.size() < 30) {
            alumnos.add(alumno);
            return true;
        } else {
            System.out.println("Grupo completo, no se pueden agregar más alumnos.");
            return false;
        }
    }

    public boolean puedeImpartirse() {
        return alumnos.size() >= 10 && asignaturas.size() == 5;
    }
}
