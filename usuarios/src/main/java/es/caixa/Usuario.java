package es.caixa;

public class Usuario{
    
    // Propiedades
    private String nombre;
    private String apellidos;
    private int edad;
    private String email; 
    // Constructores
    public Usuario(String email){
       setEmail(email);
    }
    // Funciones
    public void setEmail(String email){
        // Validaciones
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    
}