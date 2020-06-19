package codigo;
import java.util.Map;
import java.util.HashMap;


public class Programa2 { 
    
    public static void main(String[] args){ 
        /*List<String> listaTextos;
        listaTextos=new ArrayList<String>();*/
        
        Map<String,String> textos = new HashMap<String,String>();
        /*try {
            Thread.sleep(30000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }*/

        
        for(int numero=1; numero < 5; numero++){
            textos.put("CLAVE_"+numero, "VALOR_"+numero);
        }
        
        System.out.println(textos);
    }
    
}