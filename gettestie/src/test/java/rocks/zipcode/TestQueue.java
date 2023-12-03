package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

    // Tips from The Leuth use https://www.w3schools.com and https://www.baeldung.com for the types of Collections.
Integer o;
Integer t;
Integer e;
Integer f;
Queue <Integer> queueLinkedList;
Queue <Integer> queuePriorityQueue;

@Before
    public void setUp(){
    queueLinkedList = new LinkedList<Integer>();
    queuePriorityQueue = new PriorityQueue<Integer>();
    o = 1;
    t = 2;
    e = 3;
    f = 4;
    queuePriorityQueue.add(f);  queuePriorityQueue.add(e);  queuePriorityQueue.add(t);
    // 1                             2                         3
    queueLinkedList.add(t); queueLinkedList.add(o); queueLinkedList.add(e);

}

  //** Core Methods
    //
    // offer() – Inserts a new element onto the Queue
    //poll() – Removes an element from the front of the Queue
    //peek() – Inspects the element at the front of the Queue, without removing it
        //
    @Test
    public void testQueuePriorityQueueOffer(){
        queuePriorityQueue.offer(o);
        Integer actual = queuePriorityQueue.size();
       Integer expected = 4;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testQueueLinkedListOffer(){
        queueLinkedList.offer(o);
        Integer actual = queueLinkedList.size();
        Integer expected = 4;
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void testQueuePriorityQueuePoll1(){
        queuePriorityQueue.poll();
        queuePriorityQueue.poll();
        queuePriorityQueue.poll();
        Integer actual = queuePriorityQueue.size();
        Integer expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testQueueLinkedListPoll1(){
        queueLinkedList.poll();
        queueLinkedList.poll();
        queueLinkedList.poll();

        Integer actual = queueLinkedList.size();
        Integer expected = 0;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testQueuePriorityQueuePoll2(){
        queuePriorityQueue.poll();
        Integer actual = queuePriorityQueue.size();
        Integer expected = 2;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testQueueLinkedListPoll2(){
        queueLinkedList.poll();
        Integer actual = queueLinkedList.size();
        Integer expected = 2;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testQueuePriorityQueuePeek(){
        queuePriorityQueue.remove();
        Integer actual = queuePriorityQueue.peek();
        Integer expected = 3;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testQueueLinkedListPeek(){
        queueLinkedList.peek();
        Integer actual = queueLinkedList.peek();
        Integer expected = 2;
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testQueuePriorityQueueClear(){
        queuePriorityQueue.clear();

        Assert.assertNull(queuePriorityQueue.peek());
    }

    @Test
    public void testQueueLinkedListClear(){
        queueLinkedList.clear();
        Assert.assertNull(queueLinkedList.peek());

    }

}
