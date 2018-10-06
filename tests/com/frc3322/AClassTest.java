package com.frc3322;

import org.junit.Test;

import static org.junit.Assert.*;

public class AClassTest {

    @Test
    public void createAObject() {
        AClass aClass = new AClass();
        assertFalse(aClass == null);
    }

    @Test
    public void publicField() {
        AClass a = new AClass();
        assertTrue(a.val == 1);
    }

    @Test
    public void privateField() {
        AClass a = new AClass();
        assertEquals(a.getPrivateVal(), 2);
    }

    @Test
    public void constructor() {
        AClass a = new AClass(5);
        assertTrue(a.getPrivateVal() == 5);

    }

    @Test
    public void classVal() {
        AClass a = new AClass();
        AClass b = new AClass();
        assertTrue(a.classVal == b.classVal);
        assertEquals(AClass.classVal, 3);
        AClass.classVal = 10;
        assertTrue(a.classVal == b.classVal);
    }

    @Test
    public void equalityAndClasses() {
        // string is a class
        String a = new String("Henry");
        String b = "Henry";
        assertFalse(a == b);
        assertTrue(a.equals(b));

        int z = 5;// primitive type
        int w = 5;
        assertTrue(z == w);
        //assertTrue(z.equals(w)); won't compile
    }

    @Test
    public void immutability()
    {
        String a = "Tim"; // all use of a string literal refer to same instance
        String b = a;
        assertTrue(a == b);
        assertTrue(a.equals(b));
        b = new String("Tim");
        // not the same object
        assertFalse(a == b);
        assertTrue(a.equals(b));

    }

    @Test
    public void finalKeyword()
    {
        AClass a = new AClass();
        assertTrue(a.finalVal == 10);
    }

}