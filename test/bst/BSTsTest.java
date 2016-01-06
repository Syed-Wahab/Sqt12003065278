/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SWH
 */
public class BSTsTest {
    
    public BSTsTest() {
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
     * Test of postorder method, of class BSTs.
     */
    @Test
    public void testPostorder() {
        System.out.println("postorder");
        BSTs instance = new BSTs();
        instance.postorder();
      
    }

    /**
     * Test of inorder method, of class BSTs.
     */
    @Test
    public void testInorder() {
        System.out.println("inorder");
        BSTs instance = new BSTs();
        instance.inorder();
        
    }

    /**
     * Test of preorder method, of class BSTs.
     */
    @Test
    public void testPreorder() {
        System.out.println("preorder");
        BSTs instance = new BSTs();
        instance.preorder();
        
    }

    /**
     * Test of isEmpty method, of class BSTs.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BSTs instance = new BSTs();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        instance.insertNode(5);
        result = instance.isEmpty(); //checking two cases
        assertEquals(false, result);
    }

    /**
     * Test of searchNode method, of class BSTs.
     */
    @Test
    public void testSearchNode() {
        System.out.println("searchNode");
        BSTs instance = new BSTs();
        boolean expResult = false;
        boolean result = instance.searchNode(instance.root, expResult);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertNode method, of class BSTs.
     */
    @Test
    public void testInsertNode() {
        System.out.println("insertNode");
        Object data = null;
        BSTs instance = new BSTs();
        int n= 5;
       instance.insertNode(n);
    }

    /**
     * Test of remove method, of class BSTs.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        BSTs instance = new BSTs();
        int n= 5;
        instance.insertNode(n);
        instance.remove(n,instance.root);
    }

    /**
     * Test of findMax method, of class BSTs.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        BSTs instance = new BSTs();
        node expResult = null;
        node result = instance.findMax(null);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteNode method, of class BSTs.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        Object data = null;
        BSTs instance = new BSTs();
        int n=5;
        instance.deleteNode(n);
    }

    /**
     * Test of printBST method, of class BSTs.
     */
    @Test
    public void testPrintBST() {
        System.out.println("printBST");
        BSTs instance = new BSTs();
        instance.printBST();
    }

    /**
     * Test of printfun method, of class BSTs.
     */
    @Test
    public void testPrintfun() {
        System.out.println("printfun");
        BSTs instance = new BSTs();
        instance.printfun(instance.root);
    }
    
}
