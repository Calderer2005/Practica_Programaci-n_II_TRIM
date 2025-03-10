package trabajoescuela;

import java.util.Scanner;


public class Alumno {
     Scanner sc = new Scanner (System.in);
     private String DNI;
     private String Nombre;
     private int Tarifa;
     private boolean tarifaPlazo;
     
     public Alumno(String dni, String nombre, int tarifa){
    DNI = dni;
    Nombre = nombre;
    Tarifa = tarifa;
    }
    public Alumno(){
        
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

    public int getTarifa() {
        return Tarifa;
    }

    public void setTarifa(int tarifa) {
        this.Tarifa = tarifa;
    }

    public boolean isTarifaPlazo() {
        return tarifaPlazo;
    }

    public void setTarifaPlazo(boolean tarifaPlazo) {
        this.tarifaPlazo = tarifaPlazo;
    }
    
    
     
}

