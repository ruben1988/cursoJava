
package codigo;
import java.util.List;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;


public class Servidor { // Definir mi tipo de dato nuevo
    
    // Propiedades
    public int numeroDeCpus;
    public int memoria;
    public int numeroDeDiscos;
    public String nombre;
    public List<String> ips;
    
    boolean enviarPing(String ipAddress) {
        try{
            InetAddress ipa = InetAddress.getByName(ipAddress);
            return ipa.isReachable(5000);
        }
        catch(UnknownHostException uhe){
            uhe.printStackTrace();
            return false;
        }
        catch(IOException ioe){
            ioe.printStackTrace();
            return false;
        }
        
    }

    
}


/*

    
    // Operaciones/Funciones
    
    // Contructores
    
    
    
    
*/
//Sesión


/*
3 //Numero: +-* cuadrado absoluto  |-4| = 4   raiz cuadrado, redondeo
Ivan //Texto: concatenar, tranformar a Mayusculas / Minusculas, recortarlo,
true //Valor lógico
*/
/*
enteros,
textos,
logicos, 
decimales,
fecha
fecha/hora
hora

cuenta corriente: saldo, ingreso, cargo
empleado: darle vacaciones, conocer edad, pagarle
*/