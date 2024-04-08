/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej1_poo;

/**
 *
 * @author pablo
 */
import java.util.*;
import java.util.regex.*;
public class Ej1_POO {
    public static void main(String[] args) {
   //Creamos Solicitamos el nombre del jugador
        Scanner scanner = new Scanner(System.in);
        //formato: Letra inicial del guerrero seguido de 4 dígitos. Ejemplo: G1234)"
        System.out.println("Introduce el nombre del grupo para los heroes:");
        String codigoGrupoHeroes = scanner.nextLine();
        if (!Utilidades.validaNombreGrupoHeroes(codigoGrupoHeroes)) {
            return;
        }

        // Inicializar personajes con el nombre validado
        Goku goku = new Goku("Goku", 100, false);
        Vegeta vegeta = new Vegeta("Vegeta", 60, false);
        Dende dende = new Dende("Dende", 60);
        Freezer freezer = new Freezer("Freezer", 85);

        System.out.println("");

        boolean isHeroesMuertos = false;
        boolean isFreezerMuerto = false;

        int contadorTurnos = 1;
        // Simular combate por turnos
        while (!isFreezerMuerto && !isHeroesMuertos) {
            System.out.println("TURNO:" + contadorTurnos);

            // Turno de los heroes
            isHeroesMuertos = heroesMuertos(goku, vegeta, dende);
            if (isHeroesMuertos) {
                mostrarVida(freezer, goku, vegeta, dende);
                break;
            }
            System.out.println("");
            System.out.println("- Turno de los heroes " + codigoGrupoHeroes);
            
            //Cada 3 turnos, Goku y vegeta se convierten en Supersaiyan y Dende cura
            if (contadorTurnos % 3 == 0) {
                goku.setSuperSaiyan(true);
                vegeta.setSuperSaiyan(true);
                if (!dende.isMuerto()) {
                    // Asumiendo que el sanador puede curar en lugar de atacar
                    dende.curar(goku);
                    dende.curar(vegeta);
                }
            } else {
                goku.setSuperSaiyan(false);
                vegeta.setSuperSaiyan(false);
            }

            if (!goku.isMuerto()) {
                if (goku.getSuperSaiyan()) {
                    goku.ataqueHeroico(freezer);
                } else {
                    goku.atacar(freezer);
                }
            }
            if (!vegeta.isMuerto()) {
                if (vegeta.getSuperSaiyan()) {
                    vegeta.ataqueHeroico(freezer);
                } else {
                    vegeta.atacar(freezer);
                }
            }
            // Turno de Freezer
            isFreezerMuerto = freezer.isMuerto();
            if (isFreezerMuerto) {
                mostrarVida(freezer, goku, vegeta, dende);
                break;
            }
            System.out.println("");
            System.out.println("- Turno de Freezer");
            if (contadorTurnos % 2 == 0) {
                freezer.ataqueHeroico(goku);
                freezer.ataqueHeroico(vegeta);
                freezer.ataqueHeroico(dende);
            } else {
                freezer.atacar(goku);
                freezer.atacar(vegeta);
                freezer.atacar(dende);
            }

            mostrarVida(freezer, goku, vegeta, dende);
            contadorTurnos++;
            System.out.println("");
        }

        System.out.println("");
        // Muestra el resultado del combate
        if (isFreezerMuerto) {
            System.out.print("Los heroes ganan");
        } else {
            System.out.print("Freezer gana");
        }
    }

    private static void mostrarVida(Freezer freezer, Goku goku, Vegeta vegeta, Dende dende) {
        System.out.println(
                "- Vida. Freezer: " + freezer.getVida()
                + ", Goku: " + goku.getVida()
                + ", Vegeta: " + vegeta.getVida()
                + ", Dende: " + dende.getVida());
    }

    private static boolean heroesMuertos(Goku goku, Vegeta vegeta, Dende dende) {
        return goku.isMuerto() && vegeta.isMuerto() && dende.isMuerto();
    }
}








