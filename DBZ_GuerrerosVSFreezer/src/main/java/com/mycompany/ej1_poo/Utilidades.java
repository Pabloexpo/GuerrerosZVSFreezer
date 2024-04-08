/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1_poo;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pablo
 */
public class Utilidades {
     public static boolean validaNombreGrupoHeroes (String texto){
        Pattern p = Pattern.compile("^G[1-9][0-9][0-9][0-9]$");
        Matcher m = p.matcher(texto);
        if (m.matches()==true){
            return true;
        } else {
            System.out.println("Nombre del grupo incorrecto. Saliendo de la aplicación");
            return false;
        }
        
    }
    public static int calcularDanoCritico (int danyo){
        Random random = new Random(1234); //RETOCAR
        int numero= random.nextInt(10+1);
        
        if (numero <2){
            System.out.println("Golpe crítico");
            danyo *= 1.5;
            
        }
        return danyo;
    }
    public static boolean esEsquivo (){
        Random random = new Random(1234); //RETOCAR
        int numero= random.nextInt(10+1);
        if (numero<2) {
            System.out.println("Golpe esquivado");
            return true;
        } else {
            return false;
        }
        
    }
    
}
