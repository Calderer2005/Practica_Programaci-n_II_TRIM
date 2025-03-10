package trabajoescuela;

import java.util.Scanner;


public class Curso {
        Scanner sc = new Scanner (System.in);
        private int Codigo;
        private Asignatura[] Asignaturas;
        private String Aula;
        private Alumno[] Alumno;
        private double Tarifa;
        private int Anio;
        
    public Curso (int codigo, Asignatura[] asignatura, String aula, Alumno[] alumno, double tarifa, int anio){
        Codigo = codigo;
        Asignaturas = asignatura;
        Aula = aula;
        Alumno = alumno;
        Tarifa = tarifa;
        Anio = anio;
    }
    public Curso(){
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public Asignatura[] getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignatura) {
        this.Asignaturas = asignatura;
    }

    public String getAula() {
        return Aula;
    }

    public void setAula(String aula) {
        this.Aula = aula;
    }

    public Alumno[] getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno[]alumno) {
        this.Alumno = alumno;
    }

    public double getTarifa() {
        return Tarifa;
    }

    public void setTarifa(double Tarifa) {
        this.Tarifa = Tarifa;
    }

            


}



