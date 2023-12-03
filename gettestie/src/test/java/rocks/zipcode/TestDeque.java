package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

    String westI;
    String southI;
    String northI;
    String eastI;
    Deque<String > fungus;
    // Tips from The Leuth use https://www.w3schools.com and https://www.baeldung.com for the types of Collections.
 @Before
  public void setup(){ // given
     eastI = "eastI";
     southI = " southI";
     northI = "northI";
     westI = "westI";
     fungus = new ArrayDeque();
 }
 @Test
 public void testDeque(){//when

     Assert.assertNotNull(fungus);//then

 }
@Test
    public void testDequeAdd(){//when
      fungus.add(westI);
     Integer expeted= 1;
        Integer act =fungus.size();
        Assert.assertEquals(expeted,act);//then

    }
    @Test
    public void testDequeAddToTOP(){//when
     fungus.add(eastI);
        fungus.add(westI);
        String expeted= "eastI";
       String act  =fungus.peekFirst();
        Assert.assertEquals(expeted,act);//then

    }

    @Test
    public void testDequeAddTolast(){//when

        fungus.add(westI);
        fungus.addLast(eastI);
        String expeted= "eastI";
        String act  =fungus.peekLast();
        Assert.assertEquals(expeted,act);//then

    }

    @Test
    public void testDequeAddToFrist(){//when

        fungus.add(westI);
        fungus.addFirst(eastI);
        String expeted= "eastI";
        String act  =fungus.peekFirst();
        Assert.assertEquals(expeted,act);//then

    }
    @Test
    public void testDequePullFromBottom(){//when

        fungus.add(westI);
        fungus.add(eastI);
        fungus.add(southI);
        String expeted= " southI";
        String act  =fungus.removeLast();
        Assert.assertEquals(expeted,act);//then

    }

    @Test
    public void testDequePullFromtop(){//when

        fungus.add(westI);
        fungus.add(eastI);
        fungus.add(southI);
        String expeted= "westI";
        String act  =fungus.removeFirst();
        Assert.assertEquals(expeted,act);//then

    }
}
