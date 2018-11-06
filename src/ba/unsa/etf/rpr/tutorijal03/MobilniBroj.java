package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MobilniBroj extends   TelefonskiBroj {
    int mobilnaMreza;
    String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }
    @Override
    public  String ispisi(){
        String s=new String("0" + mobilnaMreza + "/" + broj);
        return s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }
}
