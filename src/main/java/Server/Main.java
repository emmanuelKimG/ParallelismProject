/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author ekcg1
 */
public class Main {
    public static void main(String[] args) {
        String texto;
        
        try 
        {
            texto = Files.readString(Paths.get("C:\\Users\\ekcg1\\Documents\\NetBeansProjects\\WordCounterRMI\\src\\main\\java\\Server\\archivo.txt")); // Cargar todo el contenido del archivo
        } catch (IOException e) 
        {
            System.err.println("Error leyendo el archivo: " + e.getMessage());
            return;
        }
        
        List<String> fragmentos = CustomUtilities.dividirTexto(texto, 50);
        
        for (String fragmento : fragmentos) {
            System.out.println("fragmento :" + fragmento);
        }
    }
    
}
