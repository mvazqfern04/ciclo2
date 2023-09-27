/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author node
 */
public class ex2 {

    public static void ordenar() {
        Scanner sc = new Scanner(System.in);
        String dir = sc.nextLine();

        File fichero = new File(dir);

        try {
            BufferedReader lector = new BufferedReader(new FileReader(fichero));
            List<String> cont = new ArrayList();
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] spl = linea.split(" ");
                for(String p:spl){
                    cont.add(p.toLowerCase());
                }
            }
            
            Collections.sort(cont);
            
            File copia = new File("prueba_sort.txt");
            
            for(String palabra:cont){
                BufferedWriter escritor = new BufferedWriter(new FileWriter(copia));
                escritor.write(palabra);
                System.out.println(palabra);
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Fallo");
        } catch (IOException ex) {
            System.err.println("Fallo");
        }
    }
}
