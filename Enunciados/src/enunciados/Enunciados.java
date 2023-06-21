package enunciados;

import java.util.Scanner;
import java.util.ArrayList;
//import java.util.LinkedList;

import entidadesEJ5.*;
import entidadesEJ6.*;


public class Enunciados {
    public static void main(String[] args) {
    	ejercicio1();
    	ejercicio2();
    	ejercicio3();
    	ejercicio4();
    	ejercicio5a();
    	ejercicio5b();
    }
    
    private static void ejercicio1() {
    	
    	System.out.println("Primeros 10 números enteros:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        
        System.out.println("Primeros 10 números impares:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
	}
    
    private static void ejercicio2() {
    	
    	Scanner lector = new Scanner (System.in);
    	String[] palabras = new String[10];
    	
    	System.out.println("Ingrese 10 palabras, presione enter al ingresar cada una: ");
    	for (int i = 0; i < 10; i++) {
    		palabras[i] = lector.nextLine();	
    	}
    	
    	System.out.println("Palabras ingresadas pero en el orden inverso: ");
    	for (int i = 9; i >= 0; i--) {
    		System.out.println(palabras[i]);
    	}
    	
    	lector.close();
    }
    
    private static void ejercicio3() {
    	Scanner lector = new Scanner (System.in);
    	String[] palabras = new String[10];
    	String word;
    	boolean repetida = false;
    	
    	System.out.println("Ingrese 10 palabras, presione enter al ingresar cada una: ");
    	for (int i = 0; i < 10; i++) {
    		palabras[i] = lector.nextLine();	
    	}
    	
    	System.out.println("Ingrese una palabra cualquiera para verificar si se encuentra o no en las antes ingresadas: ");
    	word = lector.nextLine();
    	for (String palabra: palabras) {
    		if (palabra.equals(word)) {
    			repetida = true;
    			break;
    		}
    	}
    	
    	if (repetida) {
    		System.out.println("La palabra " + word + " fue ingresada anteriormente");
    	} else {
    		System.out.println("La palabra " + word + " NO fue ingresada anteriormente");
    	}
    	
    	lector.close();
    }
    
    private static void ejercicio4() {
    	Scanner lector = new Scanner (System.in);
    	int[] mayores = new int[20];
    	int numero;
    	int cant_mayores = 0;
    	
    	System.out.println("Ingrese un numero: ");
    	numero = lector.nextInt();
    	
    	System.out.println("Ingrese 20 numeros: ");
    	for (int i = 0; i <= 19; i++) {
    		if (lector.nextInt() > numero) {
    			mayores[cant_mayores] = lector.nextInt();
    			cant_mayores++;
    		}
    	}
    	
    	System.out.println("Los numeros ingresados mayor al inicial son: ");
    	for (int i = 0; i < cant_mayores; i++) {
    		System.out.println(mayores[i]);
    	}
    	
    	lector.close();
    }
    
    private static void ejercicio5a() {
    	Scanner lector = new Scanner(System.in);
    	Empleado[] empleados = new Empleado[20];
    	String tipo, nombre, apellido, email;
    	int dni, hsextras, hsmes, porcenComision, totalVentas;
    	float sueldoBase;
    	
    	for (int i = 0; i <= 20; i++) {
    		System.out.println("Ingrese el tipo de empleado a ingresar: Administrativo (A) o Vendedor (V)");  		
    		do {
    			tipo = lector.nextLine();
	    		if (tipo.equalsIgnoreCase("a")) {
	    			System.out.println("Ingrese el DNI: ");
	    			dni = lector.nextInt();
	    			System.out.println("Ingrese nombre: ");
	    			lector.nextLine();
	    			nombre = lector.nextLine();
	    			System.out.println("Ingrese apellido: ");
	    			apellido = lector.nextLine();
	    			System.out.println("Ingrese email: ");
	    			email = lector.nextLine();
	    			System.out.println("Ingrese sueldo base: ");
	    			sueldoBase = lector.nextFloat();
	    			System.out.println("Ingrese horas extras: ");
	    			hsextras = lector.nextInt();
	    			System.out.println("Ingrese horas por mes: ");
	    			hsmes = lector.nextInt();
	    			
	    			Vendedor vendedor = new Vendedor(dni, nombre, apellido, email, sueldoBase, hsextras, hsmes);
	    			empleados[i] = vendedor;
	    			
	    		} else if (tipo.equalsIgnoreCase("v")) {
	    			System.out.println("Ingrese el DNI: ");
	    			dni = lector.nextInt();
	    			System.out.println("Ingrese nombre: ");
	    			lector.nextLine();
	    			nombre = lector.nextLine();
	    			System.out.println("Ingrese apellido: ");
	    			apellido = lector.nextLine();
	    			System.out.println("Ingrese email: ");
	    			email = lector.nextLine();
	    			System.out.println("Ingrese sueldo base: ");
	    			sueldoBase = lector.nextFloat();
	    			System.out.println("Ingrese porcentaje de comision: ");
	    			porcenComision = lector.nextInt();
	    			System.out.println("Ingrese total de ventas: ");
	    			totalVentas = lector.nextInt();
	    			
	    			Administrativo administrativo = new Administrativo(dni, nombre, apellido, email, sueldoBase, porcenComision, totalVentas);
	    			empleados[i] = administrativo;
	    			
	    		} else {
	    			System.out.println("Opcion incorrecta. Ingrese una opcion correcta: ");
	    		}
    		} while (!tipo.equalsIgnoreCase("a") && !tipo.equalsIgnoreCase("v"));
    		empleados[i].getPersona();
    		empleados[i].getSueldo();
    		lector.nextLine();
    	}
    	
    	lector.close();
    }
    
    private static void ejercicio5b() {
    	Scanner lector = new Scanner(System.in);
    	ArrayList<Empleado> empleados = new ArrayList<>();
    	Empleado empleado;
    	String tipo, nombre, apellido, email;
    	int dni, hsextras, hsmes, porcenComision, totalVentas;
    	float sueldoBase;
    	
    	for (int i = 0; i <= 20; i++) {
    		System.out.println("Ingrese el tipo de empleado a ingresar: Administrativo (A) o Vendedor (V)");  		
    		do {
    			tipo = lector.nextLine();
	    		if (tipo.equalsIgnoreCase("a")) {
	    			System.out.println("Ingrese el DNI: ");
	    			dni = lector.nextInt();
	    			System.out.println("Ingrese nombre: ");
	    			lector.nextLine();
	    			nombre = lector.nextLine();
	    			System.out.println("Ingrese apellido: ");
	    			apellido = lector.nextLine();
	    			System.out.println("Ingrese email: ");
	    			email = lector.nextLine();
	    			System.out.println("Ingrese sueldo base: ");
	    			sueldoBase = lector.nextFloat();
	    			System.out.println("Ingrese horas extras: ");
	    			hsextras = lector.nextInt();
	    			System.out.println("Ingrese horas por mes: ");
	    			hsmes = lector.nextInt();
	    			
	    			Vendedor vendedor = new Vendedor(dni, nombre, apellido, email, sueldoBase, hsextras, hsmes);
	    			empleados.add(vendedor);   			
	    		} else if (tipo.equalsIgnoreCase("v")) {
	    			System.out.println("Ingrese el DNI: ");
	    			dni = lector.nextInt();
	    			System.out.println("Ingrese nombre: ");
	    			lector.nextLine();
	    			nombre = lector.nextLine();
	    			System.out.println("Ingrese apellido: ");
	    			apellido = lector.nextLine();
	    			System.out.println("Ingrese email: ");
	    			email = lector.nextLine();
	    			System.out.println("Ingrese sueldo base: ");
	    			sueldoBase = lector.nextFloat();
	    			System.out.println("Ingrese porcentaje de comision: ");
	    			porcenComision = lector.nextInt();
	    			System.out.println("Ingrese total de ventas: ");
	    			totalVentas = lector.nextInt();
	    			
	    			Administrativo administrativo = new Administrativo(dni, nombre, apellido, email, sueldoBase, porcenComision, totalVentas);
	    			empleados.add(administrativo); 			
	    		} else {
	    			System.out.println("Opcion incorrecta. Ingrese una opcion correcta: ");
	    		}
    		} while (!tipo.equalsIgnoreCase("a") && !tipo.equalsIgnoreCase("v"));
    		empleado = empleados.get(i);
    		empleado.getPersona();
    		empleado.getSueldo();   		
    		lector.nextLine();
    	}
    	
    	lector.close();
	}
}
	
	