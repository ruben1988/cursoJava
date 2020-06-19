package es.caixa;

public class App{
    
    public static void main( String[] args ){
        GestorUsuarios miGestor=new GestorUsuarios();

        // Dar de alta 2 usuarios en el gestor de usuarios (datos fijos)
        Usuario ivan=miGestor.newUsuario("ivan.osuna@gmail.com");
        ivan.setNombre("Ivan");
        ivan.setApellidos("Osuna");
        ivan.setEdad(42);
        miGestor.datosUsuarioModificados(ivan);
        
        Usuario antonio=miGestor.newUsuario("antonio@gmail.com");
        antonio.setNombre("Antonio");
        antonio.setApellidos("Lopez");
        antonio.setEdad(32);
        miGestor.datosUsuarioModificados(antonio);
        
        
        miGestor.borrarUsuario(ivan);

        
        // Recuperar 1 de ellos e imprimirlo por la consola
        Usuario paraConsultar=miGestor.getUsuario("antonio@gmail.com");
        System.out.println("Nombre: "+paraConsultar.getNombre());
        System.out.println("Apellidos: "+paraConsultar.getApellidos());
        System.out.println("Edad: "+paraConsultar.getEdad());
        System.out.println("Email: "+paraConsultar.getEmail());
    }
    
}
