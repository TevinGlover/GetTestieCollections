package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {
    // Tips from The Leuth use https://www.w3schools.com and https://www.baeldung.com for the types of Collections.

        String westI;
        String southI;
        String northI;
        String eastI;
        Integer nine;
        Integer four;
        Integer  two;
        Integer six;
        HashMap<String,Integer> interState;


        @Before
        public void Setup() {
            interState = new HashMap<>();
            eastI = "a";
            southI = "as";
            northI= "ate";
            westI = "append";
            nine = 95;
            four = 400;
            two =273;
            six = 69;

        }
        @Test
        public void testHashMap(){
            Assert.assertNotNull(interState);
        }
        @Test
        public void testHashMapSize(){
            Assert.assertNotNull(interState);
            Assert.assertEquals(0, interState.size());
        }
        @Test
        public void testHashMapPut(){
            Assert.assertNotNull(interState);
            interState.put(southI,six);

            Assert.assertEquals(1, interState.size());
        }

        @Test
        public void testHashMapRemove(){
            Assert.assertNotNull(interState);
            interState.put(southI,six);
            interState.remove(southI,six);

            Assert.assertEquals(0, interState.size());
        }

        @Test
        public void testHashMapContains(){
            Assert.assertNotNull(interState);
            interState.put(southI,six);
            interState.put(westI,nine);
            interState.put(southI,six);
            interState.remove(southI,six);

            Assert.assertTrue( interState.containsKey(westI));
        }
        @Test
        public void testHashMapGet(){
            Assert.assertNotNull(interState);
            interState.put(southI,six);
            interState.put(westI,nine);
            interState.put(eastI,four);
            Integer expect = four;

            Assert.assertEquals( expect, interState.get(eastI));
        }
}
