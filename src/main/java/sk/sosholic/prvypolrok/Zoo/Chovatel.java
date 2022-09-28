package sk.sosholic.prvypolrok.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Chovatel {

    private String Meno;
    private String Priezvisko;
    private List<Animal> zoo = new ArrayList<>();

    public Chovatel(String Meno,String Priezvisko){
        this.Meno = Meno;
        this.Priezvisko= Priezvisko;
    }

    public void pridatZviera(Animal animal){
        zoo.add(animal);
    }

    public Animal zistiNajdrahsieZviera(){
        for (Animal animal : zoo) {

            if( animal.getValue() > zoo.get(0).getValue()){

            }
        }
        return zistiNajdrahsieZviera();
    }

}
