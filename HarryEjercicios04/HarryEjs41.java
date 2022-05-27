package HarryEjercicios04;

import java.util.Scanner;

public class HarryEjs41 {

    public static void main(String[] args) {
        
            Scanner lector = new Scanner(System.in);
            
            double salario;

            System.out.println("Ingrese el salario del profesor: ");
            salario = lector.nextDouble();

            if (salario < 18000) {
                salario += (salario * 0.12);
            }
            else if (salario >= 18000 && salario <= 30000) {
                salario+= (salario * 0.08);
            }

            else if (salario >= 30000 && salario <= 50000) {
                salario += (salario * 0.07);
            }
                
            else {
                salario += (salario * 0.06);
            }
            System.out.println("El nuevo salario es: "+salario);
    }
}
