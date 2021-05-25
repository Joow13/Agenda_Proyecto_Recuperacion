package com.company;
import java.io.File;
import java.util.Scanner;

public class PantallaMenu {
    Titulo titulo = new Titulo();
        titulo.mostrar("Bloc De Notas");

    Menu menu = new Menu();
    String[] opciones = {"Crear", "Listar", "Salir"};
    String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
        PantallaCrear pantallaCrear = new PantallaCrear();
        pantallaCrear.mostrar();
    } else if("2".equals(opcion)){
        PantallaListar pantallaListar = new PantallaListar();
        pantallaListar.mostrar();
    } else if("3".equals(opcion)){
        return false;
    }
        return true;
}
}
