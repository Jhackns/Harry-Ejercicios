package HarryEjercicios04;

import java.util.Scanner;

public class HarryEjs42 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tipo_de_hamburguesa, tipo_de_pago;
        double N_hamburguesas_consumidas, cargo, pago;
        System.out.print("Ingresa el valor de N hamburguesas consumidas: ");
        N_hamburguesas_consumidas = in.nextDouble();
        in.nextLine();
        System.out.println("Selecciona el valor de tipo de hamburguesa.");
        System.out.println("\t1.- sencillas");
        System.out.println("\t2.- dobles");
        System.out.println("\t3.- triples");
        System.out.print("\t: ");
        do {
            tipo_de_hamburguesa = in.nextInt();
            in.nextLine();
            if (tipo_de_hamburguesa<1||tipo_de_hamburguesa>3)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (tipo_de_hamburguesa<1||tipo_de_hamburguesa>3);
        System.out.println("Selecciona el valor de tipo de pago.");
        System.out.println("\t1.- efectivo");
        System.out.println("\t2.- tarjeta");
        System.out.print("\t: ");
        do {
            tipo_de_pago = in.nextInt();
            in.nextLine();
            if (tipo_de_pago<1||tipo_de_pago>2)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (tipo_de_pago<1||tipo_de_pago>2);
        pago=0;
        if(tipo_de_hamburguesa==1)
            pago=N_hamburguesas_consumidas*20;
        if(tipo_de_hamburguesa==2)
            pago=N_hamburguesas_consumidas*25;
        if(tipo_de_hamburguesa==3)
            pago=N_hamburguesas_consumidas*28;
        if(tipo_de_pago==2)
            cargo=pago*0.05;
        else
            cargo=0;
        pago=pago+cargo;
        System.out.println("Valor de cargo: " + cargo);
        System.out.println("Valor de pago: " + pago);
    }

}
