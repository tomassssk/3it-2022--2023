package sk.sosholic.prvypolrok.Zoo;

public class Pavuk extends Animal{

    private int nohy;

    public Pavuk(String animalType, double value, int nohy){
        super(animalType, value);
        this.nohy = nohy;
    }

    public int getNOhy(){
        return nohy;
    }

    public void setNohy(String typVody) {
        this.nohy = nohy;
    }

    @Override
    public String toString() {
        return "Pavuk{" +
                "nohy=" + nohy +
                '}';
    }
}
