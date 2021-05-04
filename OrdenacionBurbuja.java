package OrdenacionBurbuja;

import java.util.Scanner;

public class OrdenacionBurbuja {

    public static void main(String[] args) {

        long dato;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de datos");
        int tamaño = entrada.nextInt();

        ArregloBurbuja arregloBurbuja = new ArregloBurbuja(tamaño);
        System.out.println("Ingrese los " + tamaño + " datos");

        for (int i = 0; i < tamaño; i++) {
            System.err.println("Dato " + (i + 1) + ": ");
            dato = entrada.nextLong();
            arregloBurbuja.insertar(dato);
        }

        System.out.println("Datos sin ordenar");
        arregloBurbuja.mostrarElementos();

        System.out.println("Seleccione el metodo de ordenación: "
              + "\n 1. Para Ordenados por Selección "
              + "\n 2. Para Ordenamiento Burbuja");
        

        int op = entrada.nextInt();
        
        System.out.println(op);
        
        switch (op) {
            case 1:
                System.out.println("Datos ordenados por selección");
                arregloBurbuja.ordenacionPorSeleccion();
                break;
            case 2:
                System.out.println("Datos ordenados burbuja");
                arregloBurbuja.ordenacionBurbuja();
                arregloBurbuja.mostrarElementos();
                break;
            default:
                throw new AssertionError();
        }
       entrada.close();
    }
}
