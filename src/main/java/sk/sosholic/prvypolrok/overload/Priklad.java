package sk.sosholic.prvypolrok.overload;

public class Priklad {
    public static void main(String[] args) {
    System.out.println(convertCentimeters(2));
    }
    static double convertCentimeters(int inches){

        double cm;
        cm = inches * 2.54;
        return cm;
    }

    static double convertToCentimeters(int feets,int inches){
        double neconeco = feets * 12;
        double totalinches = neconeco + inches;
        return totalinches * 2.54;
    }

    static String getDurationString(int sekundy){


        int minuty= sekundy/60;
        int zostatokSekund= sekundy%60;
        int hours = minuty / 60;
        int reminderMinutes = minuty%60;

        return hours + "hod" +  reminderMinutes + "Min" + zostatokSekund + "Sec";
    }
}
