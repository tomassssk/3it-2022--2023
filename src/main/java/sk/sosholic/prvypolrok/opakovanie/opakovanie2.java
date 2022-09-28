package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class opakovanie2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("zadaj meno a stlac enter");

        MojeMeno mojeMeno = new MojeMeno ("Tomas ", "Kvackaj");

        String meno = scanner.nextLine();

        System.out.print(" Priezvisko");
        String Priezvisko = scanner.nextLine();



        for(int y =1;y<11;y++){

            if(y%2==0) {
                System.out.print(meno + " " + Priezvisko + " " + " " + y + " ");
            }

        }
    }
}
