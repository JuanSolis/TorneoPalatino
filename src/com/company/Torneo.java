package com.company;
import com.company.Autoridades.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Torneo {
    private int totalGoles = 0;
    private int totalTirosEsquina = 0;
    private int totalTarjetasAmarillas = 0;
    private int TotalTarjetasRojas = 0;
    private String equipoConMasGoles = "";
    public Torneo() {
        System.out.println("*------------Resumen del Torneo---------*");
        menuTorneo();
    }

    public void menuTorneo() {
        Scanner sc = new Scanner(System.in);
        String response;
        boolean responseOut = true;
        System.out.println("Introduzca el numero de la accion que desea consultar");
        while(responseOut) {
            System.out.println("1) Cantidad total de goles.");
            System.out.println("2) Cantidad total de tiros de esquina.");
            System.out.println("3) Cantidad total de tarjetas amarillas.");
            System.out.println("4) Cantidad total de tarjetas rojas.");
            System.out.println("5) El equipo que más goles metió a lo largo del torneo.");
            System.out.println("6) Salir.");
            response = sc.next();
            switch (response) {
                case "1":
                    totalGoles();
                    break;
                case "2":
                    totalTirosEsquina();
                    break;
                case "3":
                    totalTarjetasAmarillas();
                    break;
                case "4":
                    TotalTarjetasRojas();
                    break;
                case "5":
                    equipoConMasGoles();
                    break;
                case "6":
                    ;responseOut = false;
                    String[] arguments = new String[] {"123"};
                    Main.main(arguments);
                    break;
            }
        }
    }

    public void totalGoles() {
        for (int i = 0; i <Autoridades.Equipos.size(); i++) {
            totalGoles += Autoridades.Equipos.get(i).getCantidadGoles();
        }
        System.out.println(totalGoles);
    }

    public void totalTirosEsquina() {
        for (int i = 0; i <Autoridades.Equipos.size(); i++) {
            totalTirosEsquina += Autoridades.Equipos.get(i).getCantidadTirosEsquina();
        }
        System.out.println(totalTirosEsquina);
    }

    public void totalTarjetasAmarillas() {
        for (int i = 0; i <Autoridades.Equipos.size(); i++) {
            totalTarjetasAmarillas += Autoridades.Equipos.get(i).getCantidadTarjetasAmarillas();
        }
        System.out.println(totalTarjetasAmarillas);
    }

    public void TotalTarjetasRojas() {
        for (int i = 0; i <Autoridades.Equipos.size(); i++) {
            TotalTarjetasRojas += Autoridades.Equipos.get(i).getCantidadTarjetasRojas();
        }
        System.out.println(TotalTarjetasRojas);
    }

    public void equipoConMasGoles() {
        int goles;
        int maxGoles;
        int indexEquipo = 0;
        Map<Integer,Integer> golesEquipo = new HashMap<>();
        for (int i = 0; i < Autoridades.Equipos.size(); i++) {
            goles = Autoridades.Equipos.get(i).getCantidadGoles();
            golesEquipo.put(i,goles);
            maxGoles = golesEquipo.get(i);
            for (int j = 0; j < golesEquipo.size(); j++) {
                if (golesEquipo.get(j) > maxGoles) {
                    equipoConMasGoles = Autoridades.Equipos.get(j).getNombreEquipo();
                    indexEquipo = j;
                }
                else {
                    indexEquipo = i;
                    equipoConMasGoles = Autoridades.Equipos.get(i).getNombreEquipo();
                }
            }
        }
            System.out.println(equipoConMasGoles + " Con "+Autoridades.Equipos.get(indexEquipo).getCantidadGoles()+" Goles");
        ;
    }

}
