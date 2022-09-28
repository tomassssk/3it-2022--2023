package sk.sosholic.prvypolrok.vynimky;

public class Priklad1 {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Nejaky beh programu");
            throw new Exception("Toto je nejaka chyba");
        } catch (Exception ex) {

            System.out.println("toto sa nestane ked je chyba");
        }
        finally
        {
            System.out.println("Tento kod sa vykona nezavisle o chyby");
        }
        System.out.println("Toto je pokracovanie kodu");
    }

}
