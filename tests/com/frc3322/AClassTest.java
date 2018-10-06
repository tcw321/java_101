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

}