/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ekcg1
 */
public final class CustomUtilities {
    
    public static List<String> dividirTexto(String texto, int partes) {
        List<String> fragmentos = new ArrayList<>();
        int longitud = texto.length();
        int tamañoParte = longitud / partes;

        int inicio = 0;

        for (int i = 0; i < partes; i++) {
            int fin = (i == partes - 1) ? longitud : inicio + tamañoParte;

            // Ajustar el índice 'fin' para no cortar palabras
            while (fin < longitud && !Character.isWhitespace(texto.charAt(fin))) {
                fin++;
            }
            
            if(fin >= longitud) 
                break;
            // Agregar el fragmento a la lista
            fragmentos.add(texto.substring(inicio, fin));
            // Actualizar el inicio para el próximo fragmento
            inicio = fin;
        }
        return fragmentos;
    }
    
}
