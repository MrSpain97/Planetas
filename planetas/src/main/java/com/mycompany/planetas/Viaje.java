/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.planetas;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Viaje {
    
    // Declarración de variables a utilizar
    String planeta;
    double m, f;
    char N;

    public void calculoPlaneta() {
        
        // Apertura del ciclo
        do {
            System.out.println("Por favor ingresa el nombre de un planeta para comenzar el cálculo\n1.Marte\n2.Tierra\n3.Jupiter\n4.Saturno\n5.Pluton\n6.Neptuno\nEscriba aquí:");
            Scanner st = new Scanner(System.in);
            planeta = st.nextLine();
            
            // Apertura del ciclo switch para elegir 
            switch (planeta) {

                case "Marte","marte","1":

                    System.out.println("\n Ingrese la masa en 'Kg' para calcular su peso en marte");
                    Scanner sr = new Scanner(System.in);
                    this.m = sr.nextDouble();
                    // operación cálculo de Marte usando la segunda ley de Newton
                    this.f = m * (3.72);
                    // se envía a imprimir
                    System.out.println("El peso del astronauta en marte es de: " + this.f + "N");
                    break;
                case "Tierra","tierra","2":

                    System.out.println("\n Ingrese la masa en 'Kg' para calcular su peso en la tierra");
                    Scanner sq = new Scanner(System.in);
                    this.m = sq.nextDouble();
                    // operación cálculo de Tierra usando la segunda ley de Newton
                    this.f = m * (9.81);
                    // se envía a imprimir
                    System.out.println("El peso del astronauta en tierra es de: " + this.f + "N");
                    break;
                case "Jupiter","jupiter","3":

                    System.out.println("\n Ingrese la masa en 'Kg' para calcular su peso en jupiter");
                    Scanner sw = new Scanner(System.in);
                    this.m = sw.nextDouble();
                    // operación de cálculo Jupiter usando la segunda ley de Newton
                    this.f = m * (24.79);
                    // se envía a imprimir
                    System.out.println("El peso del astronauta en jupiter es de: " + this.f + "N");
                    break;
                case "Saturno","saturno","4":

                    System.out.println("\n Ingrese la masa en 'Kg' para calcular su peso en saturno");
                    Scanner se = new Scanner(System.in);
                    this.m = se.nextDouble();
                    // operación de cálculo Saturno usando la segunda ley de Newton
                    this.f = m * (10.44);
                    // se envia a imprimir
                    System.out.println("El peso del astronauta en saturno es de: " + this.f + "N");
                    break;
                case "Pluton","pluton","5":

                    System.out.println("\n Ingrese la masa en 'Kg' para calcular su peso en pluton");
                    Scanner sy = new Scanner(System.in);
                    this.m = sy.nextDouble();
                    // operación cálculo de Pluton usando la segunda ley de Newton
                    this.f = m * (0.62);
                    // se envía a imprimir
                    System.out.println("El peso del astronauta en pluton es de: " + this.f + "N");
                    break;
                    case "Neptuno","neptuno","6":

                    System.out.println("\n Ingrese la masa en 'Kg' para calcular su peso en neptuno");
                    Scanner sy = new Scanner(System.in);
                    this.m = sy.nextDouble();
                    // operación cálculo de Neptuno usando la segunda ley de Newton
                    this.f = m * (11.15);
                    // se envía a imprimir
                    System.out.println("El peso del astronauta en neptuno es de: " + this.f + "N");
                    break;


            }
            // solicitud para continuar o cerrar
            System.out.println("\n¿Quiere continuar?");
            this.N = st.next().charAt(0);// mensaje de salida
        } while (N != 'n' && N != 'N');// cierre del ciclo
        System.out.println("\nUsted ha salido del Sistema");

    }

}
