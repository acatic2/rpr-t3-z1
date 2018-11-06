package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    private HashMap<TelefonskiBroj,String> kontakt=new HashMap<TelefonskiBroj,String>();
    void dodaj(String ime, TelefonskiBroj broj){
        kontakt.put(broj,ime);
    }
}
