/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_ennermaldonado;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab2P2_EnnerMaldonado {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList empleados = new ArrayList();
        Random r = new Random();
        int opcion = 0;
        boolean cont = false;
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("****** Bienvenido Pricesmart ************");
            System.out.println("1. Registro de Empleados");
            System.out.println("2. Despedir Empleados");
            System.out.println("3. Log In");
            System.out.println("4. Ascender Cajero");
            System.out.println("5. Listar Empleados");
            System.out.println("6. Modificar Empleado");
            System.out.println("7. RANDOM");
            System.out.println("8. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (cont == true) {
                        String cargo="";
                        System.out.println("1-Gerente");
                        System.out.println("2-Aseador");
                        System.out.println("3-Cajero");
                        System.out.println("4-Seguridad");
                        System.out.print("Elija su opción");
                        int carg = sc.nextInt();
                        switch (carg) {
                            case 1:cargo = "Gerente";
                                break;
                            case 2:cargo = "Aseador";
                                break;
                            case 3:cargo = "cajero";
                                break;
                            case 4:cargo = "seguridad";
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                        System.out.print("Nombre: ");
                        String nombre = sc.next();
                        System.out.print("Apellido: ");
                        String apellido = sc.next();
                        System.out.print("Color favorito: ");
                        String color = sc.next();
                        System.out.print("Edad: ");
                        int edad = sc.nextInt();
                        System.out.print("Genero: ");
                        String genero = sc.next();
                        System.out.print("Altura: ");
                        double altura = sc.nextDouble();
                        System.out.print("Peso: ");
                        double peso = sc.nextDouble();
                        System.out.println("Titutlo: ");
                        String titulo = sc.next();
                        empleados.add(new Empleados(nombre, apellido, color, edad, altura, peso, titulo, cargo));
                    } else {
                        System.out.println("Necesitas iniciar seción");
                    }
                    break;
                case 2:
                    for (Object o : empleados) {
                        System.out.println(empleados.indexOf(o) + "-" + o);
                    }
                    System.out.print("Ingrese la posicion a despedir: ");
                    int pos = sc.nextInt();
                    while (pos < 0 || pos > empleados.size()) {
                        System.out.println("Posicion no encontrada: ");
                        pos = sc.nextInt();
                    }
                    empleados.remove(pos);
                    break;
                case 3:
                    System.out.println("Usuario: ");
                    String usuario = sc.next();
                    System.out.println("Contraseña: ");
                    int pas = sc.nextInt();
                    if (usuario.contains("leobanegas") && pas == 99) {
                        System.out.println("Bienvenido " + usuario);
                        cont = true;
                    } else {
                        System.out.println("Usuario o Contraseña Incorrectas");
                        cont = false;
                    }
                    break;
                case 4:
                    for (int i = 0; i < empleados.size(); i++) {
                        if (((Empleados) empleados.get(i)).getCargo().equals("Cajero")) {
                            System.out.println(empleados.indexOf(i) + "- " + empleados.get(i) + "\n");
                        }
                    }
                    break;
                case 5:
                    for (Object o : empleados) {
                        System.out.println(empleados.indexOf(o) + "-" + o);
                    }
                    break;
                case 6:
                    System.out.print("Modificar empleado: ");
                    String temp = sc.next();
                    for (int i = 0; i < empleados.size(); i++) {
                        if (((Empleados) empleados.get(i)).getCargo().equals(temp)) {
                            System.out.println(empleados.indexOf(i) + "- " + empleados.get(i) + "\n");
                        }
                    }
                    break;
                case 7:
                    opcion = 1 + r.nextInt(7);
                    System.out.println("Rndom " + opcion);
                    break;
                case 8:
                    resp = 'n';
                    break;
                default:
                    System.out.println("Opcion no valida");
            }//FIN SWTICH
        }//FIN WHILE
    }

}
