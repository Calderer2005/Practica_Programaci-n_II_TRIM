package trabajoescuela;

import java.util.Scanner;


public class Trabajoescuela {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*variables*/
        Asignatura asignatura;
        Docente docente;
        Alumno alumno;
        Curso curso;
        
        int numaulas;
        int numcursos;
        int numalumnos;
        int numdocentes;
        int numasignaturas;
        
        NombreAsignatura[] NomAsig =  NombreAsignatura.values(); //Si quiero comprobar que me escriba las asignaturas lo puedo poner en un for.
        
        Curso[] Cursos;
        Asignatura[] Asignaturas;
        Docente[] Docentes;
        Alumno[] Alumnos;
        
        /*Esto muestra el nombre de todas las clases*/
         for (int i = 0; i < NomAsig.length; i++) {
            System.out.println(formatearNombreAsig(NomAsig[i]));
        }
        
        /*CREAMOS AULAS*/
        do{
            System.out.println("Di las aulas que hay");
            numaulas = sc.nextInt();
            if(numaulas < 0){
                System.out.println("Tiene que haber mínimo una clase");
            }
        }while (numaulas < 0);        
        
            /*CREAMOS CURSOS*/  
        do{
            System.out.println("Di los cursos que hay");
            numcursos = sc.nextInt();
            
            if(numcursos > numaulas || numcursos <= 0)System.out.println("Dato invlido");
            
        }while (numcursos > numaulas || numcursos <=0);
        Cursos = new Curso[numcursos]; 
      
        
        /*CREAMOS ALUMNOS*/
        do{
            System.out.println("Di los alumnos que hay");
            numalumnos = sc.nextInt();
            if(numalumnos > numcursos * 30 || numalumnos <= 0)System.out.println("Dato invlido");
            
        }while (numalumnos > numcursos *30 || numalumnos <= 0);
        Alumnos = new Alumno[numalumnos];
    
        
        /*CREAMOS ASIGNATURAS*/
        do{
            System.out.println("Di la cantidad de asignaturas que hay");
            numasignaturas = sc.nextInt();
            if(numasignaturas > 17 || numasignaturas <= 0) System.out.println("Dato invalido");
        
        }while (numasignaturas > 17 || numasignaturas <= 0);
        Asignaturas = new Asignatura[numasignaturas];
        
        
        /*CREAMOS DOCENTES*/
        do{
            System.out.println("Di los docentes que hay");
            numdocentes = sc.nextInt();
            
            if(numdocentes > numasignaturas || numdocentes <= 0) System.out.println("Dato invalido");
        
            }while (numdocentes > numasignaturas || numdocentes <= 0);
        Docentes = new Docente[numdocentes];
        
        
        
        // ALUMNOS //
        System.out.println("Introduce los alumnos");
        
