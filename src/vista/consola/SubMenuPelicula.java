package vista.consola;

import java.io.BufferedReader;
import java.io.IOException;
import modelo.Pelicula;
import servicio.SistemaVideoClub;
import util.LecturaDatos;


public class SubMenuPelicula {
    
    public static void menuPelicula (SistemaVideoClub sistema, BufferedReader lector) throws IOException {

        int opcion;

        do
        {
            System.out.println("0 - Salir");
            System.out.println("1 - Agregar pelicula");
            System.out.println("2 - Quitar pelicula");
            System.out.println("3 - Mostrar catalogo");
            System.out.println("4 - Modificar pelicula");            
            System.out.printf("Ingrese la opcion a elegir: ");

            opcion = LecturaDatos.getInt(lector);

            switch(opcion)
            {
                case 1:
                    String titulo, autor, genero;
                    int estrenoYear, idPelicula, copiasDisponibles;

                    System.out.printf("Ingrese titulo: ");
                    titulo = lector.readLine();

                    System.out.printf("Ingrese autor: ");
                    autor = lector.readLine();

                    System.out.printf("Ingrese genero: ");
                    genero = lector.readLine();

                    System.out.printf("Ingrese año de publicacion: ");
                    estrenoYear = LecturaDatos.getInt(lector);

                    System.out.printf("Ingrese id: ");
                    idPelicula = LecturaDatos.getInt(lector);

                    System.out.printf("Ingrese cantidad de copias en stock: ");
                    copiasDisponibles = LecturaDatos.getInt(lector);

                    System.out.println("La pelicula tiene restriccion de edad?");
                    System.out.println("1- Si\n2- No");
                    System.out.printf("Ingrese respuesta: ");
                    int respuesta = util.LecturaDatos.getInt(lector);

                    Pelicula nuevaPelicula;
                    if(respuesta == 1){
                        nuevaPelicula = new Pelicula(titulo, autor, genero, estrenoYear, idPelicula, copiasDisponibles, true);
                    }else{
                        nuevaPelicula = new Pelicula(titulo, autor, genero, estrenoYear, idPelicula, copiasDisponibles, false);
                    }
                    sistema.agregarOrdenado(nuevaPelicula);
                break;
                
                case 2:
                    System.out.printf("Ingrese id de la pelicula a eliminar: ");
                    idPelicula = LecturaDatos.getInt(lector);

                    System.out.println(sistema.eliminarPelicula(idPelicula));
                break;
                
                case 3:
                    System.out.println(sistema.mostrarCatalogoPeliculas());
                break;
                
                case 4:
                    System.out.printf("Ingrese id de la pelicula a modificar: ");
                    idPelicula = LecturaDatos.getInt(lector);
                    
                    Pelicula p = sistema.busquedaBinariaPeliculas(idPelicula);
                    if(p == null)
                    {
                        System.out.printf("La pelicula no existe");
                        break;
                    }
                    
                    System.out.printf("Nuevo titulo (Enter para mantener): ");
                    titulo = lector.readLine();
                    
                    System.out.printf("Nuevo autor (Enter para mantener): ");
                    autor = lector.readLine();

                    System.out.printf("Ingrese genero (Enter para mantener): ");
                    genero = lector.readLine();

                    System.out.printf("Nuevo año de publicacion (Enter para mantener): ");
                    String strEstrenoYear = lector.readLine();
                    if(!strEstrenoYear.trim().isEmpty())
                    {
                        if(!LecturaDatos.esNumero(strEstrenoYear)){
                            System.out.println("El estreno no puede contener caracteres no numericos");
                            break;
                        }
                    }
                    
                    System.out.printf("Nueva cantidad de copias en stock: ");
                    String strCopiasDisponibles = lector.readLine();
                    if(!strCopiasDisponibles.trim().isEmpty())
                    {
                        if(!LecturaDatos.esNumero(strCopiasDisponibles)){
                            System.out.println("La cantidad de copias no puede contener caracteres no numericos");
                            break;
                        }
                    }

                    System.out.println("La pelicula tiene restriccion de edad?");
                    System.out.println("1- Si\n2- No");
                    System.out.printf("Ingrese respuesta (Enter para mantener): ");
                    String strRespuesta = lector.readLine();
                    
                switch (strRespuesta) {
                    case "1":
                        System.out.println(sistema.modificarPelicula(idPelicula, titulo, autor, genero, strEstrenoYear, strCopiasDisponibles, true));
                        break;
                    case "2":
                        System.out.println(sistema.modificarPelicula(idPelicula, titulo, autor, genero, strEstrenoYear, strCopiasDisponibles, false));
                        break;
                    default:
                        System.out.println(sistema.modificarPelicula(idPelicula, titulo, autor, genero, strEstrenoYear, strCopiasDisponibles));
                        break;
                }
                    
                    

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
