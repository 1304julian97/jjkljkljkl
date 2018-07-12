package entidades;

public class Persona {

    private String nombre;
    private String apellido;
    private int anioNacimiento;


    public Persona(String nombre, String apellido, int anioNacimiento)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
    }


    public String nombre(){return nombre;}
    public String apellido(){return apellido;}
    public int anioNacimiento(){return anioNacimiento;}
}
