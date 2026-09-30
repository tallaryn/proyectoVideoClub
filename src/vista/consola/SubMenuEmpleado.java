package vista.consola;

import java.io.BufferedReader;
import java.io.IOException;
import modelo.Encargado;
import servicio.SistemaVideoClub;
import util.LecturaDatos;

public class SubMenuEmpleado {
    
    public static void menuEmpleado(SistemaVideoClub sistema, BufferedReader lector) throws IOException {
        int opcion;

        do
        {
            System.out.println("0 - Salir");
            System.out.println("1 - Agregar empleado");
            System.out.println("2 - Quitar empleado");
            System.out.println("3 - Mostrar empleado");
            System.out.println("4 - Acciones empleado");
            System.out.println("5 - Editar empleado");
            System.out.println("6 - Mostrar empleados");
            System.out.printf("Ingrese la opcion a elegir: ");

            opcion = LecturaDatos.getInt(lector);

            switch(opcion){
                case 1:
                    String nombre, rut, idEmpleado, turno;
                    double sueldoBase;

                    System.out.printf("Ingrese nombre: ");
                    nombre = lector.readLine();

                    System.out.printf("Ingrese rut: ");
                    rut = LecturaDatos.leerRut(lector);;

                    System.out.printf("Ingrese id de empleado: ");
                    idEmpleado = lector.readLine();

                    System.out.printf("Ingrese turno: ");
                    turno = lector.readLine();

                    System.out.printf("Ingrese sueldo base: ");
                    sueldoBase = LecturaDatos.getDouble(lector);

                    Encargado nuevoEmpleado = new Encargado(nombre, rut, sueldoBase, idEmpleado, turno);
                    
                    System.out.println(sistema.agregarEmpleado(nuevoEmpleado));
                    break;

                case 2:
                    System.out.printf("Ingrese id de empleado: ");
                    idEmpleado = lector.readLine();

                    System.out.println(sistema.quitarEmpleado(idEmpleado));
                    break;

                case 3:
                    System.out.printf("Ingrese id de empleado: ");
                    idEmpleado = lector.readLine();

                    System.out.println(sistema.mostrarEmpleado(idEmpleado));
                    break;

                case 4:
                    accionesEmpleado(sistema, lector);
                    break;

                case 5:
                    System.out.printf("Ingrese id de empleado: ");
                    idEmpleado = lector.readLine();
                    Encargado empleadoEditar = sistema.obtenerEmpleado(idEmpleado);
                    if (empleadoEditar == null) {
                        System.out.println("Empleado no existe");
                        break;
                    }

                    System.out.println(empleadoEditar.identificarse());
                    System.out.printf("Nuevo nombre (Enter para mantener): ");
                    nombre = lector.readLine();
                    if (nombre == null || nombre.trim().isEmpty()) {
                        nombre = empleadoEditar.getNombre();
                    }

                    System.out.printf("Nuevo rut (Enter para mantener): ");
                    String rutNuevo = lector.readLine();
                    if (rutNuevo == null || rutNuevo.trim().isEmpty()) {
                        rutNuevo = empleadoEditar.getRut();
                    }

                    System.out.printf("Nuevo turno (Enter para mantener): ");
                    turno = lector.readLine();
                    if (turno == null || turno.trim().isEmpty()) {
                        turno = empleadoEditar.getTurno();
                    }

                    System.out.printf("Nuevo sueldo (Enter para mantener): ");
                    String sueldoTexto = lector.readLine();
                    Double sueldoNuevo = null;
                    if (sueldoTexto != null && !sueldoTexto.trim().isEmpty()) {
                        try {
                            sueldoNuevo = Double.parseDouble(sueldoTexto.trim());
                        } catch (NumberFormatException e) {
                            System.out.println("El sueldo debe ser un numero.");
                            break;
                        }
                    }

                    System.out.println(sistema.editarEmpleado(idEmpleado, nombre, rutNuevo, turno, sueldoNuevo));
                    break;
                    
                case 6:
                    System.out.println(sistema.mostrarTodosEmpleados());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        }while(opcion != 0);
    }

    public static void accionesEmpleado(SistemaVideoClub sistema, BufferedReader lector) throws IOException
    {
        int opcion;
        String idEmpleado;
        do{
            System.out.printf("Ingrese ID de empleado (o digite '0' para cancelar): ");
            idEmpleado = LecturaDatos.leerIdEmpleado(lector);
    
            if (idEmpleado.equals("0")) {
                System.out.println("Operación cancelada por el usuario.");
                return; 
            }
        }while(sistema.obtenerEmpleado(idEmpleado) == null);
        

        do
        {
            System.out.println("ID empleado actual: "+ idEmpleado + "\n");

            System.out.println("0 - Salir");
            System.out.println("1 - Cambiar turno");
            System.out.println("2 - Cambiar turno con otro empleado");
            System.out.println("3 - Cambiar sueldo");
            System.out.printf("Ingrese la opcion a elegir: ");

            opcion = LecturaDatos.getInt(lector);

            switch(opcion){
                case 1:
                    
                    System.out.printf("Ingrese nuevo turno: ");
                    String turno = lector.readLine();
                    sistema.cambioDeTurno(idEmpleado, turno);
                    break;

                case 2:

                    System.out.printf("nada: ");
                    
            
                case 3:

                    System.out.printf("Ingrese nuevo sueldo: ");
                    double sueldo = LecturaDatos.getDouble(lector);
                    sistema.cambioDeSueldo(idEmpleado, sueldo);
                    break;
                    
                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 0);
    }
    
}
