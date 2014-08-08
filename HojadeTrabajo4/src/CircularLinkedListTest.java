/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samuel
 */
public class CircularLinkedListTest {
    
    public CircularLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addFirst method, of class CircularLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        CircularLinkedList instance = new CircularLinkedList();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class CircularLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        CircularLinkedList instance = new CircularLinkedList();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class CircularLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        CircularLinkedList instance = new CircularLinkedList();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class CircularLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        CircularLinkedList instance = new CircularLinkedList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class CircularLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        CircularLinkedList instance = new CircularLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
