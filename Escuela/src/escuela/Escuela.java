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
public class Escuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creando profesores
        Profesor p1 = new Profesor("12345678A", "Juan Pérez", 3, 12);
        Profesor p2 = new Profesor("87654321B", "María López", 2, 15);

        // Creando asignaturas
        Asignatura a1 = new Asignatura("MAT101", "Matemáticas", 4, p1);
        Asignatura a2 = new Asignatura("HIS102", "Historia", 3, p2);

        // Creando curso
        Curso curso1 = new Curso("Desarrollo Web", "Aula 1");
        curso1.agregarAsignatura(a1);
        curso1.agregarAsignatura(a2);

        // Creando alumnos
        Alumno alumno1 = new Alumno("11111111C", "Carlos", "Gómez", curso1, false, 900);
        Alumno alumno2 = new Alumno("22222222D", "Ana", "Martínez", curso1, true, 900);

        curso1.agregarAlumno(alumno1);
        curso1.agregarAlumno(alumno2);

        // Verificando si el curso puede impartirse
        if (curso1.puedeImpartirse()) {
            System.out.println("El curso puede impartirse.");
        } else {
            System.out.println("El curso no puede impartirse.");
        }

        // Cálculo de ganancias
        double totalIngresos = alumno1.pagarMensualidad() + alumno2.pagarMensualidad();
        double totalGastos = p1.calcularSueldoMensual() + p2.calcularSueldoMensual();
        double gananciaBruta = totalIngresos - totalGastos;

        System.out.println("Ganancia bruta de la escuela: " + gananciaBruta + "€");
    }
    
}
