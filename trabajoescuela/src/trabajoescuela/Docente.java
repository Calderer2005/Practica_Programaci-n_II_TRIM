package trabajoescuela;

import java.util.Scanner;

public class Docente {
    Scanner sc = new Scanner (System.in);
    private String DNI;
    private String Nombre;
    private int Sueldo;
    private int numAsignatura;

public Docente(String dni, String nombre, int sueldo, int numAsig){
    DNI = dni;
    Nombre = nombre;
    Sueldo = sueldo;
    numAsignatura = numAsig;
    
}
public Docente(){
    
}

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getSueldo() {
        return Sueldo;
    }
    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
    public int getNumAsignaturas() {
        return numAsignatura;
    }
    public void setNumAsignaturas(int numasig) {
        numAsignatura = numasig;
    
    }
}



