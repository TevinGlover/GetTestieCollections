package rocks.zipcode;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {
    // Tips from The Leuth use https://www.w3schools.com and https://www.baeldung.com for the types of Collections.
    String a;
    String as;
    String ae;
    String ap;
    ArrayList<String> waxOn;
    String amax;

    @Before
    public void Setup() {
        waxOn = new ArrayList<>();
        a = "a";
        as = "as";
        ae = "ate";
        ap = "append";
        amax = "amax";


    }

    @Test // waxOn.add(); waxOn.size();waxOn.set(); waxOn.toArray();
    public void testArrayListCreated() {
        Assert.assertNotNull(waxOn);

    }

    @Test // waxOn.add(); waxOn.size();waxOn.set(); waxOn.toArray();
    public void testArrayListEmpty() {
        Assert.assertTrue(waxOn.isEmpty());

    }

    @Test
    public void testArrayListAdd() {

        waxOn.add(ae);
        Integer actual = waxOn.size();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testArrayListSet() {
        waxOn.add(ae);
        waxOn.add(a);
        waxOn.add(as);
        waxOn.set(1, amax);
        String actual = waxOn.get(1);
        String expected = "amax";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testArrayListRemove() {
        waxOn.add(ae);
        waxOn.add(a);
        waxOn.add(as);
        waxOn.remove(a);
        Integer sizeexp = 2;
        Integer sizeact = waxOn.size();
        String actual = waxOn.get(1);
        String expected = "as";
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(sizeexp, sizeact);
    }

    @Test
    public void testArrayListClear() {
        waxOn.add(ae);
        waxOn.add(a);
        waxOn.add(as);
        waxOn.clear();
        Integer sizeexp = 0;
        Integer sizeact = waxOn.size();
        Assert.assertEquals(sizeexp, sizeact);
    }



}
