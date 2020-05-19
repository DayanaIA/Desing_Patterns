/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_singleton;

/**
 *
 * @author Dayana Agudo G
 */
public class Conexion {
    
    private static Conexion conexion;
    
    private Conexion (){
        
    }
    
    public static Conexion getInstancia (){
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;
    }
    
    public void conectar (){
        System.out.println("Conectado!");
    }
    
    public void desconectar() {
        System.out.println("Desconectado!");
    }
}
