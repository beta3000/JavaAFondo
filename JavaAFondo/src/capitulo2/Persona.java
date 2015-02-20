
package capitulo2;

public class Persona {

    //atributos
    private String nombre;
    private String dni;
    private Fecha fechaNacimiento;
    
    //variable de estado
    private int cont = 0;
    
    public Persona(String nombre, String dni, Fecha fecNac){
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fecNac;
    }
    
    public String toString(){
        cont++;
        return nombre +", DNI: "+dni
                      +", nacido el: "+fechaNacimiento
                      +" ("+cont+")";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
}
