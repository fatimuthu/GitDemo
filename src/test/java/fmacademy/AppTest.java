package fmacademy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        System.out.println("test1 from US");
        
        //from india update:
        System.out.println("test2 from India");
        //new update from US and from develp branch
        System.out.println("test3 from US develop branch");
      //new update from India and from develp branch
        System.out.println("test4 from US develop branch");
    }
    
    

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
