package HarryEjercicios04;

import java.util.Scanner;

public class HarryEjs413 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double calificacion_1, calificacion_2, calificacion_3, calificacion_4, calificacion_5;
        double porcentaje_de_asistencia, promedio;
        String matricula, nombre;
        System.out.print("Ingresa el matricula: ");
        matricula = in.nextLine();
        System.out.print("Ingresa el nombre: ");
        nombre = in.nextLine();
        System.out.print("Ingresa el valor de calificacion 1: ");
        calificacion_1 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de calificacion 2: ");
        calificacion_2 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de calificacion 3: ");
        calificacion_3 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de calificacion 4: ");
        calificacion_4 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de calificacion 5: ");
        calificacion_5 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de porcentaje de asistencia: ");
        porcentaje_de_asistencia = in.nextDouble();
        in.nextLine();
        promedio=(calificacion_1+calificacion_2+calificacion_3+calificacion_4+calificacion_5)/5;
        if(promedio<8||porcentaje_de_asistencia<85)
            System.out.println("Reprobado");
        else
            System.out.println("Aprobado");
        System.out.println("Matricula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Valor de promedio: " + promedio);
    }

}

