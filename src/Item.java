import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Item {


    private double price;
    private String name;


    public Item(String name, double price){
        this.price = price;
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }
}
        /*
    public Item(String nazwa, double cena){
        this.nazwa=nazwa;
        this.cena=cena;
        }
        */