        for (int i = 0; i < Alumnos.length; i++) {
            Alumnos[i] = pedirAlumno();
        }
    }
    
        
    
    
    
    
    
    
        /*PEDIMOS  LOS DATOS DEL ALUMO AL USUARIO*/
    
    public static Alumno pedirAlumno(){
        Scanner sc = new Scanner(System.in);
        String DNI;
        String tipTarifa;
        
        boolean comprobar;
        Alumno alumno = new Alumno();
        
                /*Pido DNI*/
        do{
            
           System.out.println("Inroduce el DNI: ");
        DNI = sc.nextLine();
        comprobar = validarDNI(DNI);
        
        if(!comprobar)System.out.println("DNI incorrecto");
        
        }while (!comprobar);
        alumno.setDNI(DNI); 
        
             /*Pido nombre*/
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        alumno.setNombre(nombre);
        
            /*Pido tarifa*/
        do{
            System.out.println("Introduce la tarifa. Tiene que ser o meses o anual ");
            tipTarifa = sc.nextLine();
            if (!tipTarifa.equals("meses")  || !tipTarifa.equals("anual") );
            System.out.println("Dato inválido");
            
        } while (tipTarifa.equals("meses")  || tipTarifa.equals("anual") );        
        if (tipTarifa == "meses") alumno.setTarifaPlazo(true);
        else alumno.setTarifaPlazo(false);
      
        return alumno;
       
   }
    public static Docente pedirDocente(){
        Scanner sc = new Scanner(System.in);
        Docente docente = new Docente();
        
        String DNI;
        String nombre;
        int numAsignaturas;
        int sueldo;
        
        boolean comprobar;
        
        /*Pido DNI*/
        
        do {
            System.out.println("Introduce el DNI");            
            DNI = sc.nextLine();
            
            comprobar = validarDNI(DNI);
            
        } while (!comprobar);
        docente.setDNI(DNI);
        
        /*Pido nombre*/
        
        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();        
        docente.setNombre(nombre);
        
        /*Pido numero de Asignatura*/
        
        do {
            System.out.println("Introduce la cantidad de asignaturas");
            numAsignaturas = sc.nextInt();
        
            if (numAsignaturas <= 0) System.out.println("Un docente no puede tener 0 o menos asignaturas");
        
        } while (numAsignaturas <= 0);        
        docente.setNumAsignaturas(numAsignaturas);
        
                /*Pido Sueldo*/

        do {
            System.out.println("Introduce la sueldo por hora");
            sueldo = sc.nextInt();
            
            if (sueldo < 10) System.out.println("El sueldo tiene que ser 10");
        } while (sueldo < 10);        
        docente.setSueldo(sueldo);
        
        //---// RETURN //---// No se le pide las asignaturas porque no estan introducidas, y se pide despues porque las asignaturas necesitan un docente
        
        return docente;
    }
    
    public static Asignatura pedirAsignatura(Docente[] docentes, int codAsignatura, NombreAsignatura[] nombreAsignaturas){
        Scanner sc = new Scanner(System.in);
        
        int numHorasSemanales;
        String DNI;
        int posicionDocente = 0; // no tiene porque estar igualado a 0 porque siempre va que se haga el algoritmo va a estar asignado pero bueno
        String nombre;
        
        boolean comprobar = false;
        Asignatura asignatura = new Asignatura();
        
        //---// CODIGO //---//
        
        System.out.println("El codigo de la asignatura es " + codAsignatura);
        asignatura.setCodigo(codAsignatura);
        
        //---// HORAS SEMANALES //---//
        
        do {
            System.out.println("Introduce el numero de horas semanales");
            numHorasSemanales = sc.nextInt();
            
            if (numHorasSemanales <= 0) System.out.println("No puede tener 0 o menos horas semanales");
            
        } while (numHorasSemanales <= 0);
        asignatura.sethoraSemana(numHorasSemanales);
        
        //---// DOCENTE ASIGNADO //---//
        
        do { // aqui comprobar tiene que ser = false
            System.out.println("Introduce el profesor mediante su DNI. Para ver la lista de profesores, introduce \"mostrar\"");
            DNI = sc.nextLine();
            
            if (DNI.equals("mostrar")) {
                
                for (int i = 0; i < docentes.length; i++) {
                    System.out.println(docentes[i].getDNI() + " - " + docentes[i].getNombre());
                }
                
            }else{
                boolean es = false;
                
                comprobar = validarDNI(DNI);
            
                if (!comprobar){
                    System.out.println("El DNI introducido es invalido");
                }else{
                    do {
                        for (int i = 0; i < docentes.length || es != true; i++) {
                            String DNIaux = docentes[i].getDNI();

                            if (DNI.equals(DNIaux)) {
                                es = true;
                                posicionDocente = i;
                            }                            
                        }

                        if (!es) System.out.println("El DNI no se encontro entre los profesores");
                    } while (!es);
                }
            }            
        } while (!comprobar);        
        asignatura.setProfe(docentes[posicionDocente]);
        
        //---// NOMBRE //---//
        
        do {
            comprobar = false;
            
            System.out.println("Elige el nombre de la asignatura entre:");
            
            for (int i = 0; i < nombreAsignaturas.length; i++) {
                System.out.println(nombreAsignaturas[i]);
            }
            
            nombre = sc.nextLine();
            
            for (int i = 0; i < nombreAsignaturas.length; i++) {
                
            }
            
            if (!comprobar) System.out.println("El nombre de la asignatura introducida no se encuentra disponible");
            
        } while (!comprobar);        
        asignatura.setNombre(nombre);
        
        //---// RETURN //---//
        
        return asignatura;
    } 
    
    
    public static void generaAlumno(int cant){
        String nom = "";
        String apellidos = "";
        String dni = "";
        
        Nombres[] listaNom = Nombres.values();
        Apellidos[] listaApe = Apellidos.values();
        
        int nAle1;
        int topeNom = listaNom.length;
        
        int nAle2;
        int nAle3;
        int topeApe = listaApe.length;
        
        for(int i = 0; i < cant; i++){
            nAle1 = (int) (Math.random()*(topeNom-1));
            nAle2 = (int) (Math.random()*(topeApe-1));
            nAle3 = (int) (Math.random()*(topeApe-1));
            
            nom = listaNom[nAle1].toString();
            apellidos = listaApe[nAle2].toString() + " " + listaApe[nAle3].toString();
            
            dni = generaDNI();
            
            //Aquí teneis que llamar al constructor de Alumno y añadirlo a la lista
            
            System.out.println(nom + " " + apellidos + " " + dni);
        }

    }
    public static String generaDNI(){
        char[] LETRASDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
        int suma = 0;
        int aux = 0;
        String dni = "";
        
        for(int i = 0; i < 8; i++){
            aux = (int)(Math.random()*9);
            dni += aux;
            suma += aux;
        }
        
        dni += (char)LETRASDNI[suma%23];
        
        return dni; 
    }

    
    
    
    
    
    
    
    
    
    
    
    
    public static boolean validarDNI(String DNI){
        boolean correcto = true;
        char letra;
        
        if (DNI.length() == 9) {
            
            for (int i = 0; i < 7|| correcto == false; i++) {
                
                letra = DNI.charAt(i);                
                if (letra < '0' || letra > '9') correcto = false;                
            }
            
            letra = DNI.charAt(8);
            if (letra < 'A' || letra > 'z' || correcto == false) correcto = false;
            
        }else correcto = false;
        
        return correcto;
    }
    
    /*ESTO ES PARA QUE CUANDO PONGA LAS CLASES DEL ENUM LAS PALABRAS SE SEPARAN*/
    
    public static String formatearNombreAsig(NombreAsignatura nombre){
        String formateado = "";
        String nombreS = "" + nombre;
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for(int i = 0; i < nombreS.length(); i++){
            String letra = "" + nombreS.charAt(i);
            if(mayus.contains(letra) && i != 0){
                formateado += " " +  letra; 
            }else{
                formateado += letra;
            }
        }        
        return formateado;
    }
    
    
}
