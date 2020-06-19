package es.caixa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest extends TestCase{
    
    public AppTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    public void testApp1(){
        int resultado=App.suma(4,8);
        assertEquals(resultado,12);
    }
    public void testApp2(){
        int resultado=App.suma(4,-8);
        assertEquals(resultado,-4);
    }
    public void testApp3(){
        int resultado=App.suma(1,0);
        assertEquals(resultado,1);
    }
    public void testApp4(){
        int resultado=App.suma(-2,-3);
        assertEquals(resultado,-5);
    }
}
// Paso 1: Montar pruebas automatizadas: Casos de prueba. Este fichero
// ------- DEVOPS 
// Paso 2 [IC]: Montar un servidor de CI (Jenkins): Instalar el codigo de los desarrolladores
           // Entorno de integración y ejecutar automaticamente las pruebas
           // Bamboo (Atlassian: Jira, Confluence, Bitbucket)
           // Jetbrains ( Intellij, android studio): TeamCity
           // TravisCI
           // Azure devops
// Paso 3 [CD]: Continuous Delivery: Jenkins (Entrega continua)
    // Tomar los que está instalado dentro integración, y llevarlo a un repo de artifactos:
    // Nexus, Artefactory
// Paso 4 [CD]: Continuous Deployment: Instalación en un entorno productivo