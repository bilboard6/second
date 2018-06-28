import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Basket {

   Map zamowione_przedmioty = new HashMap();//item(name,price)+ilosc

    void dodaj(Item item, int ilosc){

        if(ilosc <= 0){
            throw new IllegalArgumentException("ilosc musi byc dodatnia");
        }
        else
            zamowione_przedmioty.put(item,ilosc);
    }

    /*
    void usun_przedmiot(Map przedmiot_usuwany){

        if(zamowione_przedmioty.isEmpty()){
            System.out.print("Koszyk pusty");
        }
        else
            zamowione_przedmioty.remove(przedmiot_usuwany);
    }*/

    void usun_przedmioty(Item przedmiot_usuwany1, Item...przedmiot_usuwanyx){
        if(zamowione_przedmioty.isEmpty()){
            throw new IllegalArgumentException("PUSTY KOSZYK");
        }
        else
            for(int i=0; i<przedmiot_usuwanyx.length; i++) {
                zamowione_przedmioty.remove(przedmiot_usuwanyx[i]);
            }
    }


    double suma_zamowienia(){

        double suma = 0;

        Set<Entry<Item,Integer>> entrySet = zamowione_przedmioty.entrySet();
        for(Entry<Item,Integer> entry: entrySet) {
           suma+= (entry.getKey().getPrice()*entry.getValue());
        }
        return suma;
    }

    void wyswietl_zawartosc(){

        if(zamowione_przedmioty.isEmpty()){
            throw new IllegalArgumentException("PUSTY KOSZYK");
        }
        else {
            Set<Entry<Item, Integer>> entrySet = zamowione_przedmioty.entrySet();
            for (Entry<Item, Integer> entry : entrySet) {
                System.out.println(entry.getKey().getName() + " : " + entry.getValue());
            }
        }

    }

}
