package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Autoridades {
    private int cantidadEquipos;
    public Autoridades(){
        System.out.println("*------------Ingreso de Datos---------*");
        ingresoDeDatos();
    }

     public static ArrayList<Equipo> Equipos = new ArrayList<Equipo>();

    public void ingresoDeDatos(){
        Scanner sc = new Scanner(System.in);
        String response = "";
        cantidadEquipos = 0;
        boolean ingresoDatos = true;
        while(ingresoDatos) {
            Equipos.add(new Equipo());
            System.out.println("Nombre del Equipo");
            Equipos.get(Equipos.size()-1).setNombreEquipo(sc.next());
            /*System.out.println("Lugar que ocupó " + Equipos.get(Equipos.size()-1).getNombreEquipo().toString() + " en el torneo");
            Equipos.get(Equipos.size()-1).setLugarOcupadoTorneo(sc.next());*/
            System.out.println("Cantidad de tiros de Esquina");
            Equipos.get(Equipos.size()-1).setCantidadTirosEsquina(sc.nextInt());
            /*System.out.println("Cantidad de Juegos Ganados");
            Equipos.get(Equipos.size()-1).setCantidadJuegosGanados(sc.nextInt());
            System.out.println("Cantidad de Juegos Perdidos");
            Equipos.get(Equipos.size()-1).setCantidadJuegosPerdidos(sc.nextInt());
            System.out.println("Cantidad de Tiros a Gol");
            Equipos.get(Equipos.size()-1).setCantidadTirosAGol(sc.nextInt());*/
            System.out.println("Cantidad de Goles");
            Equipos.get(Equipos.size()-1).setCantidadGoles(sc.nextInt());
            System.out.println("Cantidad de Tarjetas Amarillas");
            Equipos.get(Equipos.size()-1).setCantidadTarjetasAmarillas(sc.nextInt());
            System.out.println("Cantidad de Tarjetas Rojas");
            Equipos.get(Equipos.size()-1).setCantidadTarjetasRojas(sc.nextInt());
/*            System.out.println("Cantidad de Faltas");
            Equipos.get(Equipos.size()-1).setCantidadFaltas(sc.nextInt());*/
            cantidadEquipos++;
            System.out.println("¿Desea seguir inscribiendo los datos de un equipo? s/n");
            response = sc.next();
            if (response.equals("n")) {
                ingresoDatos = false;
                String[] arguments = new String[] {"123"};
                Main.main(arguments);
            }
            if (cantidadEquipos > 10) {
                System.out.println("El maximo de equipos inscritos es de 10.");
            }
        }
    }

    public int getCantidadEquipos() {
        return cantidadEquipos;
    }

    public void setCantidadEquipos(int cantidadEquipos) {
        this.cantidadEquipos = cantidadEquipos;
    }
}
