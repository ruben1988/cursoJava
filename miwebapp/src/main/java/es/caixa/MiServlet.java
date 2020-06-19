package es.caixa;

import javax.servlet.http.*;

import javax.servlet.*;
import java.io.*;

public class MiServlet extends HttpServlet{
    
    // Peticion que hace el usuario       <- Tengo que leer la peticion (LECTURA)
    // HttpServletRequest
    
    // Respuesta que va a dar el servidor <- Yo la genero               (ESCRITURA)
    // HttpServletResponse
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email=req.getParameter("email");
        GestorUsuarios miGestor=new GestorUsuarios();

        Usuario usuario=miGestor.getUsuario(email);
            
        
        resp.setContentType("text/yaml");

        PrintWriter elTextoQueMandoAlCliente=resp.getWriter();
        
        elTextoQueMandoAlCliente.println("usuario:");
        elTextoQueMandoAlCliente.println("  nombre: "+usuario.getNombre());
        elTextoQueMandoAlCliente.println("  apellidos: "+usuario.getApellidos());
        elTextoQueMandoAlCliente.println("  edad: "+usuario.getEdad());
        elTextoQueMandoAlCliente.println("  email: "+usuario.getEmail());

        
    }
    
    public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email=req.getParameter("email");
        
        GestorUsuarios miGestor=new GestorUsuarios();
        Usuario usuario=miGestor.getUsuario(email);
        miGestor.borrarUsuario(usuario);

        resp.setContentType("text/yaml");
        PrintWriter elTextoQueMandoAlCliente=resp.getWriter();
        elTextoQueMandoAlCliente.println("estado: ok");

    }

}
