
package com.naldana;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Néstor Aldana <nexxtor at naldana.com>
 */
public class ListaEstudiantes {
    private ArrayList<Estudiante> estudiantes;
    
    public ListaEstudiantes() {
        estudiantes = new ArrayList<>();
    }
    
    public void add() {
        Estudiante estudiante = new Estudiante();
        
        estudiantes.add(estudiante);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del estudiante");
        System.out.print(": ");
        estudiante.setNombres(leer.nextLine());
        
        System.out.println("Ingrese los apellidos del estudiante");
        System.out.print(": ");
        estudiante.setApellidos(leer.nextLine());
        
        System.out.println("Ingrese el carne del estudiante");
        System.out.print(": ");
        estudiante.setCarnet(leer.next());
        
        
    }
    
    public void mostrar() {
        estudiantes.forEach((e) -> {
            System.out.println(e.toString());
        });
    }
}
