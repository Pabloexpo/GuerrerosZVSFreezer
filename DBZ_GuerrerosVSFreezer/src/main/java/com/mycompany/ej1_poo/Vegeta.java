/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1_poo;

/**
 *
 * @author pablo
 */
public class Vegeta {
    private String nombre; 
    private int vida;
    private boolean superSaiyan;

    public Vegeta(String nombre, int vida, boolean superSaiyan) {
        this.nombre = nombre;
        this.vida = vida;
        this.superSaiyan = superSaiyan;
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

    public boolean getSuperSaiyan() {
        return superSaiyan;
    }

    public void setSuperSaiyan(boolean superSayan) {
        System.out.println("Vegeta se convierte en SuperSaiyan");
        this.superSaiyan = superSaiyan;
    }
    public void atacar (Freezer freezer){
        System.out.println("Vegeta: Ataca");
        int danyo= Utilidades.calcularDanoCritico(10);
        freezer.recibirDanyo(danyo);
    }
    public void ataqueHeroico (Freezer freezer){
        System.out.println(nombre + ": Golpe Heroico. Onda vital!");
        int danyo= 20;
        Utilidades.calcularDanoCritico(danyo);
        freezer.recibirDanyo(danyo);
    }
    public void recibirDanyo (int danyo){
        if (Utilidades.esEsquivo()==false){
            this.vida-=danyo;
            System.out.println("Vegeta: recibe 10 de daño");
        } else {
            this.vida=this.vida;
        }
        
    }
    
    public void recibirCuracion (int cantidad){
        this.vida+= cantidad;
        System.out.println(this.nombre + "recibe 20 de vida por parte de Dende");
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
