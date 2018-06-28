public class Main {

    public static void main(String args[]){

        Item[] items = new Item[10];
        Basket bs = new Basket();
        for(int i = 1; i < 10; i++) {
            items[i] = new Item("przedmiot"+(i), (i*i+2.34));
            bs.dodaj(items[i],i);
            bs.wyswietl_zawartosc();
        }
        System.out.print("Suma zamowienia: "+bs.suma_zamowienia());







    }
}
