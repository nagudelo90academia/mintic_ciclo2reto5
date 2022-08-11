/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.edu.utp.ciclo2reto5;

import com.edu.utp.ciclo2reto5.view.VistaInformesReto4;
import java.awt.EventQueue;

/**
 *
 * @author NORBERTO AGUDELO 
 */
public class Ciclo2Reto5 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        
        //Ejecucion de Swing en un hilo
        EventQueue.invokeLater(new Runnable () {
            @Override
            public void run() {
                try {
                    VistaInformesReto4 vInformes = new VistaInformesReto4();
                    vInformes.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
