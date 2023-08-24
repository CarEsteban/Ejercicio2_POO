/** Autor: Esteban enrique Cárcamo Urízar
 *  Fecha de creación: 21/08/23 ; Hora: 9:03
 *  Última fecha de modificación: 
 *  Descripción: Administración de un hotel 
 */

import java.util.Scanner;


public class Hotel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc,menu=1,aux=0,opcion,user,habi;
        Habitacion[] habitaciones = new Habitacion[5];
        Cliente[] clientes = new Cliente[7];

        habitaciones[0] = new Habitacion(1,"Estándar", 10,200.99,false);
        habitaciones[1] = new Habitacion(2,"Deluxe", 5,400.99,false);
        habitaciones[2] = new Habitacion(3,"Deluxe", 8,325.99,false);
        habitaciones[3] = new Habitacion(4,"Suite", 2,700.99,false);
        habitaciones[4] = new Habitacion(5,"Estándar", 20,350.99,false);

        while (menu != 0) {
            System.out.println("Menú:");
            System.out.println("1. Reservar habitación");
            System.out.println("2. Asignar habitación");
            System.out.println("3. Desalojar habitación");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scan.nextInt();
            scan.nextLine(); // Limpiar el buffer
            
                switch (opcion) {
                    case 1:
                        if(aux==clientes.length){
                            System.out.println("Lo siento, tenemos la capacidad máxima de clientes");
                        }else{
                            
                            while (aux < clientes.length) { // Utilizar un bucle while para controlar las iteraciones
                                
                                System.out.println(aux + " : " + aux);
                                System.out.println("RESERVA DE HABITACIÓN");
                                System.out.println("¡Bienvenido a la asignación de habitación de clientes!");
                            
                                System.out.print("Ingrese su nombre: ");
                                String nombre = scan.nextLine();
                            
                                System.out.println("Seleccione la frecuencia de visita:");
                                System.out.println("1. Regular");
                                System.out.println("2. Frecuente");
                                System.out.println("3. VIP");
                                int opcionFrecuencia = scan.nextInt();
                                scan.nextLine(); // Limpiar el buffer
                            
                                String frecuencia;
                                switch (opcionFrecuencia) {
                                    case 1:
                                        frecuencia = "Regular";
                                        break;
                                    case 2:
                                        frecuencia = "Frecuente";
                                        break;
                                    case 3:
                                        frecuencia = "VIP";
                                        break;
                                    default:
                                        frecuencia = null;
                                        break;
                                }
                            
                                System.out.print("Ingrese la cantidad de amigos: ");
                                int amigos = scan.nextInt();
                                scan.nextLine(); // Limpiar el buffer
                                
                                boolean asignado = false;
                            
                                clientes[aux] = new Cliente(nombre, frecuencia, asignado, amigos);
                            
                                System.out.println("===================================");
                                System.out.println(clientes[aux]);
                                System.out.println("===================================");
                                System.out.println("\n¡Gracias por proporcionar su información!");
                            
                                System.out.println("Desea agregar otra reserva? (1 para sí, 0 para no):");
                                opc = scan.nextInt();
                                scan.nextLine();
                                if (opc == 0) {
                                    aux++;
                                    break; // Salir del bucle si la opción es 0
                                }
                            
                                aux++; // Incrementar aux para el siguiente ciclo
                            }
                            
   
                        }

                    



                        break;
                    case 2:
                        System.out.println("ASIGNACIÓN DE HABITACIÓN A CLIENTES");

                        System.out.println("Esta es la lista de clientes que están en espera");

                        
                        
                        for(int i = 0; i < clientes.length; i++){

                            if(clientes[i]==null){
                                System.out.println("===================================");
                                System.out.println("Todavía no hay un cliente en espera");
                                System.out.println("===================================");
                            }else{
                                if(clientes[i].getAsignado()==false){
                                    System.out.println("===================================");
                                    System.out.println(clientes[i]);
                                    System.out.println("===================================");
                                }else{

                                }
                            }
                        }


                        System.out.println("-----------------------------------------------------------------------------");

                        
                        System.out.println("Esta es la lista de habitaciones libres");

                        for(int i = 0; i < habitaciones.length; i++){

                            if(habitaciones[i]==null){
                                System.out.println("===================================");
                                System.out.println("Habitacion inexistente");
                                System.out.println("===================================");
                            }else{
                                if(!habitaciones[i].getReservado()){
                                    System.out.println("===================================");
                                    System.out.println(habitaciones[i]);
                                    System.out.println("===================================");
                                }else{

                                }
                            }
                        }

                        System.out.println("Desea asignar alguna habitación a algun cliente? (1 para sí, 0 para no)");
                        opc = scan.nextInt();
                        scan.nextLine();

                        if(opc==0){
                            break;
                        }else{
                            System.out.println("A que usuario le quiere asignar una habitación? (del " + ((clientes.length-clientes.length)+1) + " al " + clientes.length +")");
                            user = scan.nextInt();
                            scan.nextLine();
                            user-- ;

                            if(clientes[user].getHabitacionReservada()!=null){
                                System.out.println("Este usuario ya tiene habitación");
                                break;
                            }else if(clientes[user]!=null){
                                switch(user){
                                    case 0:
                                                                        
                                        System.out.println("Que habitación le desea asignar? (del " + ((habitaciones.length-habitaciones.length)+1) + " al " + habitaciones.length+")");
                                        habi = scan.nextInt();
                                        scan.nextLine();
                                        habi--;

                                        if(habitaciones[habi].getCliente() == null && clientes[user].getAmigos()<=habitaciones[habi].getCupo()){
                                                
                                                if(habitaciones[habi].getTipoHabitacion() == "Estándar" ){

                                                    habitaciones[habi].setCliente(clientes[user].getNombre());
                                                    habitaciones[habi].setReservado(true);
                                                    clientes[user].setAsignado(true);
                                                    clientes[user].setHabitacionReservada(habitaciones[habi].getTipoHabitacion());

                                                    System.out.println("Información del usuario: \n" + clientes[user] + "\nInformación de su habitación: \n" + habitaciones[habi]);

                                                }else if(habitaciones[habi].getTipoHabitacion() == "Deluxe" && clientes[user].getFrecuencia()=="Frecuente"){
                                                    habitaciones[habi].setCliente(clientes[user].getNombre());
                                                    habitaciones[habi].setReservado(true);
                                                    clientes[user].setAsignado(true);
                                                    clientes[user].setHabitacionReservada(habitaciones[habi].getTipoHabitacion());

                                                    //System.out.println(clientes[user]);
                                                    //System.out.println(habitaciones[habi]);
                                                    System.out.println("Información del usuario: \n" + clientes[user] + "\nInformación de su habitación: \n" + habitaciones[habi]);

                                                }else if(habitaciones[habi].getTipoHabitacion() == "Suite" && clientes[user].getFrecuencia()=="VIP"){
                                                    habitaciones[habi].setCliente(clientes[user].getNombre());
                                                    habitaciones[habi].setReservado(true);
                                                    clientes[user].setAsignado(true);
                                                    clientes[user].setHabitacionReservada(habitaciones[habi].getTipoHabitacion());

                                                    System.out.println("Información del usuario: \n" + clientes[user] + "\nInformación de su habitación: \n" + habitaciones[habi]);

                                                }

                                            }else if(habitaciones[habi].getCliente() != null){
                                                System.out.println("Lo siento, esta habitación ya tiene dueño");
                                            }else if(clientes[user].getAmigos()>habitaciones[habi].getCupo()){
                                                System.out.println("Sus amigos superan la cantidad máxima para la habitación");
                                        }
                                                                            

                                        break;
                                    
                                    case 1:
                                        if(clientes[user]==null){
                                            System.out.println("Lo siento, este usuario no existe");
                                            break;
                                        }else{
                                                                        
                                            System.out.println("Que habitación le desea asignar? (del " + ((habitaciones.length-habitaciones.length)+1) + " al " + habitaciones.length+")");
                                            habi = scan.nextInt();
                                            scan.nextLine();
                                            habi=habi-1;

                                            if(habitaciones[habi].getCliente()==null){
                                                if(habitaciones[habi].getTipoHabitacion() == "Estándar" && habitaciones[habi].getCupo()>clientes[user].getAmigos()){
                                                        habitaciones[habi].setCliente(clientes[user].getNombre());
                                                        habitaciones[habi].setReservado(true);
                                                        clientes[user].setAsignado(true);
                                                        clientes[user].setHabitacionReservada(habitaciones[habi].getTipoHabitacion());

                                                        System.out.println(clientes[user]);
                                                        System.out.println(habitaciones[habi]);
                                                    
                                                }else if(habitaciones[habi].getTipoHabitacion() == "Deluxe" && habitaciones[habi].getCupo()>clientes[user].getAmigos()){
                                                    if(clientes[user].getFrecuencia()=="Frecuente"){
                                                        
                                                        habitaciones[habi].setCliente(clientes[user].getNombre());
                                                        habitaciones[habi].setReservado(true);
                                                        clientes[user].setAsignado(true);
                                                        clientes[user].setHabitacionReservada(habitaciones[habi].getTipoHabitacion());

                                                        System.out.println(clientes[user]);
                                                        System.out.println(habitaciones[habi]);
                                                    }else{
                                                        System.out.println("Lo sentimos, no podemos asignarle esta habitación debido a que su frecuencia no es la adecuada");
                                                    }
                                                }else if(habitaciones[habi].getTipoHabitacion() == "Suite" && habitaciones[habi].getCupo()>clientes[user].getAmigos()){
                                                    if(clientes[user].getFrecuencia()=="VIP"){
                                                        
                                                        habitaciones[habi].setCliente(clientes[user].getNombre());
                                                        habitaciones[habi].setReservado(true);
                                                        clientes[user].setAsignado(true);
                                                        clientes[user].setHabitacionReservada(habitaciones[habi].getTipoHabitacion());

                                                        System.out.println(clientes[user]);
                                                        System.out.println(habitaciones[habi]);

                                                    }else{
                                                        System.out.println("Lo sentimos, no podemos asignarle esta habitación debido a que su frecuencia no es la adecuada ");
                                                    }
                                                }else{
                                                    System.out.println("XD, no deberías estar aca");
                                                }

                                            }else{
                                                System.out.println("Lo siento, esta habitación ya tiene dueño");
                                            }
                                    


                                        }

                                        break;

                                    case 2:

                                        break;
                                    
                                    case 3:

                                        break;

                                    case 4:
                                        break;
                                    
                                    case 5:

                                        break;

                                    case 6:

                                        break;

                                    default:
                                        System.out.println("Este usuario no existe");
                                        break;

                                }
                            
                            } 
                            
                        }



                        break;
                    case 3:
                        System.out.println("DESALOJAR HABITACIÓN DE UN CLIENTE");
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            
            System.out.println("\n--------------------------------------------------\n");
            
            if (opcion != 0) {
                System.out.print("¿Desea repetir el menú? (1 para sí, 0 para no): ");
                menu = scan.nextInt();
                scan.nextLine(); // Limpiar el buffer
            } else {
                menu = 0;
            }
        }









       scan.close();
    }//main
}//class

