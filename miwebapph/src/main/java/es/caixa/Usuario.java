package es.caixa;
import java.io.Serializable;

public class Usuario implements Serializable{
    
    // Propiedades
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String email; 
    
    // Constructores
    public Usuario(String nombre, String apellidos, Integer edad, String email){
       setNombre(nombre);
       setApellidos(apellidos);
       setEdad(edad);
       setEmail(email);
    }
    
    public Usuario(){
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
    public void setEdad(Integer edad){
        this.edad=edad;
    }
    public Integer getEdad(){
        return this.edad;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public Integer getId(){
        return this.id;
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                '}';
    }

    
}