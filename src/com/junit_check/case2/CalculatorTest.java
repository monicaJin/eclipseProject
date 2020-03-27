package com.junit_check.case2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    //���� add()����
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        Assert.assertEquals(result, 3);
    }
     
    @Test
    //���� sub()����
    public void testSub(){
        Calculator c = new Calculator();
        int result = c.sub(2, 1);
        Assert.assertEquals(result, 1);
    }
 
}
