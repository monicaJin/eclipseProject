package com.junit_check.case1;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

public class JUnitTestCase1 extends TestCase {

	    public JUnitTestCase1(String arg0)
	    {
	        super(arg0);
	    }
	    @Before
	    public void setUp() throws Exception {
	        super.setUp() ;
	    }
	    public void testDeposit(){
	        Account account=new Account();
	       // assertEquals("Account should start with no funds.",1,account.balance());
		    assertEquals("Account should start with no funds.",0,account.balance());
	        
	        account.deposit(5);
	        assertEquals("Account should reflect deposit.", 5, account.balance());
	    }

	    public void testwithdraw(){
	        Account account=new Account();
	        account.deposit(5);
	        account.withdraw(3);
	        assertEquals("Account should reflect withdarw.", 3, account.balance());
	    }
	    
	    @After
	    public void tearDown() throws Exception {
	        super.tearDown();
	    }
	}

