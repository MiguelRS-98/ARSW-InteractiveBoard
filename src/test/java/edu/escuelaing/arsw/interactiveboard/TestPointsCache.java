package edu.escuelaing.arsw.interactiveboard;

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * This class test is validate PointsCache.
 * @author Miguel Angel Rodríguez Siachoque
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPointsCache 
{
    /**
     * This method Test 1.
     */
    @BeforeClass
    public static void beforeClassTest () 
    {
        System.out.println("before class test");
    }
    /**
     * This method Test 2.
     */
    @Before
    public void beforeTest () 
    {
        System.out.println("before test");
    }
    /**
     *  This method Test 3.
     */
    @Test
    public void Test3 () 
    {
        PointsCache test3 = PointsCache.getInstance();
        ArrayList<ArrayList<String>> test3Array = new ArrayList<>();
        ArrayList<String> test3Array2 = new ArrayList<>();
        test3Array2.add("1");
        test3Array2.add("2");
        test3Array.add(test3Array2);
        test3.setPositionsArr(test3Array);
        assertEquals(test3.getPositionsArr().get(0).get(0),"1");
    }
    /**
     *  This method Test 4.
     */
    @Test
    public void Test4 () 
    {
        PointsCache test4 = PointsCache.getInstance();
        ArrayList<ArrayList<String>> test4Array = new ArrayList<>();
        ArrayList<String> test4Array2 = new ArrayList<>();
        test4Array2.add("1");
        test4Array2.add("2");
        test4Array.add(test4Array2);
        test4.setPositionsArr(test4Array);
        assertEquals(test4.getPositionsArr().get(0).get(1),"2");
    }
    /**
     *  This method Test 5.
     */
    @After
    public void afterTest () 
    {
        System.out.println("after test");
    }
    /**
     *  This method Test 6.
     */
    @AfterClass
    public static void afterClassTest() {
        System.out.println("after class test");
    }
}