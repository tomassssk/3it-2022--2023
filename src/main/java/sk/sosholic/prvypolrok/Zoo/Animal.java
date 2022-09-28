package sk.sosholic.prvypolrok.Zoo;

public class Animal {
    private String neco;
    private double value;

    public Animal(String neco,double value){
        this.neco = neco;
        this.value= value;
    }

    public String getNeco(){
        return neco;
    }
    public void setNeco(String neco) {
        this.neco = neco;
    }

    public double getValue(){
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "neco='" + neco + '\'' +
                ", value=" + value +
                '}';
    }
}
