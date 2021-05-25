package com.company;

import java.util.Scanner;

public class PantallaCrear {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Crear Nota");

        Nota nota = new Nota();

        System.out.println("Titulo Del Mensaje:");
        nota.titulo = Main.scanner.nextLine();

        System.out.println("Contenido Del Mensaje:");
        nota.contenido = Main.scanner.nextLine();

        Main.blocDeNotas.notas.add(nota);
    }
}
