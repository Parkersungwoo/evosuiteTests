/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 17:35:10 GMT 2019
 */

package guessnumber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import guessnumber.ClientSideValidator;
import javax.faces.component.UIColumn;
import javax.faces.context.FacesContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClientSideValidator_ESTest extends ClientSideValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      Integer integer0 = new Integer(1);
      clientSideValidator0.setMinimum(integer0);
      Integer integer1 = clientSideValidator0.getMinimum();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      Integer integer0 = new Integer((-6747));
      clientSideValidator0.setMinimum(integer0);
      Integer integer1 = clientSideValidator0.getMinimum();
      assertEquals((-6747), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      Integer integer0 = new Integer(1);
      clientSideValidator0.setMaximum(integer0);
      Integer integer1 = clientSideValidator0.getMaximum();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      Integer integer0 = Integer.valueOf((-1222));
      clientSideValidator0.setMaximum(integer0);
      Integer integer1 = clientSideValidator0.getMaximum();
      assertEquals((-1222), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      Integer integer0 = new Integer((-324));
      clientSideValidator0.setMaximum(integer0);
      Integer integer1 = clientSideValidator0.getMaximum();
      assertEquals((-324), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      // Undeclared exception!
      try { 
        clientSideValidator0.setMinimum((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("guessnumber.ClientSideValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      // Undeclared exception!
      try { 
        clientSideValidator0.setMaximum((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("guessnumber.ClientSideValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      UIColumn uIColumn0 = new UIColumn();
      // Undeclared exception!
      try { 
        clientSideValidator0.validate((FacesContext) null, uIColumn0, uIColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("guessnumber.ClientSideValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      Integer integer0 = clientSideValidator0.getMinimum();
      assertEquals(0, (int)integer0);
      
      clientSideValidator0.setMaximum(integer0);
      assertEquals(0, (int)clientSideValidator0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClientSideValidator clientSideValidator0 = new ClientSideValidator();
      Integer integer0 = clientSideValidator0.getMaximum();
      assertEquals(0, (int)integer0);
      
      clientSideValidator0.setMinimum(integer0);
      assertEquals(0, (int)clientSideValidator0.getMinimum());
  }
}
