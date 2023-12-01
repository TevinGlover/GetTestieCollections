package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods...
    @Test
    public void testIfStackPop(){
        Stack<String> stack = new Stack<>(); //give
        stack.push("fart");
        stack.push("art");
        stack.push("far");

        stack.pop();// when
      Integer actual =  stack.size();
      Integer expected =  2 ;
        Assert.assertEquals( expected, actual );//then
    }
    @Test
    public void testIfStackSize(){
        Stack<String> stack = new Stack<>(); //give
        stack.push("fart");
        stack.push("art");
        stack.push("far");

        stack.size();// when
        Integer actual =  stack.size();
        Integer expected =  3 ;
        Assert.assertEquals( expected, actual );//then
    }
    @Test
    public void testIfStackSet(){
        Stack<String> stack = new Stack<>(); //give
        stack.push("fart");//2
        stack.push("art"); //1
        stack.push("far");// 0

        stack.set(2,"free");// when
       String actual =  stack.peek();
        String expected =  "free" ;
        Assert.assertEquals( expected, actual );//then
    }
    /**
     * Tips from The Leuth use https://www.w3schools.com and https://www.baeldung.com for the types of Collections.
     * So 12 Test in all, make sure you use the methods that most commonly describe why the data structure exists;
    * e.g. for Stack be sure to use pop, push, peek and isEmpty.
*/


}
