package com.company;

public class PantallaBuscar {
    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("Busqueda");

        System.out.println("Buscando texto");

        String textoABuscar = Main.scanner.nextLine();


        for(Nota nota: Main.blocDeNotas.notas){
            if(nota.contenido.equals(textoABuscar)){
                System.out.println(nota.contenido);
            } else {
                System.out.println("La nota que busacas no existe");
            }
        }
    }
}
