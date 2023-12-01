package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

public class TestHashSet {
    // Tips from The Leuth use https://www.w3schools.com and https://www.baeldung.com for the types of Collections.

    String westI;
    String southI;
    String northI;
    String eastI;

    HashSet<String> interState;


    @Before
    public void Setup() {
        interState = new HashSet<>();
        eastI = "a";
        southI = "as";
        northI= "ate";
        westI = "append";

    }
@Test
    public void testHashSet(){
    Assert.assertNotNull(interState);
}
    @Test
    public void testHashMapSize(){
        Assert.assertNotNull(interState);
        Assert.assertEquals(0, interState.size());
    }
    @Test
    public void testHashSetadd(){
        Assert.assertNotNull(interState);
        interState.add(southI);

        Assert.assertEquals(1, interState.size());
    }

    @Test
    public void testHashSetRemove(){
        Assert.assertNotNull(interState);
        interState.add(southI);
        interState.remove(southI);

        Assert.assertEquals(0, interState.size());
    }

    @Test
    public void testHashSetContains(){
        Assert.assertNotNull(interState);
        interState.add(southI);
        interState.add(westI);
        interState.add(southI);
        interState.remove(southI);

       Assert.assertTrue( interState.contains(westI));
    }
}
