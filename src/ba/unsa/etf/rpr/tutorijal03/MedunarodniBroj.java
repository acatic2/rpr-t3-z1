package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.broj=broj;
        this.drzava = drzava;

    }@Override
    public  String ispisi(){
        return drzava + "\\" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj);
    }
}
