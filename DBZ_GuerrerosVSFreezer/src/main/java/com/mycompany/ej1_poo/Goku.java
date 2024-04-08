/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1_poo;

/**
 *
 * @author pablo
 */
class Goku {
    private String nombre; 
    private int vida; 
    private boolean superSaiyan;

    public Goku() {
    }

    public Goku(String nombre, int vida, boolean superSaiyan) {
        this.nombre = nombre;
        this.vida = vida;
        this.superSaiyan = superSaiyan;
    }
    
    public Goku (Goku goku){
        this.nombre= goku.nombre;
        this.vida=goku.vida;
        this.superSaiyan=goku.superSaiyan;
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

    public void setSuperSaiyan(boolean superSaiyan) {
        System.out.println("Goku se convierte en SuperSaiyan");
        this.superSaiyan = superSaiyan;
    }
    public void atacar (Freezer freezer){
        System.out.println("Goku: Ataca");
        int danyo= Utilidades.calcularDanoCritico(10);
        
        freezer.recibirDanyo(danyo);
    }
    public void ataqueHeroico (Freezer freezer){
        int danyo=10;
        freezer.recibirDanyo(danyo);
        freezer.recibirDanyo(danyo);
        freezer.recibirDanyo(danyo);
        
    }
    public void recibirDanyo (int danyo){
        if (!Utilidades.esEsquivo()){
            this.vida-=danyo;
            System.out.println("Goku: recibe 10 de daño");
        }
        
        
    }
    public void curacion (int cantidad){
        this.vida+= cantidad;
        System.out.println("Goku: recibe 20 de vida por parte de Dende");
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
