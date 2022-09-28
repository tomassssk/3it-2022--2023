package sk.sosholic.prvypolrok.opakovanie;

public class MojeMeno {
    private String meno;
    private String priezvisko;

    public MojeMeno(String meno,String priezvisko){
        this.meno = meno;
        this.priezvisko= priezvisko;
    }
            public String getCeleMeno(){

            return meno + priezvisko;

            }
            public String getMeno(){
            return meno;
            }

            public String getPriezvisko(){
            return priezvisko;
            }


}
