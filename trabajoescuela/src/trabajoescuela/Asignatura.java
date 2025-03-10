package trabajoescuela;

import java.util.Scanner;

public class Asignatura{
    Scanner sc = new Scanner (System.in);
    private double horaSemana;
    private int Codigo;
    private String Nombre;
    private Docente Profe;
    
    public Asignatura(double numeroH, int cod, String nom, Docente profe){
        horaSemana = numeroH;
        Codigo = cod;
        Nombre = nom;
        Profe = profe;
    }
    public Asignatura(){
        
    }
    
    public void sethoraSemana(double numeroH){
        horaSemana = numeroH;
    }
    public double gethoraSemana(){
        return horaSemana;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int cod) {
        this.Codigo = cod;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nom) {
        this.Nombre = nom;
    }
    
    public Docente getProfe(){
        return Profe;
    }
    
    public void setProfe(Docente profe){
        Profe = profe;
    }
    
}
