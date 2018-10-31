package ba.unsa.etf.rpr.tutorijal03;

import java.util.Arrays;
import java.util.Objects;

public class FiksniBroj implements TelefonskiBroj {

    public enum Grad {TRAVNIK,ORASJE,ZENICA,SARAJEVO,LIVNO,TUZLA,MOSTAR,BIHAC,GORAZDE,SIROKIBRIJEG,BRCKO};
    protected String broj;
    private String pozivni;
    protected Integer[] brojevi={30,31,32,33,34,35,36,37,38,39,49};

    public FiksniBroj(Grad grad, String broj) {
        String tmp=grad.name();
        int brojac=0;
        for(Grad i: Grad.values()){
            if(tmp==i.name()) break;
            brojac++;
        }
        this.broj = broj;
        this.pozivni=brojevi[brojac].toString();
    }
    @Override
    public String ispisi(){
        return  ("0" + pozivni + "\\" + broj);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(broj, pozivni);
        result = 31 * result + Arrays.hashCode(brojevi);
        return result;
    }
}

