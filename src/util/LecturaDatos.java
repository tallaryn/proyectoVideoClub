package util;

import modelo.Persona;
import modelo.Encargado;

import excepciones.RutInvalidoException;
import excepciones.IdEmpleadoInvalidaException;


import java.io.BufferedReader;
import java.io.IOException;

public class LecturaDatos {
    public static double getDouble(BufferedReader lector) throws IOException {
        while (true) {
            String entrada = lector.readLine();
            if (entrada == null) {
                return 0;
            }
            try {
                return Double.parseDouble(entrada.trim());
            } catch (NumberFormatException e) {
                System.out.printf("Debe ingresar un numero. Intente de nuevo: ");
            }
        }
    }


    public static int getInt(BufferedReader lector) throws IOException {
        while (true) {
            String entrada = lector.readLine();
            if (entrada == null) {
                return 0;
            }
            try {
                return Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                System.out.printf("Debe ingresar un numero entero. Intente de nuevo: ");
            }
        }
    }
    
    public static String leerRut(BufferedReader lector) throws IOException 
    {
        String rut = "";
        boolean esValido = false;

        while (!esValido && !rut.equals("0")) {
            try {
                rut = lector.readLine();
                
                Persona.validarRut(rut); 

                esValido = true; 
            } catch (RutInvalidoException e) {
                System.out.println("-> " + e.getMessage() + " Intente de nuevo.\n");
            }
        }
        return rut;
    }
    public static String leerIdEmpleado(BufferedReader lector) throws IOException 
    {
        String idEmpleado = "";
        boolean esValido = false;

        while (!esValido && !idEmpleado.equals("0")) {
            try {
                idEmpleado = lector.readLine();
                Encargado.validarIdEmpleado(idEmpleado); 

                esValido = true; 
            } catch (IdEmpleadoInvalidaException e) {
                System.out.println("-> " + e.getMessage() + " Intente de nuevo.\n");
            }
        }
        return idEmpleado;
    }

    
}
