package com.tuempresa.tuprojecto;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Bienvenido, Por favor elija una opcion");
            System.out.println("1. Validar contrasena segura");
            System.out.println("2. Salir");
            System.out.println("hola");
            System.out.println("chau");
            System.out.println("paolo");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    String contrasena = sc.nextLine();
                    System.out.println(validarContrasena(contrasena));
                    break;

                case 2:
                    break;
            }

        }while( opcion != 2 );

    }


    public static boolean validarContrasena(String contrasena){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";

        if(contrasena.matches(regex)){
            return true;
        }

        return false;
    }




}
