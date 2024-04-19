public class Main {
    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    public void iniciar() {
        // Crear una nueva instancia de Persona
        Persona persona = new Persona("Juan", "Pérez", 30, "Masculino", "123 Calle Principal", "123456789", "juan@example.com", "Mexicana", "Soltero", "Ingeniero");

        System.out.println("Nombre completo: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Dirección: " + persona.getDireccion());
        System.out.println("Teléfono: " + persona.getTelefono());
        System.out.println("Correo electrónico: " + persona.getEmail());
        System.out.println("Nacionalidad: " + persona.getNacionalidad());
        System.out.println("Estado civil: " + persona.getEstadoCivil());
        System.out.println("Profesión: " + persona.getProfesion());
    }


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String direccion;
    private String telefono;
    private String email;
    private String nacionalidad;
    private String estadoCivil;
    private String profesion;

    // Constructor
    public Persona(String nombre, String apellido, int edad, String genero, String direccion, String telefono, String email, String nacionalidad, String estadoCivil, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.profesion = profesion;
    }
    // Métodos get/set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    
     }
    }
}
