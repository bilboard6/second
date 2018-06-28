import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class BasketTest {
    Basket bk = new Basket();
    Item it = new Item("blaasaa", 3.12);
    Basket bk2 = new Basket();

    @Test(expected = IllegalArgumentException.class)
    public void shouldsayquantitymustbepositive(){
        bk.dodaj(it, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldsaybasketisempty(){
        bk.usun_przedmioty(it);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldsaybasketisempty2(){
        bk.dodaj(it,0);
        bk.wyswietl_zawartosc();
    }

    @Test
    public void isquantityiscorrect(){
        bk.dodaj(it, 10);
        bk2.dodaj(it,10);
        Assert.assertEquals(bk.zamowione_przedmioty, bk2.zamowione_przedmioty);
    }
    @Test
    public void isquantityiscorrect2(){
        bk.dodaj(it, 10);
        Basket bk2 = new Basket();
        bk2.dodaj(new Item("ble",3.153),10);
        Assert.assertNotEquals(bk.zamowione_przedmioty, bk2.zamowione_przedmioty);
    }
    @Test
    public void isremovingworks(){
        bk.dodaj(it,10);
        bk.usun_przedmioty(it);
        bk2.dodaj(it, 10);
        bk2.usun_przedmioty(it);
        Assert.assertEquals(bk.zamowione_przedmioty,bk2.zamowione_przedmioty);
    }

    @Test
    public void isallremovingworks(){
        bk.dodaj(it,10);
        bk.usun_przedmioty(it,it,it,it,it,it,it,it,it,it);
        bk2.dodaj(it, 10);
        bk2.usun_przedmioty(it,it,it,it,it,it,it,it,it,it);
        Assert.assertEquals(bk.zamowione_przedmioty,bk2.zamowione_przedmioty);
    }


}