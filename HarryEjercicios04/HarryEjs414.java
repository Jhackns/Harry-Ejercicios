package HarryEjercicios04;

import java.util.Scanner;

public class HarryEjs414 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ISR, horas_dobles, horas_laboradas_en_la_semana, horas_normales, horas_triples;
        double salario_bruto, salario_neto, salario_x_hora;
        System.out.print("Ingresa el valor de horas laboradas en la semana: ");
        horas_laboradas_en_la_semana = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de salario x hora: ");
        salario_x_hora = in.nextDouble();
        in.nextLine();
        if(horas_laboradas_en_la_semana>8*6)
        {
            horas_normales=8*6;
            horas_dobles=horas_laboradas_en_la_semana-8*6;
        }
        else
        {
            horas_normales=horas_laboradas_en_la_semana;
            horas_dobles=0;
        }
        if(horas_dobles>16)
        {
            horas_triples=horas_dobles-16;
            horas_dobles=16;
        }
        else
            horas_triples=0;
        salario_bruto=salario_x_hora*horas_normales+salario_x_hora*horas_dobles*2+salario_x_hora*horas_triples*3;
        salario_neto=salario_bruto/1.18;
        ISR=salario_bruto-salario_neto;
        System.out.println("Valor de ISR: " + ISR);
        System.out.println("Valor de horas dobles: " + horas_dobles);
        System.out.println("Valor de horas normales: " + horas_normales);
        System.out.println("Valor de horas triples: " + horas_triples);
        System.out.println("Valor de salario bruto: " + salario_bruto);
        System.out.println("Valor de salario neto: " + salario_neto);
    }

}
