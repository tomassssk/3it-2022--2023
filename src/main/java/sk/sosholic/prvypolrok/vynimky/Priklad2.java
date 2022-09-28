package sk.sosholic.prvypolrok.vynimky;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Priklad2 {
    public static void main(String[] args) {
        List<String> mojList = Arrays.asList("jablo","hruska","slivka");
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadaj index :");
        int index = scanner.nextInt();

        try {
            System.out.println(mojList.get(index));
        }
        catch (Exception ex){
            System.out.println("Mame chybu" + ex.getCause().toString());
            System.out.println("Zadane cislo je mimo rozsahu listu");

        }
        mojList.set(1,"ceresna");
        System.out.println(mojList);
    }
}
