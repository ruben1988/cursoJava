package es.caixa;

import java.util.Map;
import java.util.HashMap;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class GestorUsuarios{
    
//    private Map<String,Usuario> tablaUsuarios = new HashMap<String,Usuario>();
    
    public Usuario getUsuario(String email){
        //return tablaUsuarios.get(email);
        try{
            Connection miConexion=getConn();
            Statement miComando = (Statement) miConexion.createStatement();
            ResultSet resultadoQuery = miComando.executeQuery("SELECT nombre, apellidos, edad FROM usuarios WHERE email='"+email+"'");
            resultadoQuery.first();
            String nombre=resultadoQuery.getString(1);
            String apellidos=resultadoQuery.getString(2);
            int edad=resultadoQuery.getInt(3);
            
            // Ahora que tenemos todos los datos, creamos el usuario en JAVA
            Usuario usuario=new Usuario(email);
            usuario.setNombre(nombre);
            usuario.setApellidos(apellidos);
            usuario.setEdad(edad);
            return usuario;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }
    
    public Usuario newUsuario(String email){
        try{
            Usuario nuevoUsuario=new Usuario(email);
            //nuevoUsuario.setEmail(email);
            //tablaUsuarios.put(email,nuevoUsuario);
            
            // Conecte con mariadb y de de alta el usuario en la tabla usuarios
            Connection miConexion=getConn();
            Statement miComando = (Statement) miConexion.createStatement();
            miComando.executeUpdate("INSERT INTO usuarios (email) VALUES ('"+email+"')");
            
            System.out.println("INSERT INTO usuarios (email) VALUES ('"+email+"')");
            
            miConexion.close();
            
            return nuevoUsuario;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public void borrarUsuario(Usuario modificado){
        try{
            
            Connection miConexion=getConn();
            Statement miComando = (Statement) miConexion.createStatement();
            miComando.executeUpdate("DELETE FROM usuarios WHERE email='"+modificado.getEmail()+"'");
            
            System.out.println("DELETE FROM usuarios WHERE email='"+modificado.getEmail()+"')");
            
            miConexion.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void datosUsuarioModificados(Usuario modificado){
        try{
            Connection miConexion=getConn();
            Statement miComando = (Statement) miConexion.createStatement();
            miComando.executeUpdate("UPDATE usuarios SET nombre='"+modificado.getNombre()+"', apellidos='"+modificado.getApellidos()+"', edad='"+modificado.getEdad()+"' WHERE email='"+modificado.getEmail()+"'");
            System.out.println("UPDATE usuarios SET nombre='"+modificado.getNombre()+"', apellidos='"+modificado.getApellidos()+"', edad='"+modificado.getEdad()+"' WHERE email='"+modificado.getEmail()+"'");
            
            miConexion.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /*Connection getConn(){
        try{
            Class.forName("org.mariadb.jdbc.Driver"); // Dar de alta el driver MARIADB
            Connection conn = DriverManager.getConnection("jdbc:mariadb://mariadb/usuarios", "root", "password");
            return conn;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }*/
    Connection getConn(){
        try{
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mimariadb");
            Connection conn = ds.getConnection();    
            return conn;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

}