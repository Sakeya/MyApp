package com.cxria.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testadd() throws Exception{
        int res = Utils.instance().add(5, 6);
        assertEquals(9, res);
    }

    @Test
    public void testmore() throws Exception{
        int res = Utils.instance().more(5);
        assertEquals(6, res);
    }

    public void testhello() throws Exception{
        boolean res = CCallNative.instance().hello();
        assertEquals(true, res);
    }
}