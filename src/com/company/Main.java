package com.company;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	String response;
    	boolean responseOut = true;
		System.out.println("*------------Menu del Torneo Palatino---------*");
		System.out.println("Introduzca el numero de la accion que desea realizar");
		while(responseOut) {
			System.out.println("1) Ingresar Datos de un Equipo.");
			System.out.println("2) Consultar Resumen.");
			System.out.println("3) Salir.");
			response = sc.next();

			switch (response) {
				case "1":
					responseOut = false;
					for (int i = 0; i < 50; ++i) System.out.println();
					Autoridades autoridades = new Autoridades();

					break;
				case "2":
					responseOut = false;
					for (int i = 0; i < 50; ++i) System.out.println();
					Torneo torneo = new Torneo();
					break;
				case "3":
					System.exit(0);
					break;

			}
		}
	}
}
