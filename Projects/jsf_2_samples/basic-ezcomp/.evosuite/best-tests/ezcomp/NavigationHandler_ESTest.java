/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 17:28:42 GMT 2019
 */

package ezcomp;

import org.junit.Test;
import static org.junit.Assert.*;
import ezcomp.NavigationHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NavigationHandler_ESTest extends NavigationHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NavigationHandler navigationHandler0 = new NavigationHandler();
      navigationHandler0.setTarget((String) null);
      String string0 = navigationHandler0.goNav();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NavigationHandler navigationHandler0 = new NavigationHandler();
      navigationHandler0.setTarget("");
      String string0 = navigationHandler0.goNav();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NavigationHandler navigationHandler0 = new NavigationHandler();
      navigationHandler0.setTarget((String) null);
      String string0 = navigationHandler0.getTarget();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NavigationHandler navigationHandler0 = new NavigationHandler();
      navigationHandler0.setTarget("");
      String string0 = navigationHandler0.getTarget();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NavigationHandler navigationHandler0 = new NavigationHandler();
      String string0 = navigationHandler0.goNav2();
      assertEquals("nav2", string0);
      assertEquals("index", navigationHandler0.goNav());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NavigationHandler navigationHandler0 = new NavigationHandler();
      String string0 = navigationHandler0.goNav();
      assertEquals("index", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NavigationHandler navigationHandler0 = new NavigationHandler();
      String string0 = navigationHandler0.getTarget();
      assertEquals("index", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NavigationHandler navigationHandler0 = new NavigationHandler();
      String string0 = navigationHandler0.goNav1();
      assertEquals("nav1", string0);
      assertEquals("index", navigationHandler0.getTarget());
  }
}
