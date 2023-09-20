package pruebaaccesopath;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class EjemploListarDirectorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        Path dir = Paths.get(nombre);
        System.out.println("Ficheros del directorio " + dir);
        if (Files.isDirectory(dir)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir);) {
                for (Path fichero : stream) {
                    File fis = fichero.toFile();
                    String permisos="";
                    if(Files.isDirectory(fichero)){
                        permisos+="d";
                    }else{
                        permisos+="-";
                    }
                    if(fis.canRead()){
                        permisos+="r";
                    }else{
                        permisos+="-";
                    }
                    if(fis.canWrite()){
                        permisos+="w";
                    }else{
                        permisos+="-";
                    }
                    if(fis.canExecute()){
                        permisos+="x";
                    }else{
                        permisos+="-";
                    }
                    System.out.println(permisos+" "+fichero.getFileName());
                }
            } catch (IOException | DirectoryIteratorException ex) {
                System.err.println(ex);
            }
        } else {
            System.err.println(dir.toString() + " no es un directorio");
        }
    }
}
