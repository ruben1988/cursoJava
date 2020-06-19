
package codigo;
import java.util.ArrayList;

public class Programa { 
    
    public static void main(String[] args){ 
        int numeroA; // Referencia a un dato en memoria ram
        numeroA=5;
        
        int numeroB=7;
        
        // 1ª: Poner el numero 7 (DATO) en la memoria RAM
        // 2ª: Definir una variable: Referencia a cosas (NUMERO ENTEROS) que ponga en la memoria RAM
        // 3º: Asignar una referencia al número 7 recién creado
        
        int numeroC=numeroB;
        //AQUI
        numeroB=3;
        // PODRIA entrar el colector basura y borrar el 7
        //System.gc()

        System.out.println(numeroA+numeroB); 
        // System.out.println("Hola"); 
        
        Servidor servidorBDProd;  // Variable (Post-it)
        servidorBDProd=new Servidor(); // Crea un nuevo dato (servidor) en la RAM
        servidorBDProd.nombre="local";
        servidorBDProd.numeroDeCpus=2;
        servidorBDProd.memoria=4000;
        servidorBDProd.numeroDeDiscos=1;
        servidorBDProd.ips=new ArrayList<String>();
        servidorBDProd.ips.add("127.0.0.1");
        servidorBDProd.ips.add("172.31.45.101");
        
        System.out.println(servidorBDProd.nombre);
        System.out.println(servidorBDProd.numeroDeCpus);
        System.out.println(servidorBDProd.memoria);
        System.out.println(servidorBDProd.ips);
        
        for(String unaIP : servidorBDProd.ips){
            boolean resultadoPing=servidorBDProd.enviarPing( unaIP );
            System.out.println("Prueba de ping: " + unaIP + " -> " + resultadoPing);
        }

    }
    
}
