package ba.unsa.etf.rpr.tutorijal03;
import java.util.*;

public class Imenik {

    private Map<String, TelefonskiBroj> mapa;

    public Imenik() {
        mapa = new HashMap<>();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        mapa.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        return mapa.get(broj).ispisi();
    }

    public String naSlovo(char s) {
        String temp = " ";
        int brojac = 1;
        for(Map.Entry<String, TelefonskiBroj> ulaz : mapa.entrySet()) {
            if(ulaz.getKey().charAt(0) == s) {
                temp = brojac + ". " + ulaz.getKey() + " - " + ulaz.getValue().ispisi() + "\n";
                brojac++;
            }
        }
        return temp;
    }
    public Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> temp = new HashSet<>();
        for(Map.Entry<String, TelefonskiBroj> ulaz : mapa.entrySet()) {
            TelefonskiBroj broj = mapa.get(ulaz.getKey());
            if (broj instanceof FiksniBroj) {
                if (((FiksniBroj) broj).getGrad() == g) {
                    temp.add(ulaz.getKey());
                }
            }
        }
        return temp;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> broj = new HashSet<>();
        for (Map.Entry<String,TelefonskiBroj> ulaz : mapa.entrySet()) {
            TelefonskiBroj telefoni = mapa.get(ulaz.getKey());
            if (telefoni instanceof  FiksniBroj) {
                if (g == ((FiksniBroj) telefoni).getGrad())
                    broj.add(telefoni);
            }
        }
        return broj;
    }
}