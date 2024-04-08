/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1_poo;

/**
 *
 * @author pablo
 */
public class Freezer {
    private String nombre; 
    private int vida; 

    public Freezer(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void atacar (Goku goku){
        System.out.println("Freezer: Ataca a Goku");
        int danyo=20;
        Utilidades.calcularDanoCritico(danyo);
        goku.recibirDanyo(danyo);
        
    }
    public void atacar (Vegeta vegeta){
        System.out.println("Freezer: Ataca a vegeta" );
        int danyo=20;
        Utilidades.calcularDanoCritico(danyo);
        vegeta.recibirDanyo(danyo);
        
    }
    public void atacar (Dende dende){
        System.out.println("Freezer: Ataca a Dende" );
        int danyo=20;
        Utilidades.calcularDanoCritico(danyo);
        dende.recibirDanyo(danyo);
        
    }
    public void ataqueHeroico (Goku goku){
        System.out.println("Freezer: Golpe heroico. Bola de la muerte a nombrePersonaje");
        int danyo = 40;
        Utilidades.calcularDanoCritico(danyo);
        goku.recibirDanyo(danyo);
    }
    public void ataqueHeroico (Vegeta vegeta){
        System.out.println("Freezer: Golpe heroico. Bola de la muerte a nombrePersonaje");
        int danyo = 40;
        Utilidades.calcularDanoCritico(danyo);
        vegeta.recibirDanyo(danyo);
    }
    public void ataqueHeroico (Dende dende){
        System.out.println("Freezer: Golpe heroico. Bola de la muerte a nombrePersonaje");
        int danyo = 40;
        Utilidades.calcularDanoCritico(danyo);
        dende.recibirDanyo(danyo);
    }
    public void recibirDanyo (int danyo){
        if (Utilidades.esEsquivo()==false){
            this.vida-=danyo;
            System.out.println("Freezer: recibe 10 de daño");
        } else {
            this.vida=this.vida;
        }
        
    }
    public boolean isMuerto (){
        if (this.vida<0){
            System.out.println(nombre + ": Muerto");
            return true;
        }
        else {
            return false;
        }
    }
    
    
}
