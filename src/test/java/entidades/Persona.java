package entidades;

public class Persona {

    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private String genero;
    private int edad;


    public Persona(String nombre, String apellido, int anioNacimiento)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
    }

    public Persona(String nombre, int edad, String genero)
    {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String nombre(){return nombre;}
    public String apellido(){return this.apellido;}
    public int anioNacimiento(){return this.anioNacimiento;}
    public String genero(){return this.genero;}
    public int edad(){return this.edad;}
}
