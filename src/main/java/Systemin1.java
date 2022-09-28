import java.util.Scanner;
import java.util.SimpleTimeZone;
public class Systemin1 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int exit = 1;

        while(exit!=0) {


            System.out.print("Scitaj = 1 ");
            System.out.print("Odcitaj = 2 ");
            System.out.print("Nasobenie = 3 ");
            System.out.print("Delenie = 4");

            int matematickaOperacia = scanner.nextInt();

            switch(matematickaOperacia) {

                case 1:
                    System.out.print("Vloz cislo 1 :");
                    int cislo1 = scanner.nextInt();
                    System.out.print("Vloz cislo 2 :");
                    int cislo2 = scanner.nextInt();
                    System.out.print("Vysledok scitania je " + " " + (cislo1 = cislo1 + cislo2));
                    break;
                case 2:
                    System.out.print("Vloz cislo 1 :");
                    int cislo3 = scanner.nextInt();
                    System.out.print("Vloz cislo 2 :");
                    int cislo4 = scanner.nextInt();
                    System.out.print("Vysledok odcitanie je " + " " + (cislo3 = cislo3 - cislo4));
                    break;
                case 3:
                    System.out.print("Vloz cislo 1 :");
                    int cislo5 = scanner.nextInt();
                    System.out.print("Vloz cislo 2 :");
                    int cislo6 = scanner.nextInt();
                    System.out.print(" Vysledok nasobenie je " + " " + (cislo5 = cislo5 * cislo6));
                    break;
                        case 4:
                            System.out.print("Vloz cislo 1 :");
                            int cislo7 = scanner.nextInt();
                            System.out.print("Vloz cislo 2 :");
                            int cislo8 = scanner.nextInt();

                            if((cislo7==0)||(cislo8==0)) {

                                System.out.print("Nulou sa neda delit");

                            }
                            else {
                                System.out.print("Vysledok delenie je " + " " + (cislo7 = cislo7 / cislo8));
                            }

                    }
                    break;
            }

            System.out.print(" pre ukoncenie programu stlac 0 ");

            exit = scanner.nextInt();

            }
}

