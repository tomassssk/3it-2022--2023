package sk.sosholic.prvypolrok.databazaziakov;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplikaciaMojejDatabazy {

    static List<Ziak> ziakList = new ArrayList<>();
    private static boolean exit = true;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Moja databaza spoluziakov");

        while (exit) {

            int exits = 1;
            while(exits!=0) {
                System.out.println("Ak chces ukoncit aplikaciu stlac 0");
                System.out.println("Ak chces vytvorit zaznam stlac 1");
                System.out.println("Ak chces zmazat zaznam stlac 2");
                System.out.println("Ak chces zobrazi zaznam stlac 3");
                System.out.println("Ak chces zobrazit cely zaznam stlac 4");

                int matematickaOperacia = scanner.nextInt();

                switch (matematickaOperacia) {

                    case 0:
                        exit = true;
                        System.out.print("Aplikacia sa vypina");
                        break;
                    case 1:
                        String Meno = scanner.nextLine();
                        System.out.println("Vloz Meno : ");
                        String priezvisko = scanner.nextLine();
                        System.out.println("Vloz Priezvisko : ");
                        int vek = scanner.nextInt();
                        System.out.println("Vloz Vek : ");
                        Ziak ziak = new Ziak(Meno, priezvisko, vek);
                        ziakList.add(ziak);
                        break;
                    case 2:
                        vypis();
                        System.out.println("Vyber cislo ktore chces vymazat");
                        if (ziakList.size() > 0) {

                        }
                        int menoNaZmazanie = scanner.nextInt();
                        ziakList.remove(menoNaZmazanie);


                        break;
                    case 3:
                        int cislo = scanner.nextInt();
                        Ziak ZiaknaZobrazenie = ziakList.get(cislo-1);
                        System.out.println(ZiaknaZobrazenie);
                        if (matematickaOperacia > ziakList.size()) {
                            System.out.println("Cislo je mimo rozsahu");

                        }
                        else if (matematickaOperacia < 0){
                            System.out.println("Cislo je mimo rozsahu");
                        }
                        break;

                    case 4:
                        System.out.println(ziakList.toString());
                        break;
                    case 5:
                        int poradie = 0;
                        for(int i =0; i<ziakList.size(); i++){
                            Ziak ziak1 = ziakList.get(i);
                            if(ziakList.get(poradie).getVek()< ziak1.getVek()){
                                poradie = i;
                            }
                        }

                }
            }
        }
    }
    private static void ziaci(){
        ziakList.add(new Ziak("Janko","Hrasko",15));
        ziakList.add(new Ziak("Minko","Tominko",15));
    }
    private static void vypis(){
        for(int i=1;i<ziakList.size();i++){
            System.out.println(i+ " " +ziakList.get(i-1));
        }
    }
}
