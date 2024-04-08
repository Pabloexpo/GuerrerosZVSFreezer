/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1_poo;

/**
 *
 * @author pablo
 */
public class Dende {
    private String nombre;
    private int vida;

    public Dende(String nombre, int vida) {
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
    public void curar (Goku personaje){
        int curacion=20;
        personaje.curacion(vida);  
    }
    public void curar (Vegeta personaje){
        int curacion=20;
        personaje.recibirCuracion(vida);  
    }
    public void recibirDanyo (int danyo){
        if (Utilidades.esEsquivo()==false){
            this.vida-=danyo;
            System.out.println("Dende: recibe 10 de daño");
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
